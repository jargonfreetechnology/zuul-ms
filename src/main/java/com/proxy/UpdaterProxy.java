package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.User;
import com.properties.ZuulDevProperties;

@FeignClient(name = "update-ms", url = "${url.update}", configuration = ZuulDevProperties.class)
public interface UpdaterProxy {

	@PostMapping("/update")
	public List<User> update(User user);

}