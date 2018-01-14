package com.test;

///Worst case performance: O(log n)
///Best case performance: O(1)

public class BinarySearchRecursive {

	public static void main(String[] args) {
		int[] arr = {2,45,234,567,876,900,976,999};

		int index = binarySearch(arr, 0, arr.length, 14);
		System.out.println("Index:" + index);
	}

	private static int binarySearch(int[] arr, int start, int end, int key) {

		if (start < end) {
            int mid = start + (end - start) / 2;  
            if (key < arr[mid]) {
                return binarySearch(arr, start, mid, key);
                 
            } else if (key > arr[mid]) {
                return binarySearch(arr, mid+1, end , key);
                 
            } else {
                return mid;   
            }
        }
        return -(start + 1);  
	}
}
