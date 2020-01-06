package com.example.demo.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.bean.RCRegistrationResponse;
import com.example.demo.model.RCRegistration;
import com.example.demo.repository.RCRepository;

@Service
public class RCservice {

	@Autowired
	RCRepository rcRepository;

	public RCRegistration findByRcNo(String rcNo) {
		// TODO Auto-generated method stub
		return rcRepository.findByrCNoIgnoreCase(rcNo);
	}

	public RCRegistrationResponse findByOwnerName(String ownerName) {
		// TODO Auto-generated method stub
		RCRegistration rcReg= rcRepository.findByOwnerNameIgnoreCase(ownerName);
		ModelMapper modelMapper=new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.LOOSE);
		RCRegistrationResponse rcResponse=modelMapper.map(rcReg, RCRegistrationResponse.class);
		return rcResponse;
		
	}
	
	
}
