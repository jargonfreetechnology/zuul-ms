package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.domain.User;
import com.properties.ZuulDevProperties;

@FeignClient(name = "read-ms", url = "${url.read}", configuration = ZuulDevProperties.class)
public interface ReaderProxy {

	@GetMapping("/read")
	public List<User> read();

}
