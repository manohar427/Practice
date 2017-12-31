package com.single;

public class Customer {

	private static Customer obj;

	private Customer() {
	}

	public static Customer getA() {
		if (obj == null) {
			synchronized (Customer.class) {
				if (obj == null) {
					obj = new Customer();// instance will be created at request
											// time
					System.out.println("Customer object is created..");
				}
			}
		}
		return obj;
	}
}
