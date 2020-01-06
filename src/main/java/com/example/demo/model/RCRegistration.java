package com.example.demo.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class RCRegistration {

	@Id
	@GeneratedValue
	private Long id;
	
	private String rCNo;
	
	private String ownerName;
	
	private String city;
	
	private Date registrationDate;
	
	@OneToOne
	private vehicalType vehicalType;
	
	private String color;


	public RCRegistration(Long id, String rCNo, String ownerName, String city, Date registrationDate,
			com.example.demo.model.vehicalType vehicalType, String color) {
		super();
		this.id = id;
		this.rCNo = rCNo;
		this.ownerName = ownerName;
		this.city = city;
		this.registrationDate = registrationDate;
		this.vehicalType = vehicalType;
		this.color = color;
	}

	
	public RCRegistration() {}
	public RCRegistration(String rCNo, String ownerName, String city, Date registrationDate,
			com.example.demo.model.vehicalType vehicalType, String color) {
		super();
		this.rCNo = rCNo;
		this.ownerName = ownerName;
		this.city = city;
		this.registrationDate = registrationDate;
		this.vehicalType = vehicalType;
		this.color = color;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getrCNo() {
		return rCNo;
	}

	public void setrCNo(String rCNo) {
		this.rCNo = rCNo;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	

	public Date getRegistrationDate() {
		return registrationDate;
	}



	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}



	public vehicalType getVehicalType() {
		return vehicalType;
	}

	public void setVehicalType(vehicalType vehicalType) {
		this.vehicalType = vehicalType;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	
}
