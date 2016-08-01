package com.kea.day4.lang;

import java.util.Date;
import java.util.Random;

public class TestMath {

	public static void main(String[] args) {
		System.out.println(Math.round(34.567));
		System.out.println(Math.max(34.567, 343));
		System.out.println(Math.ceil(34.567));
		System.out.println(Math.floor(34.567));
		System.out.println(Math.random());			//0~1사이의 임의의값
		
		Random r = new Random();
		System.out.println(r.nextInt());
		
		Date d = new Date();
		System.out.println(d);
	}
}
