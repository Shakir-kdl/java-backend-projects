package com.rapido.signup.controller;

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

	@RequestMapping(value = "/viewSignup", method = RequestMethod.POST)
	public ModelAndView doSignup(@RequestParam("mobile") String mobile, @RequestParam("email") String email,
			@RequestParam("name") String name) {
		System.out.println("SignupController.doSignup()");
		System.out.println(
				"Received data from client/browser as part of from submission: " + mobile + " " + email + " " + name);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("confirmation");
		return mv;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView displayLoginPage() {
		System.out.println("SignupController.displayLoginPage()");


		ModelAndView mv = new ModelAndView();
		mv.setViewName("login");
		return mv;

	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ModelAndView doLogin(@RequestParam("mobile") String mobile, @RequestParam("email") String email) {
		System.out.println("SignupController.doLogin()");
		System.out.println(
				"Received data from client/browser as part of from submission: " + mobile + " " + email);

		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		return mv;

	}
}
