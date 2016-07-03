package com.kingkate.hello.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloContrller {
	
	Logger log = Logger.getLogger(HelloContrller.class);

	@RequestMapping("/hi")
	public ModelAndView hello(@RequestParam(value="name") String name){
		ModelAndView modelAndView = new ModelAndView("hellobody");
		modelAndView.addObject("mes", "Hello "+name);
		log.info("Hello "+name);
		return modelAndView;
	}
}
