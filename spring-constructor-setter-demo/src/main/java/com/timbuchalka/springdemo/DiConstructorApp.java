package com.timbuchalka.springdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.timbuchalka.springdemo.domain.HumanResourcesDept;
import com.timbuchalka.springdemo.domain.Organization;

public class DiConstructorApp {

	public static void main(String[] args) {
		// create the application context
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-cp.xml");

		// create the bean
		Organization org = (Organization) ctx.getBean("myorg");

		// invoke the company slogan via the bean
		System.out.println(org.corporateSlogan());

		// print organization details
//		System.out.println(org);
		
//		System.out.println(org.corporateService());
		HumanResourcesDept hrdept = (HumanResourcesDept) ctx.getBean("myhrdept");
		System.out.println(hrdept.hiringStatus(5500));

		// close the application context ( container )
		((ClassPathXmlApplicationContext) ctx).close();

	}

}
