package com.kingkate.hello.service.impl;

import org.springframework.stereotype.Component;

import com.kingkate.hello.service.HelloService;
@Component
public class HelloWorld implements HelloService {

	public String sayHello(String message) {
		message = "World";
		return message;
	}

}
