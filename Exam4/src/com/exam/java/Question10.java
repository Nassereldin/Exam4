package com.exam.java;

public class Question10 {

	public static void strConcat(String str1) {
		str1 = str1 + "World";
	}

	public static void strBufconcat(StringBuffer str2) {
		str2.append("World");
	}

	public static void strBuilderconcat(StringBuilder str3) {
		str3.append("World");
	}

	public static void main(String[] args) {

		String str1 = "Hello ";
		strConcat(str1);
		System.out.println(str1);
		StringBuffer str2 = new StringBuffer("Hello ");
		strBufconcat(str2);
		System.out.println(str2);
		StringBuilder str3 = new StringBuilder("Hello ");
		strBuilderconcat(str3);
		System.out.println(str3);

	}

}
