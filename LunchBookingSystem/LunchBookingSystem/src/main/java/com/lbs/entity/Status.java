package com.lbs.entity;

public class Status {
	private int statusCode;
	private String statusMessage;
	private Register loggedInCustomer;

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public Register getLoggedInCustomer() {
		return loggedInCustomer;
	}

	public void setLoggedInCustomer(Register loggedInCustomer) {
		this.loggedInCustomer = loggedInCustomer;
	}
}
