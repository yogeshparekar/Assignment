package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value="hi",method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("I Came Here..!");
		
		//logic.
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display1.jsp");
		return mav;
	}
	 //Login Using get method 
	@RequestMapping(value="login",method = RequestMethod.GET)
	public ModelAndView openLoginPage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("login.jsp");
		return mav;
}
	//Using post method
	@RequestMapping(value="checkUser",method = RequestMethod.POST)
	public ModelAndView checkUser(HttpServletRequest req) {
		
		String user = req.getParameter("user");
		String pass = req.getParameter("pass");
		ModelAndView mav = new ModelAndView();
		if(user.equals("Yogesh") && pass.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
	
		return mav;
}
}