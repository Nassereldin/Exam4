package com.exam.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Question1 {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Honda");
		map.put(2, "Ford");
		map.put(3, "Chevrolte");
		map.put(4, "Jagwar");
		map.put(5, "Dodge");

		Set setmap = map.entrySet();
		Iterator iterator = setmap.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.println("key NUmber : " + mentry.getKey() + " & value is : " + mentry.getValue());

		}

	}
}
