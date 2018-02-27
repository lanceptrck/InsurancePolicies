package com.orangeandbronze.jbc.insurancepolicy.console;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import com.orangeandbronze.jbc.insurancepolicy.*;
import com.orangeandbronze.jbc.insurancepolicy.property.*;

public class FirePolicy extends Policy {
	
	private Property property;

	private FirePolicy(Integer policyNumber, PolicyHolder policyHolder, Property property) {
		super(policyNumber, policyHolder);
		this.property = property;
		// TODO Auto-generated constructor stub
	}

	public static FirePolicy instanceOf(Integer policyNumber, PolicyHolder policyHolder, Property property) {
		return new FirePolicy(policyNumber, policyHolder, property);
	}
	
	@Override
	public BigDecimal getPremium(int year) {
		
		BigDecimal propertySize = BigDecimal.valueOf(this.property.getSizeInSquareMeters() * 10);
		int propertyYearBuilt = this.property.getYearBuilt();
		propertyYearBuilt = (LocalDate.now().getYear() - propertyYearBuilt) * 100;
		BigDecimal amountBasedOnYear = propertySize.add(BigDecimal.valueOf(propertyYearBuilt));

		return amountBasedOnYear.setScale(2);
		
	}

}
