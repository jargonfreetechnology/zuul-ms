package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domain.User;
import com.proxy.CreatorProxy;

@Controller
public class CreateController {
	
   @Autowired
   private CreatorProxy creatorProxy;
   
	@GetMapping("/display-create-page")
	public ModelAndView displayCreatePage() {
		return new ModelAndView("create");
	}
	
	@PostMapping("/create-user")
	public ModelAndView create(User user) {
		
		List<User> userList = creatorProxy.create(user);

		return new ModelAndView("update", "userList", userList);

	}	

}