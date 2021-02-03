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

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig2.xml");

		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.toString());
		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2.toString());
		Employee emp3 = context.getBean("employee3", Employee.class);
		System.out.println(emp3.toString());

		Person person = context.getBean("employee", Employee.class);
		person.eat();

		((AbstractApplicationContext) context).close();
	}
}
