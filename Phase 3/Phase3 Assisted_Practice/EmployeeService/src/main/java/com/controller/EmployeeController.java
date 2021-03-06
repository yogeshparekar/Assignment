package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("employee")
public class EmployeeController {

	@GetMapping(value = "/getInfo")
	public String getCustomerInfo() {
		return "Welcome to Simple Employee Controller ";
}
	@GetMapping(value = "/customerInfo")
	public String callCustomerMicroService() {
		String result = restTemplate.getForObject("http://localhost:8181/customer/getInfo", String.class);
				return result;
	}
	@Autowired
	RestTemplate restTemplate;
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}