package com.userAction.controller;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.xml.ws.spi.http.HttpExchange;
import javax.xml.ws.spi.http.HttpHandler;

//import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.userAction.Bo.customerBo.RegistrationForm;
import com.userAction.Bo.util.CountryAndState;
import com.userAction.service.FormService;
import com.userAction.service.UtilService;

@Controller
@RequestMapping(value = "/registration")
public class FormController {

	@Autowired
	FormService formService;

	@Autowired
	UtilService utilService; 

	HttpHeaders header;

	@PostConstruct
	private void loadOnRequest() {
		if (header == null) {
			System.out.println("Its New hhtphandes");
			header = new HttpHeaders();
			header.add("Access-Control-Allow-Origin", "*");
		}
	}

	@RequestMapping(value = "/creg", method = RequestMethod.GET)
	private String registerCust() {

		formService.validateAndSave(new RegistrationForm());

		return null;

	}

	@RequestMapping(value = "/ureg", method = RequestMethod.POST)
	private String registerUser(@RequestBody RegistrationForm regForm) {
		formService.validateAndSave(regForm);
		return "Hi there";
	}

	/**
	 * These part we are returning back a ResponseEntity<?> and we are seeting
	 * the header and status code for the UI to look into these part and
	 * unmarshar the data object.
	 * 
	 * @param cntrys
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value = "/{cntry}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<String>> getStates(@PathVariable("cntry") String cntrys) {
		System.out.println(cntrys);
		List<String> stats = utilService.getListOfStates(cntrys);
		System.out.print(stats);
		return new ResponseEntity<List<String>>(stats, header, HttpStatus.OK);

	}

	@ResponseBody
	@RequestMapping(value = "/cntryStats", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<CountryAndState>> getcountryStats() {
		List<CountryAndState> stats = utilService.getCountryAndStats();
		System.out.print(stats);
		return new ResponseEntity<List<CountryAndState>>(stats, header, HttpStatus.OK);

	}
	
	@ResponseBody
	@RequestMapping(value = "/newCust", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	private ResponseEntity<List<CountryAndState>> submitNewCustomerForm(@ModelAttribute RegistrationForm submittedForm) {
		
		
		
		List<CountryAndState> stats = utilService.getCountryAndStats();
		return new ResponseEntity<List<CountryAndState>>(stats, header, HttpStatus.OK);

	}

	
	

}
