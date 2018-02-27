package com.orangeandbronze.jbc.insurancepolicy.vehicle;

import java.time.*;

public class Vehicle {

	private Make make;
	private BodyType bodyType;
	private int year;

	public Vehicle(Make make, BodyType bodyType, int year) {
		this.make = make;
		this.bodyType = bodyType;
		this.year = year;
	}

	public Make getMake() {
		return make;
	}

	public void setMake(Make make) {
		this.make = make;
	}

	public int getYear() {
		return year;
	}

	public BodyType getBodyType() {
		return bodyType;
	}

	public void setBodyType(BodyType bodyType) {
		this.bodyType = bodyType;
	}

}
