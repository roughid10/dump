package com.FitnessCenter.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.FitnessCenter.model.FitnessCenter;
import com.FitnessCenter.service.FitnessService;



@Controller
public class FitnessController {
	
	@Autowired
	private FitnessService fitnessService;
	
	@ModelAttribute("snapList")
	 public List<String> populateFitnessCenter() {
		 List<String> services = new ArrayList<>();
		 services.add("Aerobics");
		 services.add("Zumba");
		 services.add("RegularGYM");
		 services.add("PersonalTraining");
		 services.add("Yoga");
		 return services;
	 }
	@GetMapping("/snapEnquiryPage")
	 public String snapEnquiryPage(@ModelAttribute("fitnessCenter") FitnessCenter fitnessCenter){
		 return "snapEnquiryPage";
	 }
	@PostMapping("/snapEstimation")
	public String calculatePackageCost(@Valid @ModelAttribute("fitnessCenter") FitnessCenter fitnessCenter, 
			BindingResult result,ModelMap model) {
		//fill the code
		if(result.hasErrors()){
			return "snapEnquiryPage";
		}
		model.addAttribute("cost",fitnessService.calculateTotalCost(fitnessCenter));
		return "snapEstimation";
		
	} 

}
