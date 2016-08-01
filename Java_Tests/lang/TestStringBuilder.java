package com.kea.day4.lang;

public class TestStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("seoul");
		sb.append(" city");
		sb.insert(3, "aaaa");
		sb.reverse();
		
		//sb.setLength(10);
		System.out.println(sb);
	}
}
