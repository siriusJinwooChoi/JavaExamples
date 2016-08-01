package com.kea.day4.test;

public interface IManager {

	void add(Employee e);

	int size();

	//모든 정보를 보여줄 메서드	
	Employee[] allList();

	void partTimeEmpList();

	void fullTimeEmpList();

	int getTotalSalary();

	Employee search(int snum);

	Employee[] search(String name);

}