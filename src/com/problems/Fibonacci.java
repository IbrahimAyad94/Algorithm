package com.problems;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = fibonannciByRecurstion(6);
		Print.printSingleValue(res, "Fibonacci");
	}

	public static int fibonannciByRecurstion(int num) {
    	if (num == 1|| num == 2) return 1;
    	return fibonannciByRecurstion(num -1 ) + fibonannciByRecurstion(num - 2);
    }
}
