package com.userAction.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.userAction.Bo.util.CountryAndState;
import com.userAction.Dao.RegistrationDao;
import com.userAction.Dao.UtilDao;

@Service("utilService")
public class UtilService {

	@Autowired
	UtilDao utilDao;

	public List<String> getListOfStates(String country) {
		String statsInString = utilDao.getStatesFromCountry(country).getStatsInStringForm();
		String[] stats = statsInString.split(",");
		return new ArrayList<>(Arrays.asList(stats));
	}

	public List<CountryAndState> getCountryAndStats() {
		List<CountryAndState> countryAndStats = utilDao.getCountryAndStats();
		return countryAndStats;
	}

}
