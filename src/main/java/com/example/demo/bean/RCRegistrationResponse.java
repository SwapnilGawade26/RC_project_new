package com.example.demo.bean;

public class RCRegistrationResponse {

	

	private String rCNo;

	private String ownerName;

	private String city;

	private String companyName;
	private String model;

	
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

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

}
