package com.orangeandbronze.jbc.insurancepolicy.console;

import java.math.*;
import java.time.*;

import com.orangeandbronze.jbc.insurancepolicy.*;
import com.orangeandbronze.jbc.insurancepolicy.vehicle.*;

public class TestMotorPolicy {

	public static void main(String[] args) {
		PolicyHolder holder = new PolicyHolder(1, "Mickey", "Mouse");
		Vehicle vehicle = new Vehicle(Make.TOYOTA, BodyType.SEDAN, 2013);
		MotorPolicy motorPolicy = MotorPolicy.instanceOf(1, holder, vehicle);
		BigDecimal actual = motorPolicy.getPremium(2017);
		BigDecimal expected = new BigDecimal("2600.00");
		System.out.println("Expected premium is: " + expected);
		System.out.println("Actual premium is: " + actual);
	}

}
