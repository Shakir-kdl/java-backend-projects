package com.rapido.booking.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.rapido.request.controller.RequestController;

@Controller
public class BookingController {

	@GetMapping("viewBooking")
	public String displayBooking() {
		System.out.println("BookingController.displayBooking()");
		return "booking";
	}

	@PostMapping("bookMyRide")
	public String booking(@ModelAttribute RequestController requestController, Model model) {
		System.out.println("BookingController.doBooking()......................");
		String source = requestController.getSource();
		String destination = requestController.getDestination();
		String type = requestController.getType();
		System.out.println("Request Received :[ " + source + " " + destination + " " + type + " ]");

		String bookingCode = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();
		System.out.println("Your Booking code is: " + bookingCode);
		model.addAttribute("bookingConfirmationCode", bookingCode);
		return "confirmation";
	}
}
