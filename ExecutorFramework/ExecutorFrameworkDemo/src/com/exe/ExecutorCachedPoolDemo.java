package com.exe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorCachedPoolDemo {

	public static void main(String[] args) {
		ExecutorService fes = Executors.newCachedThreadPool();

		ThreadC t = new ThreadC();
		for (int i = 0; i < 200; i++) {
			t.setI(i);
			fes.execute(t);
		}

		fes.shutdown();
		while (!fes.isTerminated()) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Not terminated");
		}
	}
}

class ThreadC implements Runnable {
	int i = 0;

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName());
	}
}
