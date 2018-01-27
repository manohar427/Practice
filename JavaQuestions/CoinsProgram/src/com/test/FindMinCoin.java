package com.test;

import java.util.ArrayList;
import java.util.List;

public class FindMinCoin {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		int deno[] = { 1, 2, 5, 10, 20, 50, 100, 500, 1000 };
		int V = 151;
		int n = deno.length;
		List l = new ArrayList();
		// Traverse through all denomination
		for (int i = n - 1; i >= 0; i--) {
			// Find denominations
			while (V >= deno[i]) {
				V -= deno[i];
				l.add(deno[i]);
			}
		}

		// Print result
		for (int i = 0; i < l.size(); i++)
			System.out.println(l.get(i));
	}

}
