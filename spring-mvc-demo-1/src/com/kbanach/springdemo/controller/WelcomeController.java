package com.kbanach.springdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kbanach.service.demo.WelcomeService;

@Controller
public class WelcomeController {
	
	@RequestMapping("/")
	public String doWelcome(Model model) {
		
		// 1. retrieving the process data
		WelcomeService welcomeService = new WelcomeService();
		List<String> welcomeMessage = welcomeService.getWelcomeMessage("Krystian");
		
		// 2. add data to the model
		model.addAttribute("myWelcomeMessage", welcomeMessage);
		
		// 3. return the logical view name
		return "welcomeNew";
	}
}
