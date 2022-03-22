package com.test.cg;

public class Contact {
	private String firstName;
	public Contact(String firstName, String lastName, String phone) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
	}
	private String lastName;
	private String phone;
	
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void validateLastName() {
		if(this.firstName==null) {
			throw new RuntimeException("First name cannot be empty")
		}
	}
	public void validateLastName() {
		if(this.lastName == null) {
			throw new RuntimeException("Last name cannot be empty");
		}
	}
	public void validatePhone() {
		if(this.phone.lenght()!=10) {
			throw new RuntimeException("Pjone number should be of 10 digits");
		}
		if(this.phone.startswith("0")) {
			
		}
	}
	

}
