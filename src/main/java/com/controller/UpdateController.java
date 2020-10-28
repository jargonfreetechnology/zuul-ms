package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domain.User;
import com.proxy.ReaderProxy;
import com.proxy.UpdaterProxy;

@Controller
public class UpdateController {

	@Autowired
	private ReaderProxy readerProxy;

	@Autowired
	private UpdaterProxy updaterProxy;

	@GetMapping("/display-update-page")
	public ModelAndView displayUpdatePage() {

		List<User> userList = readerProxy.read();

		return new ModelAndView("update", "userList", userList);

	}

	@PostMapping("/update")
	public ModelAndView update(User user) {

		System.out.println(user);

		List<User> userList = updaterProxy.update(user);

		return new ModelAndView("update", "userList", userList);

	}

}