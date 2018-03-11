package com.single;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutor {

	public static void main(String[] args) {

		//Runnable input
		// Creates a single thread ExecutorService
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.execute(new MyRunnable1());
		executor.execute(new MyRunnable2());
		executor.shutdown();
		// executor.execute(new MyRunnable2());
		// executor.shutdownNow();
		System.out.println("Executon done.");
	}

}

class MyRunnable1 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class MyRunnable2 implements Runnable {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
