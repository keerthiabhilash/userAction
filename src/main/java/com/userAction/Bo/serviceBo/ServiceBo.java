package com.userAction.Bo.serviceBo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.DateTime;


@Entity
@Table(name="SERVICE_TBL",schema="useraction")
public class ServiceBo {

	@Id
	@GeneratedValue
	@Column(name="SERVICE_ID")
	private int serviceId;
	
	@Column(name = "SERVICE_NAME")
	private String serviceName;
	
	@Column(name = "SERVICE_DESCRIPTION")
	private String description;
	
	@Column(name = "SERVICE_AMOUNT")
	private int amount;
	
	@Column(name = "SERVICE_UNICODE")
	private int unicode;
	
	@Column(name = "INSERT_TMS")
	private DateTime insertTime;
	
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getUnicode() {
		return unicode;
	}
	public void setUnicode(int unicode) {
		this.unicode = unicode;
	}
	public DateTime getInsertTime() {
		return insertTime;
	}
	public void setInsertTime(DateTime insertTime) {
		this.insertTime = insertTime;
	}
	
	
	
}
