package com.single;

public class Client {

	public static void main(String[] args) {
		Customer c1 = Customer.getA();
		Customer c2 = Customer.getA();
		Customer c3 = Customer.getA();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
	}

}
