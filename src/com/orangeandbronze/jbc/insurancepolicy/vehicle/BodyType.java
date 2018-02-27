package com.orangeandbronze.jbc.insurancepolicy.vehicle;

import java.math.*;

public enum BodyType {
	SEDAN(new BigDecimal("1.5")), SUV(new BigDecimal("2.0"));
	
	public final BigDecimal premiumMultiplier;
	
	private BodyType(BigDecimal premiumMultiplier) {
		this.premiumMultiplier = premiumMultiplier;
	}
}
