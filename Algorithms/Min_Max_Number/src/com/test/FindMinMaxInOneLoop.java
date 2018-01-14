package com.test;

public class FindMinMaxInOneLoop {

	public static void main(String[] args) {
		int arr[] = { 1000, 11, 445, 19, 330, 3000 };
		int mi=arr[0];
		int mx=arr[0];
		for(int i=0;i<arr.length;i++){
			if(mi>arr[i]){
				mi = arr[i];
			}
			
			if(mx<arr[i]){
				mx = arr[i];
			}
		}
		
		System.out.println("Min:"+mi+",Max:"+mx);
	}

}
