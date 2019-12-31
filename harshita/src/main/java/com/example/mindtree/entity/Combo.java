package com.example.mindtree.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Combo {
	@Id
	private int comboId;
	private String comboName;
	private int duration;
	private String foodavailability;
	private int cost;
	@OneToMany(mappedBy = "combo", cascade = CascadeType.ALL)
	List<Customer> customers;
	public Combo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Combo(int comboId, String comboName, int duration, String foodavailability, int cost,
			List<Customer> customers) {
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
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
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
	public List<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	@Override
	public String toString() {
		return "Combo [comboId=" + comboId + ", comboName=" + comboName + ", duration=" + duration
				+ ", foodavailability=" + foodavailability + ", cost=" + cost + ", customers=" + customers + "]";
	}
}
