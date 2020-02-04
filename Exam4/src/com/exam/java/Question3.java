package com.exam.java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Question3 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("Ford");
		list.add("BMW");
		list.add("Benz");
		list.add("Honda");
		System.out.println(list);

		Collections.sort(list, Collections.reverseOrder());

		System.out.println("ArrayList in descending order:");
		for (String str : list) {
			System.out.println(str);
		}
	}

}
