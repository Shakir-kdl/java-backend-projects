package com.kodewala.status.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {
	@RequestMapping("knowStatus/{id}/{name}/{age}/{address}")
	public String displayStatusPage(@PathVariable("id") int id, @PathVariable("name") String name,
			@PathVariable("age") int age, @PathVariable("address") String address, Model model) {
		System.out.println("StatusController.displayStatusPage()...");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: : " + age);
		System.out.println("Address: " + address);
		model.addAttribute("statusId", id);
		model.addAttribute("statusName", name);
		model.addAttribute("statusAge", age);
		model.addAttribute("statusAddress", address);

		return "statusPage";
	}
}
