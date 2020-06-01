package com.tier1;

public class NumberSumLength {
	public static boolean checkNumberPowerLength(long num) {
		int sum = 0;
		int length = (int)(Math.log10(sum) + 1);
		for (int number: String.valueOf(num).toCharArray()) {
			sum += Math.pow(number, length);
		}
		if (sum == num) return true;
		return false;
	}
}
