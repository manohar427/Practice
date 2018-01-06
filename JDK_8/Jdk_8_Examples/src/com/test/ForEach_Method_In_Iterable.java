package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class ForEach_Method_In_Iterable {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(123);
		list.add(345);
		list.add(4567);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		list.forEach(new Consumer<Integer>() {
			public void accept(Integer t) {
				System.out.println(t);
			}
		});
		System.out.println("--------------------------");
		// lambda Expression
		list.forEach(l -> System.out.println(l));
		// System.out.println
		System.out.println("--------------------------");
		list.forEach(System.out::println);
	}
}
