package com.timbuchalka.springdemo.serviceimpl;

import java.util.Random;

import com.timbuchalka.springdemo.service.RecruitmentService;

public class AgencyRecruitmentServiceImpl implements RecruitmentService {

	public String recruitEmployees(String companyName, String departamentName, int numberOfRecruitments) {
		Random random = new Random();

		String hiringFacts = "\n" + companyName + "'s " + departamentName + " hired "
				+ random.nextInt(numberOfRecruitments) + " employees using various hiring agencies.";

		return hiringFacts;
	}

}
