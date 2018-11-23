package com.example.redis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=SpingbootRedisApplication.class)
public class RedisTest {

	@Autowired
	private RedisTemplate<String,String> redisTemplate;
	
	@Test
	public void testRedis(){
		String result = redisTemplate.boundValueOps("users").get();
		if (result==null||result.trim().equals("")) {
			result="[{\"id\":1,\"name\":\"张三\",\"addr\":\"广东珠海\",\"age\":13},{\"id\":2,\"name\":\"李四\",\"addr\":\"广东广州\",\"age\":14}]";
			redisTemplate.boundValueOps("users").set(result);
			System.out.println("redis 设置数据:"+result);
		}else{
			System.out.println("redis 获取到的:"+result);
		}
	}
	
}
