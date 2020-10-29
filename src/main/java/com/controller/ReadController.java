package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domain.User;
import com.proxy.ReaderProxy;

@Controller
public class ReadController {
	
   @Autowired
   private ReaderProxy readerProxy;

   //@CrossOrigin
   @GetMapping("/display-read-page")
	public ModelAndView read() {

	   List<User> userList = readerProxy.read();
	   
	   return new ModelAndView("read", "userList", userList);

	}

}