package com.test;

public class LambdaExpression {

	public static void main(String[] args) {
		Abc ab = (a, b) -> {
			System.out.println("Sum:" + (a + b));
		};
		ab.add(10, 20);
	}
}

interface Abc {
	public void add(int a, int b);
}