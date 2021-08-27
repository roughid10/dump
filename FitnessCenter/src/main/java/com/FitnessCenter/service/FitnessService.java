package com.FitnessCenter.service;


import org.springframework.stereotype.Service;

import com.FitnessCenter.model.FitnessCenter;


@Service
public class FitnessService {
	
	
	public double calculateTotalCost(FitnessCenter fitnessCenter) {
		double cost = 0.0;
		// fill the code
		String serviceName = fitnessCenter.getPreferredPackage();
		int months = fitnessCenter.getNumberOfMonths();
		if(serviceName.equals("Aerobics"))
		{
			cost = months*1500.0;
		}
		else if(serviceName.equals("Zumba"))
		{
			cost = months*1750.0;
		}
		else if(serviceName.equals("RegularGYM"))
		{
			cost = months*1250.0;
		}
		else if(serviceName.equals("PersonalTraining"))
		{
			cost = months*2500.0;
		}
		else if(serviceName.equals("Yoga"))
		{
			cost = months*1300.0;
		}
		
		return cost;
		
		
	}
}
