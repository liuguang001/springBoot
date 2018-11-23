package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
	
	@Bean
	public Docket getDocket(){
		Docket docket = new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(getApiInfo())
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.demo.contorller"))
				.paths(PathSelectors.any())
				.build();
		return docket;
	}
	private ApiInfo getApiInfo(){
		ApiInfo apiInfo = new ApiInfoBuilder()
				.title("springboot整合Mybatis")
				.description("关注:https://github.com/liuguang001")
				.termsOfServiceUrl("https://github.com/liuguang001")
				.contact("liuguang001")
				.version("1.0.0")
				.build();
		return apiInfo;
	}
}
