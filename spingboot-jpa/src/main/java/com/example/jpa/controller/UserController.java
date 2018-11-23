package com.example.jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.jpa.repositry.UserRepositry;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserRepositry userRepositry;
	
	@RequestMapping(value="/listAll",method=RequestMethod.GET)
	public Object listAll(){
		return userRepositry.findAll();
	}
	
	@RequestMapping(value="/findById",method=RequestMethod.GET)
	@ApiImplicitParam(name="id",value="用户id",required=true)
	public Object findById(Integer id){
		return userRepositry.findById(id);
	}
}
