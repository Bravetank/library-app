package com.bravetank.springmvc.library;

import java.util.LinkedHashMap;

public class Borrower {
	private String firstName;
	private  String lastName;
	private String city;
	private LinkedHashMap<String, String> cityOptions;
	
	public Borrower() {
		cityOptions = new LinkedHashMap<>();
		//populate city options
		cityOptions.put("Swansea", "Swansea");
		cityOptions.put("Cardiff", "Cardiff");
		cityOptions.put("London", "London");
		cityOptions.put("Edinburgh", "Edinburgh");
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public LinkedHashMap<String, String> getCityOptions() {
		return cityOptions;
	}

}
