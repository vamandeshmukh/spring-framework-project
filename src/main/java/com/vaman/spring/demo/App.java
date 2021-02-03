package com.vaman.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Start");

//		Employee obj = new Employee(); 
//		obj.work();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = (Employee) context.getBean("employee");
		Employee emp = context.getBean(Employee.class, "employee");

		System.out.println(emp.toString());

		Department dept = context.getBean(Department.class, "department");
		System.out.println(dept.toString());

		Country country = context.getBean("aaa", Country.class);
		country.travel();

		((AbstractApplicationContext) context).close();

		System.out.println("End");

	}
}
