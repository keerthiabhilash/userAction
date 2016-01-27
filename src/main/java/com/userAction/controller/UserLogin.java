package com.userAction.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserLogin {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public void index() {

		System.out.println("we are in");

	}

}
