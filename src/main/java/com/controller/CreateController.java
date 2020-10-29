package com.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.domain.User;
import com.proxy.CreatorProxy;
import com.proxy.ReaderProxy;

@Controller
@PropertySource("classpath:messages.properties") /* place the properties file under src/main/resources */
public class CreateController {
	
	@Autowired
	private Environment env;

   @Autowired
   private CreatorProxy creatorProxy;

   @Autowired
   private ReaderProxy readerProxy;
   
	@GetMapping("/display-create-page")
	public ModelAndView displayCreatePage() {
		return new ModelAndView("create");
	}
	
	//@CrossOrigin
	@PostMapping("/create-user")
	public ModelAndView create(Model model, User user, @RequestParam CommonsMultipartFile file) {
		
		User usr = creatorProxy.create(user);
		
		//String uploadRoot = System.getProperty("catalina.base");
		String uploadRoot = "C:" + File.separator + "_local_git_repository";
		String uploadLocation = uploadRoot + File.separator + env.getProperty("img_path") + File.separator + env.getProperty("img_folder") + File.separator;
				
		String filename = file.getOriginalFilename();

		byte barr[] = file.getBytes();

		BufferedOutputStream bout;
		try {
			//to save the image file
			bout = new BufferedOutputStream(new FileOutputStream(uploadLocation + File.separator + usr.getUserId() + ".jpg"));
			bout.write(barr);
			bout.flush();
			bout.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}

		//encode image file to send it back to JSP
	    byte[] encodeBase64 = Base64.getEncoder().encode(barr);
	    String base64Encoded = null;
		try {
			base64Encoded = new String(encodeBase64, "UTF-8");

		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		user.setBase64EncodedImg(base64Encoded);		

		List<User> userList = readerProxy.read();
		
		model.addAttribute("userList", userList);
		model.addAttribute("user", user);		
		
		return new ModelAndView("update");

	}	

}