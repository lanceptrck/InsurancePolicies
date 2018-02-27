package com.orangeandbronze.jbc.insurancepolicy;

public class PolicyHolder {
	
	private final Integer policyHolderId;
	private String firstName;
	private String lastName;
	
	public PolicyHolder(Integer policyHolderId, String firstName, String lastName) {
		this.policyHolderId = policyHolderId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Integer getPolicyHolderId() {
		return policyHolderId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
