package com.flipkart.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SignupController {
	@RequestMapping(value = "/viewSignup", method = RequestMethod.GET)
	public ModelAndView displaySignupPage() {
		System.out.println("SignupController.displaySignupPage()");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("signup");
		return mv;
	}

	@RequestMapping("/signup")
	public ModelAndView dosignup(@RequestParam("name") String name, @RequestParam("mobile") String mobile,
			@RequestParam("email") String email) {
		System.out.println("SignupController.dosignup()");
		System.out.println("Request Received From Client/Browser :" + name + " " + email + " " + name);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirmation");
		return mv;
	}
}
