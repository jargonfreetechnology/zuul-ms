package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Controller //http://localhost:8080/
public class CrudController {

	@GetMapping("/")
	@HystrixCommand(fallbackMethod="fallBackMethod")
	public ModelAndView crud() {
		return new ModelAndView("crud");
		//throw new RuntimeException("Exception");
	}

	public ModelAndView fallBackMethod() {
		return new ModelAndView("error");
	}	
	
}