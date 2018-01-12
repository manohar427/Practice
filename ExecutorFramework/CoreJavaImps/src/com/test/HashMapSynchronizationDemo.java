package com.test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSynchronizationDemo {
	public static void main(String[] args) {
		Map<String, String> currencies = new HashMap<String, String>();

		currencies.put("USA", "USD");
		currencies.put("England", "GBP");
		currencies.put("Canada", "CAD");
		currencies.put("HongKong", "HKD");
		currencies.put("Australia", "AUD");
		
		currencies = Collections.synchronizedMap(currencies);
		
		Set<String> set = currencies.keySet();
		synchronized (currencies) {
		     Iterator<String> it =  set.iterator();	
		     while(it.hasNext()){
		    	 System.out.println(currencies.get(it.next()));
		     }
		}
		

	}
}
