package com.exam.java;

import java.util.ArrayList;
import java.util.Collections;

public class Question8 {

	public static void main(String[] args) {

		ArrayList <String> list = new ArrayList <>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
