package com.kea.day4.test;

public abstract class Employee {
	private int empNo;
	private String name;
	
	public Employee() {	}

	public Employee(int num, String name) {
		setNum(num);
		setName(name);
	}
	
	public abstract int getSalary();

	public int getNum() {
		return empNo;
	}

	public void setNum(int num) {
		this.empNo = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("empNo=");
		builder.append(empNo);
		builder.append(", name=");
		builder.append(name);
		return builder.toString();
	}	
}
