package com.kea.day4.test;

public interface IManager {

	void add(Employee e);

	int size();

	//��� ������ ������ �޼���	
	Employee[] allList();

	void partTimeEmpList();

	void fullTimeEmpList();

	int getTotalSalary();

	Employee search(int snum);

	Employee[] search(String name);

}