package com.example.restfulwebservice.helloworld;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Autowired
	private MessageSource messageSource;
	//GET
	// /hello-world (endPoint)
	// @RequestMapping(methd=RequestMethod.GET, paht="/hello-world") : spring4.0 이전에서 사용됨
	// 현재는 GetMapping으로 사용됨
	@GetMapping(path = "/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	@GetMapping(path = "/hello-world-bean/path-variable/{name}")
	public HelloWorldBean helloWorldBean(@PathVariable String name) { //PathVariable : 가변 변수를 사용하겠다는 의미
		return new HelloWorldBean(String.format("Hello World, %s ", name));
	}
	
	@GetMapping(path = "/hello-world-internationlized")
	public String helloWorldInternamtionlized(@RequestHeader(name="Accept-Language", required=false) Locale locale) {
		return messageSource.getMessage("greeting.message", null, locale);
	}
}
