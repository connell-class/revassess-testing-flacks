package com.tier1;

public class SumOverArray {
	public static int IterateAndSum(int[] arr) {
		int sum = 0;
		for (int number: arr) sum += number;
		return sum;
	}
}
