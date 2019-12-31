package com.example.mindtree.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.mindtree.entity.Customer;
import com.fasterxml.jackson.annotation.JsonManagedReference;

public class ComboDto {

	private int comboId;
	private String comboName;
	private String duration;
	private String foodavailability;
	private int cost;
	@JsonManagedReference
	List<CustomerDto> customers;

	public ComboDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ComboDto(int comboId, String comboName, String duration, String foodavailability, int cost,
			List<CustomerDto> customers) {
		super();
		this.comboId = comboId;
		this.comboName = comboName;
		this.duration = duration;
		this.foodavailability = foodavailability;
		this.cost = cost;
		this.customers = customers;
	}

	public int getComboId() {
		return comboId;
	}

	public void setComboId(int comboId) {
		this.comboId = comboId;
	}

	public String getComboName() {
		return comboName;
	}

	public void setComboName(String comboName) {
		this.comboName = comboName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getFoodavailability() {
		return foodavailability;
	}

	public void setFoodavailability(String foodavailability) {
		this.foodavailability = foodavailability;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public List<CustomerDto> getCustomers() {
		return customers;
	}

	public void setCustomers(List<CustomerDto> customers) {
		this.customers = customers;
	}

	@Override
	public String toString() {
		return "ComboDto [comboId=" + comboId + ", comboName=" + comboName + ", duration=" + duration
				+ ", foodavailability=" + foodavailability + ", cost=" + cost + ", customers=" + customers + "]";
	}

}
