package com.kea.day4.util;

import java.util.HashMap;
import java.util.Map;

import com.kea.day3.cms.Bus;
import com.kea.day3.cms.Car;
import com.kea.day3.cms.Taxi;

public class TestMap {

	public static void main(String[] args) {
		Map<String, Car> m = new HashMap<>();
		m.put("22��1234", new Bus("22��1234", "Ÿ��", 5000,45));
		m.put("11��7734", new Bus("11��7734", "Ÿ��", 5000,45));
		m.put("33ȣ3223", new Taxi("33ȣ3223", "�ҳ�Ÿ", 4500, 2000));
		
		System.out.println(m.get("22��1234"));
		System.out.println(m.get("11��7734"));
		System.out.println(m.get("33ȣ3223"));
		m.remove("11��7734");
		for(String key :m.keySet()) {
			System.out.println(key);
			System.out.println(m.get(key));
		}
	}
}