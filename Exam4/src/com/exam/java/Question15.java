package com.exam.java;

import java.util.ArrayList;

public class Question15 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("Ford");
		list.add("BMW");
		list.add("Benz");
		System.out.println(list);
		list.add("Honda");
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		list.add(0, "Honda");
		System.out.println(list);
		list.remove(0);
		System.out.println(list);
	}
}
