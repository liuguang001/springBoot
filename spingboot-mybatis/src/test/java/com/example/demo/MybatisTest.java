package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.mapper.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpingbootMybatisApplication.class)
public class MybatisTest {
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void testListAll(){
		System.out.println(userMapper.queryUserList());
	}
}
