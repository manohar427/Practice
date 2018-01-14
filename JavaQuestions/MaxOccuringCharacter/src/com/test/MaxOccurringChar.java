package com.test;

import java.util.HashMap;

public class MaxOccurringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "wfaveqr caafwefwgqrvwerwbhqfvwrfwvbetqfwef q fwgwfw erfq";
		System.out.println("The max character is : " + findMaxOChar(text));
	}

	private static Character findMaxOChar(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character maxChar = ' ';
		long max = 0;
		for (int i = 0; i < text.length(); i++) {
			Character current = text.charAt(i);
			if (map.containsKey(current)) {
				map.put(current, map.get(current) + 1);
			} else {
				map.put(current, 1);
			}
			if (map.get(current) > max) {
				maxChar = current;
				max = map.get(current);
			}
		}
		System.out.println("Max char:" + maxChar + ",Count:" + max);
		return maxChar;
	}

}
