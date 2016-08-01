package com.kea.day4.lang;

public class TestString {

	public static void main(String[] args) {
		String s = new String("Hello world");
		String s2 = "Hello world";
		
		String[] ss = s2.split(" ");
		
		if(s == s2) {
			System.out.println("s == s2");
		}
		if(s.equals(s2)) {
			System.out.println("s.equals");
		}
		if(s.equalsIgnoreCase(s2)) {
			System.out.println("s.equalsIgnore");
		}
		if(s.contains("or")) {
			System.out.println("s.contains('or')");
			System.out.println("s.contains(\"or\")");
		}
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("or"));
		System.out.println(s.substring(2, 4));
		System.out.println(s.substring(2));
		for(int i=0; i<2; i++) {
			System.out.println(ss[i]);
		}
	}

}
