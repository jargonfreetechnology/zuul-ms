package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //http://localhost:80/
public class CrudController {

	@GetMapping("/")
	public ModelAndView crud() {

		return new ModelAndView("crud");

	}

}