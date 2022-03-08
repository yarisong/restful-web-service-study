package com.example.restfulwebservice.helloworld;

import lombok.AllArgsConstructor;
import lombok.Data;


// @Data : get,set 메소드가 생성됨
@Data 
@AllArgsConstructor
public class HelloWorldBean {
	
	private String message;

	
}
