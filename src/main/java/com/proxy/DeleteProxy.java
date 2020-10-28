package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.domain.User;
import com.properties.ZuulDevProperties;

@FeignClient(name = "delete-ms", url = "${url.delete}", configuration = ZuulDevProperties.class)
public interface DeleteProxy {

	@PostMapping("/delete")
	public List<User> deleteById(User user);

}



