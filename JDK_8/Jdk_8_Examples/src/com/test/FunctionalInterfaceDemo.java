package com.test;

public class FunctionalInterfaceDemo implements F1, F2 {

	@Override
	public void add() {

	}

	@Override
	public void diff() {
	}

	public static void main(String[] args) {
		new FunctionalInterfaceDemo();
	}

}

@FunctionalInterface
interface F1 {
	public void add();

	public default void diff() {
		System.out.println("Diff demo F1");
	}

	public static void mul() {
		System.out.println("Mul demo F1");
	}
}

@FunctionalInterface
interface F2 {
	public default void diff() {
		System.out.println("Diff demo F1");
	}

	public static void mul() {
		System.out.println("Mul demo F1");
	}

	public void add();
}