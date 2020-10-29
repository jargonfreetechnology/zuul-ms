package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.domain.User;

//@FeignClient(name = "create-ms", url = "${url.create}", configuration = ZuulDevProperties.class)
@FeignClient(name = "create-ms")
public interface CreatorProxy {

	@PostMapping("/create")
	public User create(User user);

}