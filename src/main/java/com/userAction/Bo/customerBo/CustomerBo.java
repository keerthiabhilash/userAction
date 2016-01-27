package com.userAction.Bo.customerBo;

import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.userAction.Bo.serviceBo.ServiceHistoryBo;



@Entity
@Table(name="CUST_TBL",schema="useraction")
public class CustomerBo {
	
	@Id
	@GeneratedValue
	@Column(name="CUST_ID")
	private int customerId;
	
	@Column(name="FIRST_NAME", nullable=false)
	private String firstName;
	
	@Column(name="LAST_NAME",nullable=false)
	private String lastName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name="EMAIL_ADDRESS",nullable=false)
	private String email;
	
	@Column(name="CUST_PHONE",nullable=false)
	private int phoneNumber;

	@Column(name="CUSTOMER_POINTS")
	private int customerPoint;
	
	@Column(name="ACTIVE_STATUS")
    private String activeStatus;
	
	@OneToMany(mappedBy="customer")
    private Set<ServiceHistoryBo> serviceHistory;
	

	
	@OneToOne(mappedBy="customer")
	private CustomerContacts costomerContact;
	
	
	
	public String getActiveStatus() {
		return activeStatus;
	}
	public void setActiveStatus(String activeStatus) {
		this.activeStatus = activeStatus;
	}
	public Set<ServiceHistoryBo> getServiceHistory() {
		return serviceHistory;
	}
	public void setServiceHistory(Set<ServiceHistoryBo> serviceHistory) {
		this.serviceHistory = serviceHistory;
	}
	public CustomerContacts getCostomerContact() {
		return costomerContact;
	}
	public void setCostomerContact(CustomerContacts costomerContact) {
		this.costomerContact = costomerContact;
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
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCustomerPoint() {
		return customerPoint;
	}
	public void setCustomerPoint(int customerPoint) {
		this.customerPoint = customerPoint;
	}	
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
