package com.cg.lab06.ui;

import java.util.HashMap;
import java.util.Iterator;

public class Exercise3 {

	public static HashMap<Integer, Integer> method(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap<>();

		for (int n : array) {
			hm.put(n, n * n);
		}
		return hm;
	}

	public static void main(String[] args) {
		int array[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		HashMap<Integer, Integer> hm = method(array);

		Iterator<Integer> it = hm.keySet().iterator();
		while (it.hasNext()) {
			Integer key = it.next();
			System.out.println(key + " : " + hm.get(key));
		}
	}
}
