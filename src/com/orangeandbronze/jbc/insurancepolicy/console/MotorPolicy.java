package com.orangeandbronze.jbc.insurancepolicy.console;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

import com.orangeandbronze.jbc.insurancepolicy.*;
import com.orangeandbronze.jbc.insurancepolicy.vehicle.*;

public class MotorPolicy extends Policy {
	
	private Vehicle vehicle;

	private MotorPolicy(Integer policyNumber, PolicyHolder policyHolder, Vehicle vehicle) {
		super(policyNumber, policyHolder);
		this.vehicle = vehicle;
		// TODO Auto-generated constructor stub
	}
	
	public static MotorPolicy instanceOf(Integer policyNumber, PolicyHolder policyHolder, Vehicle vehicle) {
		return new MotorPolicy(policyNumber, policyHolder, vehicle);
	}

	@Override
	public BigDecimal getPremium(int year) {
		
		// declare basePremium, get necessary variables
		// Make, BodyType, yearGiven
		BigDecimal basePremium = new BigDecimal(1000);
		Make make = this.vehicle.getMake();
		BodyType bodyType = this.vehicle.getBodyType();
		int yearGiven = this.vehicle.getYear();
		
		// premium calculations
		basePremium =  basePremium.add(make.premiumAddition); // add the premium 
		basePremium = basePremium.multiply(bodyType.premiumMultiplier); // multiply based on body type
		int amountBasedOnYearGiven = (LocalDate.now().getYear() - yearGiven) * 200; // amount on year given
		basePremium = basePremium.add(BigDecimal.valueOf(amountBasedOnYearGiven)); // add the amount based on year given
		
		return basePremium.setScale(2);
	}

}
