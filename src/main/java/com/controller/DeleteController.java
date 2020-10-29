package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domain.User;
import com.proxy.DeleteProxy;
import com.proxy.ReaderProxy;

@Controller
public class DeleteController {

	@Autowired
	private ReaderProxy readerProxy;
	
   @Autowired
   private DeleteProxy deleteProxy;
   
	@GetMapping("/display-delete-page")
	public ModelAndView displayDeletePage() {

		List<User> userList = readerProxy.read();

		return new ModelAndView("delete", "userList", userList);

	}

	//@CrossOrigin
	@PostMapping("/delete-record")
	public ModelAndView delete(User user) {
		
		List<User> userList = deleteProxy.deleteById(user);

		return new ModelAndView("delete", "userList", userList);

	}	

}