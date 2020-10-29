package com.ms.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import brave.sampler.Sampler;

@SpringBootApplication
@ComponentScan({"com.controller", "com.config"})
@EnableZuulProxy
@EnableDiscoveryClient
@EnableFeignClients("com.proxy") //will scan the packages for feign clients(classes annotated with @FeignClient)
@EnableHystrix
public class ZuulServerEnabled_MS {

	public static void main(String[] args) {
		SpringApplication.run(ZuulServerEnabled_MS.class, args);
	}

    @Bean
    public CommonsMultipartResolver commonsMultipartResolver() {
        final CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(-1);
        return multipartResolver;
    }	
	
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}