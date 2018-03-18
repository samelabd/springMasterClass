package com.timbuchalka.springdemo;

public class OrganizationFactory {
	public Organization getInstance(String companyName, int yearOfIncorporation) {
		System.out.println("ogrnization's facotry getInstance called........................");

		return new Organization(companyName, yearOfIncorporation);
	}
}
