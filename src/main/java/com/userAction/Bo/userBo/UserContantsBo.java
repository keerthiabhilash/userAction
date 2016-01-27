package com.userAction.Bo.userBo;


import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name = "USER_CONTACT_TBL",schema="useraction")
public class UserContantsBo {

	@Id
	@GeneratedValue
	@Column(name = "USER_CONTACT_ID")
	private int userContactId;
	
	@Column(name="FIRST_NAME",nullable=false)
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="MIDDLE_NAME")
	private String middleName;
	
	@Column(name = "PHONE_NUMBER")
	private int phoneNumber;

	@Column(name = "EMAIL_ADDRESS",nullable=false)
	private String email;

	@Column(name = "INSERT_TMS")
	private DateTime insertTime;

	@Column(name = "LST_UPDATE_TMS")
	private DateTime lastUpdateTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_LOGIN_ID", nullable = false)
	private UserLoginBo userLogin;
	
	@OneToOne(fetch = FetchType.LAZY,mappedBy = "userContantsBo")
	//@JoinColumn(name = "USER_ADDRESS_ID")
	private UserAddressBo address;

	public int getUserContactId() {
		return userContactId;
	}

	public void setUserContactId(int userContactId) {
		this.userContactId = userContactId;
	}

	public DateTime getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(DateTime insertTime) {
		this.insertTime = insertTime;
	}

	public DateTime getLastUpdateTime() {
		return lastUpdateTime;
	}

	public void setLastUpdateTime(DateTime lastUpdateTime) {
		this.lastUpdateTime = lastUpdateTime;
	}

	public UserLoginBo getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(UserLoginBo userLogin) {
		this.userLogin = userLogin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public UserAddressBo getAddress() {
		return address;
	}

	public void setAddress(UserAddressBo address) {
		this.address = address;
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

}
