package com.kea.day4.util;

import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		/*Set s = new HashSet();
		s.add("seoul");
		s.add(new Bus());*/
		List<String> s = new ArrayList<String>();
		s.add("seoul");
		s.add("busan");
		s.add("inchun");
		s.add("seoul");
		
		//s.remove(1);
		System.out.println(s.size());
		System.out.println(s.contains("busan"));
		for(String city: s) { //s.size()
			System.out.println(city);
		}
		
		//System.out.println(s.get(2));
	}

}
