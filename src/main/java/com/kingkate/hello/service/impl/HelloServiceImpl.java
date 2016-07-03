package com.kingkate.hello.service.impl;

import org.springframework.stereotype.Component;

import com.kingkate.hello.service.HelloService;

@Component
public class HelloServiceImpl implements HelloService {

	public String sayHello(String message) {
		return "Hello "+message;
	}

}
