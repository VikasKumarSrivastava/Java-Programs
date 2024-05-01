package com.nt.config;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nt.sbeans")
public class AppConfig {
	public AppConfig() {
		System.out.println("App Config 0 parameter constuctor called");
	}
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		System.out.println("returning bean object from bean method");
		return LocalDateTime.now();
	}
}
