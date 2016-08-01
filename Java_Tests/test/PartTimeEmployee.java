package com.kea.day4.test;

public class PartTimeEmployee extends Employee {
	private int hourlySalary;

	public PartTimeEmployee() {	}

	public PartTimeEmployee(int num, String name, int tpay) {
		super(num, name);
		setTpay(tpay);
	}
	
	public int getSalary() {
		return hourlySalary * 160;
	}

	public int getTpay() {
		return hourlySalary;
	}

	public void setTpay(int tpay) {
		this.hourlySalary = tpay;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(super.toString());
		builder.append(", hourlySalary=");
		builder.append(hourlySalary);
		return builder.toString();
	}
}
