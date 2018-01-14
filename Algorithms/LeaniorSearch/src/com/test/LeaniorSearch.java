package com.test;

//O(N)
public class LeaniorSearch {

	public static void main(String[] args) {
		int[] arr1= {23,45,21,55,234,1,34,90};
        int searchKey = 34;
        
        int index = linerSearch(arr1,searchKey);
        
        System.out.println("Search Key:"+searchKey+",index:"+index);
	}

	private static int linerSearch(int[] arr1, int searchKey) {
          		for(int i=0;i<arr1.length;i++){
          			if(arr1[i]==searchKey){
          				return i;
          			}
          		}
          		return -1;
	}

}
