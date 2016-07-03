package com.kingkate.hello.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.kingkate.hello.service.HelloService;

@Component
public class HelloManager {
	
	@Autowired
	@Qualifier("helloServiceImpl")
	private HelloService helloService;
	
	
	public void sayHello(String mes){
		System.out.println(helloService.sayHello(mes));
	}
}
