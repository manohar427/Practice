package com.test;

import java.util.concurrent.Semaphore;

public class SharedPrinter {
	boolean evenFlag = false;
	// 2 semaphores
	Semaphore semEven = new Semaphore(0);
	Semaphore semOdd = new Semaphore(1);

	// Method for printing even numbers
	public void printEvenNum(int num) {
		try {
			semEven.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		semOdd.release();
	}

	// Method for printing odd numbers
	public void printOddNum(int num) {
		try {
			semOdd.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(num);
		semEven.release();

	}
}
