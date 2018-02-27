package com.orangeandbronze.jbc.insurancepolicy.property;

import java.time.*;

public class Property {
	private final int yearBuilt;
	private final int sizeInSqareMeters;
	public Property(int yearBuilt, int sizeInSqareMeters) {
		this.yearBuilt = yearBuilt;
		this.sizeInSqareMeters = sizeInSqareMeters;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public int getSizeInSquareMeters() {
		return sizeInSqareMeters;
	}
	
}
