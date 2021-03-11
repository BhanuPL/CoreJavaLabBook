package com.cg.lab06.ui;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Exercise7 {

	public static List<Integer> votersList(Map<Integer, Integer> k) {
		List<Integer> li = new ArrayList<>();
		Set<Integer> s = k.keySet();
		for (int i : s) {
			if (k.get(i) >= 18) {
				li.add(i);
			}
		}
		return li;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> ba = new HashMap<>();
		ba.put(14, 8);
		ba.put(52, 63);
		ba.put(63, 36);
		ba.put(10, 41);
		ba.put(28, 23);
		ba.put(47, 52);
		System.out.println(votersList(ba));

	}

}
