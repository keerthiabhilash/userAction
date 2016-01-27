package com.userAction.Bo.serviceBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.joda.time.DateTime;

import com.userAction.Bo.customerBo.CustomerBo;
import com.userAction.Bo.userBo.UserLoginBo;
import com.userAction.controller.UserLogin;

@Entity
@Table(name = "SERVICE_HISTORY_TBL", schema = "useraction")
public class ServiceHistoryBo {

	@Id
	@GeneratedValue
	@Column(name = "SERVICE_HISTORY_ID")
	private int serviceHistoryId;

	@ManyToOne
	@JoinColumn(name = "CUST_ID", nullable = false)
	private CustomerBo customer;

	@ManyToOne
	@JoinColumn(name = "SERVICE_ID", nullable = false)
	private ServiceBo service;

	@ManyToOne
	@JoinColumn(name = "USER_LOGIN_ID", nullable = false)
	private UserLoginBo user;

	@Column(name = "SERVICE_COMMENT")
	private String comment;

	@Column(name = "SERVICE_DATE")
	private DateTime date;

	@Column(name = "INSERT_TMS")
	private DateTime insertTime;

	public int getServiceHistoryId() {
		return serviceHistoryId;
	}

	public void setServiceHistoryId(int serviceHistoryId) {
		this.serviceHistoryId = serviceHistoryId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public DateTime getDate() {
		return date;
	}

	public void setDate(DateTime date) {
		this.date = date;
	}

	public DateTime getInsertTime() {
		return insertTime;
	}

	public void setInsertTime(DateTime insertTime) {
		this.insertTime = insertTime;
	}

	public CustomerBo getCustomer() {
		return customer;
	}

	public void setCustomer(CustomerBo customer) {
		this.customer = customer;
	}

	public ServiceBo getService() {
		return service;
	}

	public void setService(ServiceBo service) {
		this.service = service;
	}

	public UserLoginBo getUser() {
		return user;
	}

	public void setUser(UserLoginBo user) {
		this.user = user;
	}

}
