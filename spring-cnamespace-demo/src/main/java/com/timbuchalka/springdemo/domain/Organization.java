package com.timbuchalka.springdemo.domain;

public class Organization {

	private String companyName;
	private int yearOfIncorporation;

	private Address adress;

	public Organization(String companyName, int yearOfIncorporation, Address adress) {
		super();
		this.companyName = companyName;
		this.yearOfIncorporation = yearOfIncorporation;
		this.adress = adress;
	}

	
	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + ", adress="
				+ adress + "]";
	}

}
