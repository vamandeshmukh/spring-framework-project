package com.vaman.spring.xm;

public class Country {

	private City city;

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public void visitCountry() {
		System.out.println("Visit to country");
	}

	public void travel() {
		this.visitCountry();
		city.visitCity();
	}
}
