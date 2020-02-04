package com.exam.java;

import java.util.ArrayList;

public class Question5 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ford");
		list.add("BMW");
		list.add("Benz");
		list.add("Honda");
		System.out.println(list);
		list.add(2, "Tesla");
		System.out.println(list);
		list.remove(1);
		System.out.println(list);

	}

}
