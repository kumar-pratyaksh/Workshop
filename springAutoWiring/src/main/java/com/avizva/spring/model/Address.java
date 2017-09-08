package com.avizva.spring.model;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city;
	private String country;
	private int pinCode;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", pinCode=" + pinCode + "]";
	}

}
