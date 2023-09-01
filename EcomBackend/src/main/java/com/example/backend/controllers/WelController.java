package com.example.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/wel")
public class WelController {

	
	@RequestMapping("/test2")
	  @ResponseBody
public String test() {
	
	return "testing";
}
	
	
}
