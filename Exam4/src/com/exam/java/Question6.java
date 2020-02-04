package com.exam.java;

import java.util.ArrayList;
import java.util.LinkedList;

public class Question6 {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("Honda");
		list.add("Ford");
		list.add("Jagwar");
		list.add("Dodge");
		System.out.println(list);

		ArrayList <String> arlist = new ArrayList(list);
		System.out.println(arlist);
	}

}
