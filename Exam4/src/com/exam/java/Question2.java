package com.exam.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Question2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(3, "Honda");
		map.put(2, "Ford");
		map.put(1, "Chevrolte");
		map.put(5, "Jagwar");
		map.put(4, "Dodge");
		
		TreeMap<Integer, String > treemap = new TreeMap<Integer, String>(map);
		System.out.println(treemap);

		

		}


	}


