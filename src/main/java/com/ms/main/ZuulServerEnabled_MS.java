package com.ms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
@ComponentScan({"com.controller", "com.properties"})
@EnableFeignClients("com.proxy") //will scan the packages for clients.
public class ZuulServerEnabled_MS {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerEnabled_MS.class, args);
	}

}