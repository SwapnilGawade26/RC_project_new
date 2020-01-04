package com.example.demo;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.RCRegistration;
import com.example.demo.model.vehicalType;
import com.example.demo.repository.RCRepository;
import com.example.demo.repository.VehicalTypeRepository;

@SpringBootApplication
public class RcRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RcRegistrationApplication.class, args);
	}

	@Autowired
	VehicalTypeRepository VehicalTypeRepository;
	
	@Autowired
	RCRepository RCRepository;
	
	@PostConstruct
	public void addVehicalType()
	{
		vehicalType xl6=new vehicalType("Maruti","XL6");
		vehicalType nexon=new vehicalType("Tata","Nexon");
		vehicalType venue=new vehicalType("Hundai","Venue");
		VehicalTypeRepository.save(xl6);
		VehicalTypeRepository.save(nexon);
		VehicalTypeRepository.save(venue);
		
		
		RCRegistration mh42142020=new RCRegistration("mh42142020", "Swap", "BMT", new Date(), xl6, "Nexa Blue");
		RCRegistration mh12142020=new RCRegistration("mh12142020", "Sam", "PUNE", new Date(), nexon, "Light Gray");
		RCRegistration mh11142020=new RCRegistration("mh11142020", "Raj", "SATARA", new Date(), xl6, "White");

		RCRepository.save(mh42142020);
		RCRepository.save(mh12142020);
		RCRepository.save(mh11142020);
		
		
	}
	
}
