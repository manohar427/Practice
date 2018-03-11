package com.single;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {
		MyRunnable5 m1 = new MyRunnable5();
		MyRunnable5 m2 = new MyRunnable5();
		MyRunnable5 m3 = new MyRunnable5();
		ScheduledExecutorService sc = Executors.newScheduledThreadPool(3);

		// Will start command1 after 30 seconds
		//sc.schedule(m1, 10L, TimeUnit.SECONDS);

		// Will start command 2 after 20 seconds, 25 seconds, 30 seconds ...
		sc.scheduleAtFixedRate(m2, 1L, 1L, TimeUnit.SECONDS);

		// Will start command 3 after 10 seconds and if command3 takes 2 seconds
		// to be
		// executed also after 17, 24, 31, 38 seconds...
		//sc.scheduleWithFixedDelay(m3, 1L, 2L, TimeUnit.SECONDS);

		//sc.shutdown();

		System.out.println("okkkkkkkkkkkkkkkkkk");
	}

}

class MyRunnable5 implements Runnable {
	public void run() {
		System.out.println("Execution start Time:"+new Date());
		for (int i = 0; i < 3; i++) {
			try {
				System.out.println(Thread.currentThread().getName() + ":" + i);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}