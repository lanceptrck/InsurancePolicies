package com.orangeandbronze.jbc.insurancepolicy;

import java.math.*;
import java.time.*;

public abstract class Policy {
	
	private final Integer policyNumber;
	private PolicyHolder policyHolder;
	
	public Policy(Integer policyNumber, PolicyHolder policyHolder) {
		this.policyNumber = policyNumber;
		this.policyHolder = policyHolder;
	}
	
	public Integer getPolicyNumber() {
		return policyNumber;
	}
	
	public PolicyHolder getPolicyHolder() {
		return policyHolder;
	}
	
	/** Computes the premium to be paid for a given year.**/
	public abstract BigDecimal getPremium(int year);

	
	
	
	
	@Override
	public String toString() {
		return "Policy# " + policyNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((policyNumber == null) ? 0 : policyNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Policy other = (Policy) obj;
		if (policyNumber == null) {
			if (other.policyNumber != null)
				return false;
		} else if (!policyNumber.equals(other.policyNumber))
			return false;
		return true;
	}

	

}
