package com.userAction.Bo.customerBo;

//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

public class RegistrationForm {

	//@NotNull
	private String firstName;
	//@NotNull
	private String lastName;
	//@NotNull
	//@Size(min = 4, max=10)
	private int phone;
	//@NotNull
	private String email;
	//@NotNull
	private String userName;
	
	private CustomerContacts custContact;
	
	
	
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
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public CustomerContacts getCustContact() {
		return custContact;
	}
	public void setCustContact(CustomerContacts custContact) {
		this.custContact = custContact;
	}

}
