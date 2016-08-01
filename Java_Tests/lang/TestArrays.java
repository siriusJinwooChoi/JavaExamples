package com.kea.day4.lang;

import java.util.Arrays;

public class TestArrays {

	public static void main(String[] args) {
		int[] su = {10,50,65,12,4};
		int[] ns = new int[10];
		
		//(1) 배열 복사
		ns = Arrays.copyOf(su, su.length);
		for(int i=0; i<ns.length; i++) {
			System.out.println(ns[i]);
		}
		
		//(2) 배열 복사
		/*System.arraycopy(su, 0, ns, 0, su.length);
		for(int i=0; i<su.length; i++) {
			System.out.println(ns[i]);
		}*/
		
		//배열정렬
		Arrays.sort(su);
		for(int i=0; i<su.length; i++) {
			System.out.println(su[i]);
		}
	}
}
