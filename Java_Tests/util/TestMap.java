package com.kea.day4.util;

import java.util.HashMap;
import java.util.Map;

import com.kea.day3.cms.Bus;
import com.kea.day3.cms.Car;
import com.kea.day3.cms.Taxi;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Car> m = new HashMap<>();
		m.put("22나1234", new Bus("22나1234", "타요", 5000,45));
		m.put("11나7734", new Bus("11나7734", "타요", 5000,45));
		m.put("33호3223", new Taxi("33호3223", "소나타", 4500, 2000));
		
		System.out.println(m.get("22나1234"));
		System.out.println(m.get("11나7734"));
		System.out.println(m.get("33호3223"));
		m.remove("11나7734");
		for(String key :m.keySet()) {
			System.out.println(key);
			System.out.println(m.get(key));
		}
	}
}