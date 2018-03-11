package com.single;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorCallable implements Callable<String> {

	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}

	public static void main(String[] args) {
		//ExecutorService executor = Executors.newFixedThreadPool(2);
		//ExecutorService executor = Executors.newSingleThreadExecutor();
		ExecutorService executor = Executors.newCachedThreadPool();

		List<Future<String>> list = new ArrayList<Future<String>>();
		Callable<String> callable = new ExecutorCallable();
		//for (int i = 0; i < 100; i++) {
			Future<String> future1 = executor.submit(callable);
			Future<String> future2 = executor.submit(callable);
			Future<String> future3 = executor.submit(callable);
			Future<String> future4 = executor.submit(callable);
			list.add(future1);
			list.add(future2);
			list.add(future3);
			list.add(future4);
		//}
		for (Future<String> fut : list) {
			try {
				System.out.println(new Date() + "::" + fut.get());
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		executor.shutdown();
	}

}
