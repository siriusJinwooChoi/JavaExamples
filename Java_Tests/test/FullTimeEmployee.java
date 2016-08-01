package com.kea.day4.test;

public class FullTimeEmployee extends Employee {
	private int annualSalary;
	//private int mpay=0;

	public FullTimeEmployee() {	}

	public FullTimeEmployee(int num, String name, int ypay) {
		super(num, name);
		setYpay(ypay);
	}
	
	public int getSalary() {
		return annualSalary / 12;
	}

	public int getYpay() {
		return annualSalary;
	}

	public void setYpay(int ypay) {
		this.annualSalary = ypay;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", annualSalary=");
		builder.append(annualSalary);
		return builder.toString();
	}	
}
