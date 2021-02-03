package com.vaman.spring.demo;

public class Country {

	private City zzzz;

	public Country() {
		System.out.println("Country constructor");
	}

	public City getZzzz() {
		return zzzz;
	}

	public void setZzzz(City city) {
		this.zzzz = city;
	}

	public void visitCountry() {
		System.out.println("Visit to country");
	}

	public void travel() {
		this.visitCountry();
		zzzz.visitCity();
	}
}
