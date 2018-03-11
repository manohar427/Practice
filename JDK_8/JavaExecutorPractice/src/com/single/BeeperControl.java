package com.single;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class BeeperControl {

	public static void main(String[] args) {
		ScheduledExecutorService threadPool = Executors.newScheduledThreadPool(2);
		System.out.println("Time before Starting:" + new Date());
		//threadPool.scheduleAtFixedRate(new MyRunnableTask(), 1, 3, TimeUnit.SECONDS);
		threadPool.scheduleWithFixedDelay(new MyRunnableTask(), 1,1, TimeUnit.SECONDS);
		System.out.println("**");

	}
}

class MyRunnableTask implements Runnable {
	public void run() {
		try {
			System.out.println("*Beep*"+Thread.currentThread().getName());
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Time :" + new Date());
	}
}