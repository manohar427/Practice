package com.test;

///Worst case performance: O(log n)
///Best case performance: O(1)

public class MyBinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 6, 8, 10, 12, 14, 16 };

		int index = binarySearch(arr, 14);
		System.out.println("Index:"+index);
	}

	private static int binarySearch(int[] arr, int key) {

		int start = 0;
		int end = arr.length - 1;

		
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == key)
				return mid;
			if (key < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

}
