package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.User;

@FeignClient(name = "delete-ms")
public interface DeleteProxy {

	@PostMapping("/delete")
	public List<User> deleteById(User user);

}



