package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.domain.User;
import com.properties.ZuulDevProperties;

@FeignClient(name = "create-ms", url = "${url.create}", configuration = ZuulDevProperties.class)
public interface CreatorProxy {

	@PostMapping("/create")
	public List<User> create(User user);

}
