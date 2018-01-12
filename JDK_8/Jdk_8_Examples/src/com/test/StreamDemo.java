package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();

		l1.add(123);
		l1.add(789);
		l1.add(6778);
		l1.add(67);

		Stream<Integer> s1 = l1.stream();
		Stream<Integer> s1high = s1.filter(i -> i > 90);
		s1high.forEach(p -> System.out.println(p));

		Stream<Integer> ps1 = l1.stream();
		Stream<Integer> ps1high = ps1.filter(i -> i > 90);
		ps1high.forEach(p -> System.out.println(p));

	}
}
