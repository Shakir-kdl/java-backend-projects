package com.ola.booking.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ola.request.controller.BookingRequest;

@Controller
public class BookingController {
	@GetMapping("viewBooking")
	public String displayBookingPage() {
		System.out.println("BookingController.displayBookingPage()");
		return "booking";
	}

	@PostMapping("bookMyRide")
	public String doBooking(@ModelAttribute BookingRequest bookingRequest, Model model) {
		System.out.println("BookingController.doBooking()..........");
		String source = bookingRequest.getSource();
		String destination = bookingRequest.getDestination();
		String type = bookingRequest.getType();
		System.out.println("Request Received: [" + source + " " + destination + " " + type + "]");

		String bookingCode = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();
		System.out.println("bookingCode :" + bookingCode);
		model.addAttribute("bookingConfirmationCode", bookingCode);
		return "bookingConfirmation";
	}
}
