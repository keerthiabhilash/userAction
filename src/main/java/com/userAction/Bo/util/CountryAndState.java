package com.userAction.Bo.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COUNTRY_AND_STATS", schema = "useraction")
public class CountryAndState implements Serializable{

	@Id
	@GeneratedValue
	@Column(name = "cntry_state_id")
	private int id;

	@Column(name = "COUNTRY_NAME")
	private String countryName;

	@Column(name = "STATS_STRING")
	private String statsInString;

	public String getContryName() {
		return countryName;
	}

	public void setContryName(String contryName) {
		this.countryName = contryName;
	}

	public String getStatsInStringForm() {
		return this.statsInString;
	}

	public void setStatsInString(String statsInString) {
		this.statsInString = statsInString;
	}

	public List<String> getStatsInListForm() {
		if (this.statsInString != null) {
			return new ArrayList<>(Arrays.asList(this.statsInString.split(",")));
		}
		return null;
	}

}
