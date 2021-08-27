package com.FitnessCenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("controller")
public class FitnessCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(FitnessCenterApplication.class, args);
	}

}
