package com.kodewala.status.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {
	@RequestMapping("/knowStatus/{id}")
	public String status(@PathVariable("id") int id) {
		System.out.println("StatusController.status()  .. id is received as a path variable: " + id);
		return "statusPage";

	}

}

