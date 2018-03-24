package com.timbuchalka.springdemo.domain;

public class Organization {

	private String companyName;
	private int yearOfIncorporation;

	private Address adress;

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setYearOfIncorporation(int yearOfIncorporation) {
		this.yearOfIncorporation = yearOfIncorporation;
	}

	public void setAdress(Address adress) {
		this.adress = adress;
	}

	@Override
	public String toString() {
		return "Organization [companyName=" + companyName + ", yearOfIncorporation=" + yearOfIncorporation + ", adress="
				+ adress + "]";
	}

}
