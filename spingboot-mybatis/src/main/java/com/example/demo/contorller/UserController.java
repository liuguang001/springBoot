package com.example.demo.contorller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.mapper.UserMapper;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserMapper userMapper;
	
	
	@ApiOperation(value="查询全部用户")
	@RequestMapping(value="/listAll",method=RequestMethod.GET)
	public Object listAll(){
		List<User> queryUserList = userMapper.queryUserList();
		return queryUserList;
	}
}
