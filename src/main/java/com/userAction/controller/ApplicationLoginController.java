package com.userAction.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by abhilashkeerthi on 1/8/16.
 */

@Controller
@RequestMapping(value="/login", method= RequestMethod.POST)
public class ApplicationLoginController {


    @ResponseBody
    @RequestMapping(value = "/{cntry}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    private void login(@PathVariable("cntry") String cntrys) {

    }

}

















