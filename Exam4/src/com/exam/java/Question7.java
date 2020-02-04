package com.exam.java;

import java.util.HashSet;

public class Question7 {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("Honda");
		hset.add("Benz");
		hset.add("BMW");
		hset.add("Toyota");
		System.out.println(hset);

		String[] array = new String[hset.size()];

		hset.toArray(array);
		for (String newarry : array) {
			System.out.println(newarry);
		}

	}

}
