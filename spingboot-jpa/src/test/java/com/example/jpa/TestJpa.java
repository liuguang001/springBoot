package com.example.jpa;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.jpa.domain.User;
import com.example.jpa.repositry.UserRepositry;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpingbootJpaApplication.class)
public class TestJpa {
	
	@Autowired
	private UserRepositry userRepositry;
	
	@Test
	public void TestUserListAll() throws JsonProcessingException {
		List<User> findAll = userRepositry.findAll();
		ObjectMapper objectMapper=new ObjectMapper();
		String writeValueAsString = objectMapper.writeValueAsString(findAll);
		System.out.println(writeValueAsString);
	}
}
