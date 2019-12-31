package com.example.mindtree.dto;

import com.fasterxml.jackson.annotation.JsonBackReference;

public class CustomerDto {
	private int customerId;
	private String customerName;
	private int phoneNumber;
	@JsonBackReference
	private ComboDto combo;

	public CustomerDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CustomerDto(int customerId, String customerName, int phoneNumber, ComboDto combo) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNumber = phoneNumber;
		this.combo = combo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ComboDto getCombo() {
		return combo;
	}

	public void setCombo(ComboDto combo) {
		this.combo = combo;
	}

	@Override
	public String toString() {
		return "CustomerDto [customerId=" + customerId + ", customerName=" + customerName + ", phoneNumber="
				+ phoneNumber + ", combo=" + combo + "]";
	}

}
