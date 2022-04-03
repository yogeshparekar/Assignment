package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@GetMapping(value="/getInfo")
	public String getCustomerInfo() {
		return "Welcome to Simple Customer Controller ";
	}
}
