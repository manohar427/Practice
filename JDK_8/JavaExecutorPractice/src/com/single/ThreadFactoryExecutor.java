package com.single;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

//https://examples.javacodegeeks.com/core-java/util/concurrent/threadfactory/java-util-concurrent-threadfactory-example/
public class ThreadFactoryExecutor {

	public static void main(String[] args) {
		CustomThreadFactoryBuilder tf = new CustomThreadFactoryBuilder();

		ExecutorService executorService = Executors.newFixedThreadPool(3, tf);

		SimpleTask simpleTask1 = new SimpleTask();
		SimpleTask simpleTask2 = new SimpleTask();
		SimpleTask simpleTask3 = new SimpleTask();
	
		executorService.execute(simpleTask1);
		executorService.execute(simpleTask2);
		executorService.execute(simpleTask3);
	}
}

class CustomThreadFactoryBuilder implements ThreadFactory {
	public Thread newThread(Runnable runnable) {
		Thread thread = new Thread(runnable);
		thread.setName("My thread:");
		thread.setDaemon(true);
		thread.setPriority(Thread.MAX_PRIORITY);
		return thread;
	}
}

class SimpleTask implements Runnable {
	public void run() {
		try {
			System.out.println("Simple task is running on " + Thread.currentThread().getName() + " with priority "
					+ Thread.currentThread().getPriority());
			Thread.sleep(Thread.currentThread().getPriority());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
