package com.test;

public class ReverseString {

	public static void main(String[] args) {
		String name = "Manohar";

		name = reverseString(name);

		System.out.println(name);
	}

	private static String reverseString(String name) {
		if (name.isEmpty())
			return name;
		return reverseString(name.substring(1)) + name.charAt(0);
	}
}
