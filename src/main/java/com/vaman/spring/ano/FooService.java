//package com.vaman.spring.ano;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FooService {
//
//	@Autowired
//	private FooFormatter formatter;
//
//	@Autowired
//	public FooService(FooFormatter formatter) {
//		System.out.println("FooService");
//		this.formatter = formatter;
//	}
//
//	@Autowired
//	public void setFormatter(FooFormatter formatter) {
//		System.out.println("setFormatter");
//		this.formatter = formatter;
//	}
//
//	public String doStuff() {
//		System.out.println("doStuff");
//		return formatter.format();
//	}
//
//}

//package com.vaman.spring.ano;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
//@Component
//public class FooService {
//
//	@Autowired
//	private Formatter formatter;
//
//	@Autowired
//	public FooService(Formatter formatter) {
//		System.out.println("FooService");
//		this.formatter = formatter;
//	}
//
//	@Autowired
//	public void setFormatter(Formatter formatter) {
//		System.out.println("setFormatter");
//		this.formatter = formatter;
//	}
//
//	public String doStuff() {
//		System.out.println("doStuff");
//		return formatter.format();
//	}
//
//}