package com.vaman.spring.jv;

import org.springframework.context.annotation.Bean;

public class SpringConfig {

	@Bean
	public Employee employee() {
		System.out.println("Employee bean");
		return new Employee();
	}

}
