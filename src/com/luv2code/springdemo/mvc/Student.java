package com.luv2code.springdemo.mvc;

import java.util.Map;
import java.util.TreeMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private Map<String, String> countryOptions;
	private String countryOptionsResult;
	private String countryPropertiesResult;
	
	public Student() {
		// this.firstName = "firstName";
		// this.lastName = "lastName";
		// this.country = ""; // default to Select
		populateCountryOptions();
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", countryOptionsResult=" + countryOptionsResult + ", countryPropertiesResult="
				+ countryPropertiesResult + "]";
	}

	private void populateCountryOptions() {
		this.countryOptions = new TreeMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("USA", "United States of America");
	}

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountryOptionsResult() {
		return countryOptionsResult;
	}

	public void setCountryOptionsResult(String countryOptionsResult) {
		this.countryOptionsResult = countryOptionsResult;
	}

	public String getCountryPropertiesResult() {
		return countryPropertiesResult;
	}

	public void setCountryPropertiesResult(String countryPropertiesResult) {
		this.countryPropertiesResult = countryPropertiesResult;
	}
	
}
