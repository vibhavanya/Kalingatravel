package com.example.mindtree.serviceimpl;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mindtree.entity.Combo;
import com.example.mindtree.repository.ComboRepository;
import com.example.mindtree.service.ComboService;

@Service
public class ComboServiceImpl implements ComboService {

	@Autowired
	ComboRepository comborepo;

	// @Override
	// public void comboadding(Combo combo) {
	// TODO Auto-generated method stub
	// comborepo.save(combo);
	// }
	@Override
	public void addcombo(Combo combo) {
		// TODO Auto-generated method stub
		comborepo.save(combo);

	}

	@Override
	public List getallcombos() {
		// TODO Auto-generated method stub
		List combos = new ArrayList();
		Iterable combosIterable = comborepo.findAll();
		Iterator combosIterator = combosIterable.iterator();
		while (combosIterator.hasNext()) {
			combos.add(combosIterator.next());
		}
		return combos;
	}

//	@Override
//	public String updatecombo(int comboId) {
//		 TODO Auto-generated method stub
//		return null;
//	}
	@Override
	public void updatecombo(Combo combo) {
		// TODO Auto-generated method stub
		comborepo.save(combo);
	}

	@Override
	public Combo getCombo(int comboId) {
		// TODO Auto-generated method stub
		return comborepo.getOne(comboId);
	}

//	@Override
//	public List<Combo> getCombowithduration() {
//		// TODO Auto-generated method stub
//		List<Combo> combos = comborepo.findAll();
//		List<Combo> newcombo = new ArrayList<Combo>();
//
//		List<Combo> sortedList = combos.stream().sorted(Comparator.comparingInt(Combo::getDuration))
//				.collect(Collectors.toList());
//
//		sortedList.forEach(System.out::println);
//
//		return sortedList;
//	}

}
