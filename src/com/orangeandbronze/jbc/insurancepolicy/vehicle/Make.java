package com.orangeandbronze.jbc.insurancepolicy.vehicle;

import java.math.*;

public enum Make {
	TOYOTA(new BigDecimal("200")), BMW(new BigDecimal("500")), SARAO(new BigDecimal("800"));
	
	public final BigDecimal premiumAddition;
	
	private Make(BigDecimal premiumAddition) {
		this.premiumAddition = premiumAddition;
	}
}
