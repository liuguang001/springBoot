package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix="person")
public class HelloController {
	
	private String addr;
	private Integer age;

	@Value("${name}")
	private String name;
	
	@RequestMapping("/hello")
	public String hello(){
		return "hello spring boot";
	}
	
	@RequestMapping("/value")
	public String value() {
		return "getName:"+name;
	}

	@RequestMapping("/objValue")
	public String objValue() {
		return name+age+addr;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
