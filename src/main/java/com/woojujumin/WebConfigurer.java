package com.woojujumin;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration		// 설정
public class WebConfigurer implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		
		// 접속 클라이언트 허가
		registry.addMapping("/**").allowedOrigins("*"); // 모든 접속 허용
	//	registry.addMapping("/**").allowedOrigins("http://localhost:8090");
	}

	
}
