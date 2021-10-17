package com.problems;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = factorialByRecursion(5);
		Print.printSingleValue(res, "Factorial");
	}
	
	 public static int factorialByRecursion(int num) {
	    	if (num == 1) return 1;
	    	return num * factorialByRecursion(num - 1);
	  }

}
