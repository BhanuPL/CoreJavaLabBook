package com.cg.lab06.ui;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Exercise6 {

	public static List<String> getValues(HashMap<String, String> ee) {
		List<String> mm = new ArrayList<>();
		Collection<String> list = ee.values();
		mm.addAll(list);
		Collections.sort(mm);
		return mm;
	}

	public static void main(String[] args) {
		HashMap<String, String> ee = new HashMap<>();
		ee.put("Bhanu", "20");
		ee.put("Prasanna", "25");
		ee.put("Lakshmie", "14");
		ee.put("Nithya", "25");
		System.out.println(getValues(ee));
	}
}
