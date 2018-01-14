package com.test;

public class ReverseNumber {

	public static void main(String[] args) {

		int n = 123456;

		int rn = 0;
		while (n != 0) {

			int temp = n % 10;

			rn = rn * 10 + temp;
			n = n / 10;
		}
		System.out.println(rn);
	}

}
