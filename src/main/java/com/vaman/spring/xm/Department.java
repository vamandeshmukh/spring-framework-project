package com.vaman.spring.xm;

import java.util.List;

public class Department {

	private int id;
	private String name;
	private List<String> functions;

	// constructors, getters, setters, toString etc

	public Department() {
		super();
	}

	public Department(int id, String name, List<String> functions) {
		super();
		this.id = id;
		this.name = name;
		this.functions = functions;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getFunctions() {
		return functions;
	}

	public void setFunctions(List<String> functions) {
		this.functions = functions;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + ", functions=" + functions + "]";
	}

}
