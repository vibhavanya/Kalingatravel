package com.example.mindtree.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.mindtree.dto.CustomerDto;
import com.example.mindtree.entity.Combo;
import com.example.mindtree.entity.Customer;
import com.example.mindtree.service.ComboService;
import com.example.mindtree.service.CustomerService;
import com.example.mindtree.service.SeasonService;

import net.bytebuddy.asm.Advice.This;

@Controller
@CrossOrigin
public class ComboController {

	@Autowired
	ComboService comboService;

	@Autowired
	CustomerService customerService;

	@Autowired
	SeasonService seasonService;

	@GetMapping("/addcustomerform")
	public String getcstmrform() {
		return "addcustomer";
	}

	@GetMapping("/addcomboform")
	public String getcomboform() {
		return "addcombo";
	}

	@RequestMapping("/")
	public String index() {
		return "homepage";
	}

	@RequestMapping(value = "/getCombo/{comboId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Combo getComboById(@PathVariable int comboId) {
		return comboService.getCombo(comboId);
	}

	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addEmployee(@ModelAttribute("customer") Customer customer) {

		System.out.println(customer);
		customerService.addcustomer(customer);

		return "successadd";

	}

	@RequestMapping(value = "/addcombo", method = RequestMethod.POST, headers = "Accept=application/json")
	public String addCombo(@ModelAttribute("combo") Combo combo) {
		System.out.println(combo);
		comboService.addcombo(combo);
		return "successadd";

	}

	@RequestMapping(value = "/Listofcombos", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCombos(Model model) {
		List<Combo> listofcombos = comboService.getallcombos();
		for (Combo c : listofcombos) {
			System.out.println(c);
		}
		model.addAttribute("combo", new Combo());
		model.addAttribute("listofcombos", listofcombos);

		return "getallcombos";

	}

	@RequestMapping(value = "/Listofcustomers", method = RequestMethod.GET, headers = "Accept=application/json")
	public String getCustomers(Model model) {
		List<Customer> listofcustomers = customerService.getallcustomers();
		for (Customer c : listofcustomers) {
			System.out.println(c);
		}

		model.addAttribute("customer", new Customer());
		model.addAttribute("listofCustomers", listofcustomers);

		return "getallcustomers";

	}

	@RequestMapping(value = "/updatecombo/{comboId}", method = RequestMethod.GET, headers = "Accept=application/json")
	public String updatecombo(@PathVariable("comboId") int comboId, Model model) {
		model.addAttribute("combo", this.comboService.getCombo(comboId));
		model.addAttribute("listofcombos", this.comboService.getallcombos());

		return "addcombo";

	}

//	@RequestMapping(value = "/duration", method = RequestMethod.GET, headers = "Accept=application/json")
//	public String getCombowithduration(Model model) {
//		List<Combo> combos = comboService.getCombowithduration();
//		for (Combo c : combos) {
//			System.out.println(c);
//		}
//
//		model.addAttribute("combo", new Combo());
//		model.addAttribute("listofCombos", combos);
//
//		return "getallcombos";
//
//	}

}

