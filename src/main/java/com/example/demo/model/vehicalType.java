package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class vehicalType {

	@Id
	@GeneratedValue
	private Long id;
	
	private String companyName;
	
	private String model;
	
	
	public vehicalType() {}
	public vehicalType(String companyName, String model) {
		super();
		
		this.companyName = companyName;
		this.model = model;
	}

	@Override
	public String toString() {
		return "vehicalType [ companyName=" + companyName + ", model=" + model + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
