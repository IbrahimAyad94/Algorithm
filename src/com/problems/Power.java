package com.problems;

import com.utils.Print;

public class Power {
	public static void main(String[] args) {  
		
		Print.printSingleValue(pow(2, 5), "Iteration Version Of Pow");
		Print.printSingleValue(powByRecurstion(2, 5), "Recursion Version Of Pow");
		Print.printSingleValue(enhancedPowByRecurstion(2, 5), "Enhanced Recursion Version Of Pow By Prevent Recalculate Smae vValues");

  }  
  
  public static int pow(int x, int n) {
  	int res = 1;
  	for(int i = 0; i < n; i++) {
  		res *= x;
  	}
  	
  	return res;
  }

  
  public static int powByRecurstion(int x, int n) {
  	
  	if (n == 1) {
  		return x;
  	}
  	
  	if (n % 2 == 0) {
  		return powByRecurstion(x, n/2) * powByRecurstion(x, n/2);
  	} else {
  		return powByRecurstion(x, n/2) * powByRecurstion(x, n/2) * x;
  	}

  }
  
  
	public static int enhancedPowByRecurstion(int x, int n) {
	    	
	    	if (n == 1) {
	    		return x;
	    	}
	    	
	    	int res = enhancedPowByRecurstion(x, n/2);
	    	
	    	if (n % 2 == 0) {
	    		return res * res;
	    	} else {
	    		return res * res * x;
	    	}
	
	    }
}
