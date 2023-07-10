package com.example.ems.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.ems.model.Customer_details;
import com.example.ems.service.CustomerService;

@Controller
public class PageController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/")
	public String page()
	{
		return "page";
		
	}
	@RequestMapping("/customer_register")
	public String customer_register()
	{
		return "customer_register";
		
	}
	@RequestMapping("/customer_signin")
	public String customer_signin()
	{
		return "customer_signin";
	}	
	@PostMapping("/createuser")
	public String createuser(@ModelAttribute Customer_details details,RedirectAttributes redirAttrs)
	{
//		System.out.println(details.getAge());
		Customer_details cs=customerService.createuser(details);
		if(cs!=null) {
			redirAttrs.addFlashAttribute("Registration successful");
			System.out.println("Success");
		}
		else {
			System.out.println("something wrong on server");
		}
		return "redirect:/customer_signin";
	}
	
}
