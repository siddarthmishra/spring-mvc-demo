package com.luv2code.springdemo.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.groups.Default;

public class Customer {

	private String firstName;

	@NotNull(message = "Last Name is required", groups = {Default.class})
	@Size(min = 1, message = "Last Name is required", groups = {Default.class})
	private String lastName;

	@NotNull(message = "Email is required", groups = {Email.class})
	@Email(message = "Invalid Email", groups = {Email.class})
	private String email;

	private String errorMessage;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}
