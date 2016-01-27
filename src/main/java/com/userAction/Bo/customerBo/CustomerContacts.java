package com.userAction.Bo.customerBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="CUST_CONT_TBL",schema="useraction")
public class CustomerContacts {
	
	
	@Id
	@GeneratedValue
	@Column(name="CUST_CONT_ID")
	private int CustomerContactId;
	
	@Column(name="CUST_ADDRESS_1")
	private String address1;
	
	@Column(name="CUST_ADDRESS_2")
	private String address2;
	
	@Column(name="CUST_STATE")
	private String state;
	
	@Column(name="CUST_ZIPCODE")
	private int zipcode;
	
	@Column(name="CUST_PHONE")
	private int phoneNumber;
	
	@OneToOne
	@JoinColumn(name = "CUST_ID", nullable = false)
	private CustomerBo customer;
	
	
	
	public CustomerBo getCustomer() {
		return customer;
	}
	public void setCustomer(CustomerBo customer) {
		this.customer = customer;
	}
	
	
	public int getCustomerContactId() {
		return CustomerContactId;
	}
	public void setCustomerContactId(int customerContactId) {
		CustomerContactId = customerContactId;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
	
	
	

}
