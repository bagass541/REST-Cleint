package com.bagas.spring.rest.spring_course_rest_client.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.bagas.spring.rest")
public class MyConfig {
	
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
