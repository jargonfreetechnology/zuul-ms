package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.User;

@FeignClient(name = "update-ms")
public interface UpdaterProxy {

	@PostMapping("/update")
	public User update(User user);

}