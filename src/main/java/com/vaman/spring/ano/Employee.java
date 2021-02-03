package com.vaman.spring.ano;

import org.springframework.stereotype.Component;

@Component
public class Employee {

	Department department;

	public Employee(Department department) {
		super();
		this.department = department;
	}

}
