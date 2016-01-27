package com.userAction.Bo.userBo;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;



@Entity
@Table(name = "USER_LOGIN_TBL",schema="useraction")
public class UserLoginBo {

	@Id
	@GeneratedValue
	@Column(name = "USER_LOGIN_ID")
	private int UserLoginId;

	@Column(name = "USER_NAME",nullable = false)
	private String userName;

	@Column(name = "PASSWORD_ENCRPT",nullable = false)
	private String passwordEncrpt;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "userLoginBo")
	private UserRoleBo userRole;

	@Column(name = "INSERT_TMS", nullable = false)
	private DateTime insertTime;

	@Column(name = "LST_UPDATE_TMS")
	private DateTime lastUpdateTime;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "userLogin")
	private Set<UserContantsBo> userContants;
	
	@Column(name = "CURRENT_STATUS")
	private char status;

	public String getPasswordEncrpt() {
		return passwordEncrpt;
	}

	public void setPasswordEncrpt(String passwordEncrpt) {
		this.passwordEncrpt = passwordEncrpt;
	}

	public UserRoleBo getUserRole() {
		return userRole;
	}

	public void setUserRole(UserRoleBo userRole) {
		this.userRole = userRole;
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

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return passwordEncrpt;
	}

	public void setPassword(String password) {
		this.passwordEncrpt = password;
	}

	public Set<UserContantsBo> getUserContants() {
		return userContants;
	}

	public void setUserContants(Set<UserContantsBo> userContants) {
		this.userContants = userContants;
	}

	public int getUserLoginId() {
		return UserLoginId;
	}

	public void setUserLoginId(int userLoginId) {
		UserLoginId = userLoginId;
	}

}
