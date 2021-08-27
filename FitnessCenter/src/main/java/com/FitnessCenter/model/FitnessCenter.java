package com.FitnessCenter.model;

import javax.validation.constraints.Positive;

//POJO class with attributes,getters,setters
public class FitnessCenter {

	private String preferredPackage;
	
//	@Positive(message="{error.costPerMonth.positive}")
	private double costPerMonth;
	private int numberOfMonths;
	public String getPreferredPackage() {
		return preferredPackage;
	}
	public void setPreferredPackage(String preferredPackage) {
		this.preferredPackage = preferredPackage;
	}
	public double getCostPerMonth() {
		return costPerMonth;
	}
	public void setCostPerMonth(double costPerMonth) {
		this.costPerMonth = costPerMonth;
	}
	public int getNumberOfMonths() {
		return numberOfMonths;
	}
	public void setNumberOfMonths(int numberOfMonths) {
		this.numberOfMonths = numberOfMonths;
	}
	
	
	
	
}
