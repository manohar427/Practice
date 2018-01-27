package com.test;

import java.util.Arrays;

public class MinDiffPairs {

	public static void main(String[] args) {
		int a[] = { 5, 4, 6, 3, 2, 21, -20 };

		Arrays.sort(a);

		System.out.println(Arrays.toString(a));

		int minDiff = a[1] - a[0];

		for (int i = 2; i < a.length; i++) {
			minDiff = Math.max(minDiff, a[i] - a[i - 1]);
		}

		for (int i = 1; i < a.length; i++) {
			if (minDiff == a[i] - a[i - 1]) {
				System.out.println("(" + a[i] + "," + a[i - 1] + ")");
			}
		}
	}
}
