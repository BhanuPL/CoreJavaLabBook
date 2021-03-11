package com.cg.lab06.ui;

import java.util.HashMap;
import java.util.Map;

public class Exercise2 {

	public class CountChars {
		public void register(char c[]) {
			Map<Character, Integer> me = new HashMap<>();
			for (char c1 : c) {
				if (me.containsKey(c1)) {
					int a = me.get(c1);
					me.put(c1, a + 1);
				} else {
					me.put(c1, 1);
				}
			}
			System.out.println(me);
		}

		public void main(String[] args) {
			String str = "Bhanu";
			char arr[] = str.toCharArray();
			CountChars obj = new CountChars();
			obj.register(arr);

		}

	}

}
