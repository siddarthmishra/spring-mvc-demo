package com.luv2code.springdemo.mvc;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	private Map<String, String> countryOptions;
	private String countryOptionsResult;
	private String countryPropertiesResult;
	private String favoriteLanguage;
	private Map<String, String> favoriteLanguageOptions;
	private String favoriteLanguageOptionsResult;
	private String favoriteLanguagePropertiesResult;
	private Set<String> operatingSystems = new HashSet<String>();
	private Map<String, String> operatingSystemsOptions;

	public Student() {
		// this.firstName = "firstName";
		// this.lastName = "lastName";
		// this.country = ""; // default to Select
		populateCountryOptions();
		// this.favoriteLanguage = ""; // default to None
		populateFavoriteLanguageOptions();
		// operatingSystems.add("MS Windows"); // default to MS Windows
		populateOperatingSystemsOptions();
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", countryOptionsResult=" + countryOptionsResult + ", countryPropertiesResult="
				+ countryPropertiesResult + ", favoriteLanguage=" + favoriteLanguage
				+ ", favoriteLanguageOptionsResult=" + favoriteLanguageOptionsResult
				+ ", favoriteLanguagePropertiesResult=" + favoriteLanguagePropertiesResult + ", operatingSystems="
				+ operatingSystems + "]";
	}

	private void populateCountryOptions() {
		this.countryOptions = new TreeMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("USA", "United States of America");
	}

	private void populateFavoriteLanguageOptions() {
		this.favoriteLanguageOptions = new TreeMap<String, String>();
		favoriteLanguageOptions.put("Python", "Python");
		favoriteLanguageOptions.put("ML", "Machine Leanring");
		favoriteLanguageOptions.put("RPA", "Robotic Process Automation");
		favoriteLanguageOptions.put("AI", "Artificial Intelligence");
	}

	private void populateOperatingSystemsOptions() {
		this.operatingSystemsOptions = new TreeMap<String, String>();
		operatingSystemsOptions.put("OS1", "Operating Systems 1");
		operatingSystemsOptions.put("OS2", "Operating Systems 2");
		operatingSystemsOptions.put("OS3", "Operating Systems 3");
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

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public Map<String, String> getFavoriteLanguageOptions() {
		return favoriteLanguageOptions;
	}

	public String getFavoriteLanguageOptionsResult() {
		return favoriteLanguageOptionsResult;
	}

	public void setFavoriteLanguageOptionsResult(String favoriteLanguageOptionsResult) {
		this.favoriteLanguageOptionsResult = favoriteLanguageOptionsResult;
	}

	public String getFavoriteLanguagePropertiesResult() {
		return favoriteLanguagePropertiesResult;
	}

	public void setFavoriteLanguagePropertiesResult(String favoriteLanguagePropertiesResult) {
		this.favoriteLanguagePropertiesResult = favoriteLanguagePropertiesResult;
	}

	public Set<String> getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(Set<String> operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public Map<String, String> getOperatingSystemsOptions() {
		return operatingSystemsOptions;
	}

}
