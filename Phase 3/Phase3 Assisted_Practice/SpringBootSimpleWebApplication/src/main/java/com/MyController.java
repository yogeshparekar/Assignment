package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping(value = "/")
	public String sayHello() {
		System.out.println("I Came Here");
		return "index";
	}
	@RequestMapping(value = "/open")
	public String openPage() {
		
		return "login";

	}
	@RequestMapping(value = "/checkuser")
	public String checkUser(@RequestParam("user") String user, @RequestParam("pass") String pass) {
	if (user.equals("Yogesh") && pass.equals("123")) {
		return "success";
	}else {
		return "failure";
	}
	}
	
}