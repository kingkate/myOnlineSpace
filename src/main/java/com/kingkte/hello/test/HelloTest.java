package com.kingkte.hello.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kingkate.hello.manager.HelloManager;
import com.kingkate.hello.service.HelloService;
import com.kingkate.hello.service.impl.HelloWorld;

public class HelloTest {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("applicationContext.xml");
//		HelloService service = (HelloService) xmlContext.getBean(HelloWorld.class);
		HelloManager manager = xmlContext.getBean(HelloManager.class);
		manager.sayHello("袁航");
	}

}
