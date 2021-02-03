package com.vaman.spring.ano;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

@ComponentScan
public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(App.class);
		Employee emp = ctx.getBean(Employee.class);
		emp.work(); 
	}

}
