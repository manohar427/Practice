package com.bill;

public abstract class Plan {
	public double rate;

	public abstract void getRate();

	public void calculateBill(int units) {
		System.out.println(units * rate);
	}
}
