package com.ola.request.controller;

public class BookingRequest {
	private String source;

	public String getSource() {
		return source;
	}

	public String getDestination() {
		return destination;
	}

	public String getType() {
		return type;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String destination;
	private String type;

}
