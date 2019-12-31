package com.example.mindtree.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Season {
	@Id

	private int seasonId;
	private String seasonName;
	private float cost;

	public Season() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Season(int seasonId, String seasonName, float cost) {
		super();
		this.seasonId = seasonId;
		this.seasonName = seasonName;
		this.cost = cost;
	}

	public int getSeasonId() {
		return seasonId;
	}

	public void setSeasonId(int seasonId) {
		this.seasonId = seasonId;
	}

	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Season [seasonId=" + seasonId + ", seasonName=" + seasonName + ", cost=" + cost + "]";
	}

}