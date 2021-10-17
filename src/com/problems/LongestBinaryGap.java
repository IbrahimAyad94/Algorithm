package com.problems;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class LongestBinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int res = getLongestBinaryGap(529);
		 Print.printSingleValue(res, "LongestBinaryGap");
	}

	
	/**
	  A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation 
	  of N. For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 
	  and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1.
	  The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
	 */
	public static int getLongestBinaryGap(int n) {
    	String binary = Integer.toBinaryString(n);
    	System.out.println(binary);
    	int longestGap = 0;
    	boolean start = false;
    	int count = 0;
    	for (int i = 0; i < binary.toCharArray().length; i++) {
    		
    		if (binary.charAt(i) == '1' && !start) {
    			start = true;
    		} else if (binary.charAt(i) == '1' && start) {
    			if (count > longestGap) {
    				longestGap = count;
    			}
    			 count = 0;
    		} else if (binary.charAt(i) == '0' && start) {
    			count++;
    		}
    		
    	}
    	return longestGap;
    }
}
