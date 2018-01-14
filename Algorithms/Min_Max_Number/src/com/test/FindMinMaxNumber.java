package com.test;

import java.util.Arrays;

public class FindMinMaxNumber {

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 19, 330, 3000 };

		// Using For loop
		int max1 = getMaxNumberForLoop(arr);
		int min1 = getMinNumberForLoop(arr);

		System.out.println("Min1:" + min1);
		System.out.println("Max1:" + max1);
		
		System.out.println("============================");
		
		// Using inbuilt methods
		int max2 = getMaxNumberSort(arr);
		int min2 = getMinNumberSort(arr);

		System.out.println("Min2:" + min2);
		System.out.println("Max2:" + max2);

	}

	private static int getMinNumberSort(int[] arr) {
		Arrays.sort(arr);
		return arr[0];
	}

	private static int getMaxNumberSort(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	private static int getMinNumberForLoop(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if (i < min) {
				min = i;
			}
		}
		return min;
	}

	private static int getMaxNumberForLoop(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (i > max) {
				max = i;
			}
		}
		return max;
	}
}
