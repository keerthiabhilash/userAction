package com.userAction.Bo.userBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.joda.time.DateTime;

@Entity
@Table(name="USER_ADDRESS_TBL",schema="useraction")
public class UserAddressBo {

	@Id
	@GeneratedValue
	@Column(name = "USER_ADDRESS_ID")
	private int userAddresID;

	@Column(name = "USER_ADDRESS_1")
	private String address1;

	@Column(name = "USER_ADDRESS_2")
	private String address2;

	@Column(name = "STATE")
	private String state;

	@Column(name = "ZIP_CODE")
	private int zipCode;

	@Column(name = "STATUS_IND")
	private char statusInd;

	@Column(name = "INSERT_TMS")
	private DateTime insertTime;

	@Column(name = "LST_UPDATE_TMS")
	private DateTime lastUpdateTime;
	
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "USER_CONTACT_ID", nullable = false)
	private UserContantsBo userContantsBo;

	public int getUserAddresID() {
		return userAddresID;
	}

	public void setUserAddresID(int userAddresID) {
		this.userAddresID = userAddresID;
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

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public char getStatusInd() {
		return statusInd;
	}

	public void setStatusInd(char statusInd) {
		this.statusInd = statusInd;
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
	
	public UserContantsBo getUserContantsBo() {
		return userContantsBo;
	}

	public void setUserContantsBo(UserContantsBo userContantsBo) {
		this.userContantsBo = userContantsBo;
	}

}
