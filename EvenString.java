package com.java.interview;

public class EvenString {
	public static int calculateString(String str) {

		int l = str.length();

		int maxValue = 0, count = 0;

		for (int i = 0; i < l; i++) {
			if (str.charAt(i) != ' ')
				count++;
			else if (count % 2 == 0 && count > maxValue) {
				maxValue = count;
				count = 0;
			} else
				count = 0;
		}

		return maxValue;
	}

	public static void main(String[] args) {

		String s = "Today is a wonderfullly day";

		int x = calculateString(s);

		System.out.println(x);

	}
}
