package com.example.mindtree.serviceimpl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import org.hibernate.service.spi.ServiceException;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mindtree.dto.CustomerDto;
import com.example.mindtree.entity.Customer;
import com.example.mindtree.repository.CustomerRepository;
import com.example.mindtree.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerrepo;

	@Override
	public void addcustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerrepo.save(customer);

	}

	@Override
	public List getallcustomers() {
		// TODO Auto-generated method stub
		List<Customer> listofcustomers = customerrepo.findAll();
		return listofcustomers;

	}

}
