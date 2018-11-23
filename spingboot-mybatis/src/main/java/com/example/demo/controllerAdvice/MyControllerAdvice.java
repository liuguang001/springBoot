package com.example.demo.controllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.ControllerAdvice;

/**全局异常处理
 * @author 
 */
@ControllerAdvice
public class MyControllerAdvice {
	
	private static Map<String,Object> erroData=null;
	
	static{
		erroData=new HashMap<>();
		erroData.put("state",1);
		erroData.put("msg","系统出错,请稍后重试!");
	}
	
	@ExceptionHandler(value=Exception.class)
	@ResponseBody
	public Object erroResponse(){
		return erroData;
	}
}
