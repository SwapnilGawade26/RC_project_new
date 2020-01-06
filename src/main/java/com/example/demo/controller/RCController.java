package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bean.RCRegistrationResponse;
import com.example.demo.model.RCRegistration;
import com.example.demo.service.RCservice;

@RestController
@RequestMapping( "/rc")
public class RCController {

	@Autowired
	RCservice RCservice;

	@GetMapping("/test")
	public String getRCDetails() {

		return "hii";

	}
	
	@GetMapping("/{rCNo}")
	public RCRegistration getRCDetailsByRCNo(@PathVariable(name="rCNo")String rCNo) {

		return RCservice.findByRcNo(rCNo);

	}
	
	
	
	@GetMapping("/")
	public ResponseEntity getRCDetailsByName(@RequestParam(name="ownerName")String ownerName) {

		RCRegistrationResponse rcreg=  RCservice.findByOwnerName(ownerName);
		
		return new ResponseEntity(rcreg,HttpStatus.OK);

	}
	/*
	 * @GetMapping("/{rCNo}") public RCRegistration
	 * getRCDetails(@PathVariable(name="rCNo")String rCNo) {
	 * 
	 * return RCservice.findByRcNo(rCNo);
	 * 
	 * }
	 */
}
