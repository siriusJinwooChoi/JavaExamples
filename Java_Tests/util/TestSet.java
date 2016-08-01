package com.kea.day4.util;

import java.util.HashSet;
import java.util.Set;

public class TestSet {

	public static void main(String[] args) {
		/*Set s = new HashSet();
		s.add("seoul");
		s.add(new Bus());*/
		Set<String> s = new HashSet<String>();
		s.add("seoul");
		s.add("busan");
		s.add("inchun");
		s.add("seoul");
		
		for(String city: s) //s.size()
			System.out.println(city);
		//System.out.println(s.get(2));
	}

}
