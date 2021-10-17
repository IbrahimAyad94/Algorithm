package com.problems;

import java.util.Arrays;

import com.utils.Print;

public class MinimumNumberOfCoins {
	public static void main(String[] args) {
	// TODO Auto-generated constructor stub
	
		int[] coins = {1, 5, 10, 25, 50, 100};
		int n = 173;
		int[] result = getMinNumOfCoins(coins, n);
		Print.printArr(result, "Minimum Number Of Coins");
		
	}
	
	public static int[] getMinNumOfCoins(int[] coins, int amount) {
		int[] result = new int[coins.length];
		for (int i = coins.length - 1; i >= 0; i--) {
			int count = amount / coins[i];
			result[i] = count;
			amount -= count * coins[i];
		}
		return result;
	}
}
