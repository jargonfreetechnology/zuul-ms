package com.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.domain.User;

@FeignClient(name = "read-ms")
public interface ReaderProxy {

	@GetMapping("/read")
	public List<User> read();

}
