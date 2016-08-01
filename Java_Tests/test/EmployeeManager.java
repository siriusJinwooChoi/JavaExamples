package com.kea.day4.test;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager implements IManager {
	ArrayList<Employee> ep = new ArrayList<Employee>();
	
	public void add(Employee e) {
		ep.add(e);
	}

	public int size() {
		return ep.size();
	}
	
	//모든 정보를 보여줄 메서드	
	public Employee[] allList() {
		Employee[] np = new Employee[size()];
		ep.toArray(np);								//배열로 바꿔주는 작업
		return np;
	}
	
	
	public void partTimeEmpList() {
		for(Employee e:ep) {
			if(e instanceof PartTimeEmployee) {
				System.out.println(e);
			}
		}
	}
	
	public void fullTimeEmpList() {
		for(Employee e:ep) {
			if(e instanceof FullTimeEmployee) {
				System.out.println(e);
			}
		}
	}
	
	public int getTotalSalary() {
		int sum=0;
		for(Employee e:ep) {
			sum += e.getSalary();
		}
		return sum;
	}
	
	public Employee search(int snum) {
		for(Employee e:ep) {
			if(e.getNum() == snum) {
				return e;
			}
		}
		return null;
	}
	
	public Employee[] search(String name) {
		int count=0;
		for(Employee e:ep) {
			if(e.getName().contains(name)) {
				count++;
			}
		}
		Employee[] np = new Employee[count];
		int n=0;
		for(Employee e:ep) {
			if(e.getName().contains(name)) {
				np[n++] = e;
			}
		}
		return np;
	}
}