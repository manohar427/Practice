package com.test;

import java.io.ObjectInputStream;

public class ObjectCreationways {

	public static void main(String[] args)
			throws CloneNotSupportedException, InstantiationException, IllegalAccessException, ClassNotFoundException {

		// 1. Using `new` keyword:
		Customer c1 = new Customer();

		// 2.By Using Factory Method:
		Runtime c2 = Runtime.getRuntime();

		// 3.Using Clone method
		Customer c3 = (Customer) c1.clone();

		// 4. Using `Class.forName()`:
		Customer c4 = (Customer) Class.forName("com.test.Customer").newInstance();

		// 5.Using object deserialization:
		// ObjectInputStream inStream = new ObjectInputStream( );
		// Customer c5 = (Customer) inStream.readObject();

	}

}

class Customer implements Cloneable {

	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}