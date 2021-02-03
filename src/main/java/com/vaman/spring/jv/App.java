package com.vaman.spring.jv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

public class App {

	public static void main(String[] args) {
		System.out.println("Start");
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

		Employee emp = ctx.getBean(Employee.class);
		emp.work();

		((AbstractApplicationContext) ctx).close();
	}

}
