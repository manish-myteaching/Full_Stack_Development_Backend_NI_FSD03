package com.professionalit.bean;

public class Address {

	private String city;
	private String state;

	public Address(String city, String state) {
		this.city = city;
		this.state = state;
	}

	public Address() {
		System.out.println("Address");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}

}
