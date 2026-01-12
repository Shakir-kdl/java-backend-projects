package com.kodewala.pathvar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StatusController {
@RequestMapping("knowStatus/{name}")
public String diplayStatus(@PathVariable("name")String name,Model model) {
	System.out.println("StatusController.diplayStatus()");
	System.out.println("name :"+name);
	model.addAttribute("statusName", name);
	return "status";
}
}
