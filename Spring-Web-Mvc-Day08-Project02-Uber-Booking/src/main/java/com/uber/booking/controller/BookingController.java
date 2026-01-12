package com.uber.booking.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.uber.request.controller.BookingRequest;

@Controller
public class BookingController {
	@GetMapping("/viewBooking")
	public String displayBookingDetails() {
		System.out.println("BookingController.displayBookingDetails()......");
		return "booking";
	}

	@PostMapping("/bookMyRide")
	public String bookRide(@ModelAttribute BookingRequest bookingRequest, Model model) {
		System.out.println("BookingController.bookRide()...........");
		String source = bookingRequest.getSource();
		String destination = bookingRequest.getDestination();
		String type = bookingRequest.getType();

		System.out.println("Request Received:  [" + source + " " + destination + " " + type + " ]");
		String bookingCode = UUID.randomUUID().toString().replace("-", "").substring(0, 6).toUpperCase();
		System.out.println("Your booking code is: " + bookingCode);
		model.addAttribute("bookingConfirmationCode", bookingCode);
		return "bookingConfirmation";
	}

}
