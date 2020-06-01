package com.tier1;

public class NumberSumLength {
	public static boolean checkNumberPowerLength(long num) {
		int sum = 0;
		String[] numArr = Long.toString(num).split("");
		int length = (int)(Math.log10(num) + 1);
		for (String number: numArr) sum += Math.pow(Long.parseLong(number), length);
		if (sum == num) return true;
		return false;
	}
}
