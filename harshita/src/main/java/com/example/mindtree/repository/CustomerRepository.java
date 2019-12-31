package com.example.mindtree.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mindtree.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
