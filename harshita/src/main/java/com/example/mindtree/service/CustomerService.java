package com.example.mindtree.service;

import java.util.List;

import com.example.mindtree.dto.CustomerDto;
import com.example.mindtree.entity.Customer;

public interface CustomerService {

	public void addcustomer(Customer customer);

	public List getallcustomers();

}
