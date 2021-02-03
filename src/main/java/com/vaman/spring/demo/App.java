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

//		object creation without spring 
//		Employee obj = new Employee(); 
//		obj.work();

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = (Employee) context.getBean("employee"); // also possible 

		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.toString());

		Employee emp2 = context.getBean("employee2", Employee.class);
		System.out.println(emp2.toString());

		Department dept = context.getBean("department", Department.class);
		System.out.println(dept.toString());

		Employee emp3 = context.getBean("employee3", Employee.class);
		System.out.println(emp3.toString());

		Employee emp4 = context.getBean("employee4", Employee.class);
		System.out.println(emp4.toString());

		((AbstractApplicationContext) context).close();

		System.out.println("End");

	}
}
