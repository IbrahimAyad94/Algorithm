package com.algorithms.Sort;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8, 2, 9, 5, 6, 7, 4, 3, 1};
		
		arr = bubbleSort(arr);
		Print.printArr(arr, "Bubble Sort");
		
		arr = enhancedBubbleSort(arr);
		Print.printArr(arr, "Bubble Sort With Enhance To Best Case (Array Sorted)");

	}

	/** 
	Look at the first number in the list.
	Compare the current number with the next number.
	Is the next number smaller than the current number? If so, swap the two numbers around. If not, do not swap.
	Move to the next number along in the list and make this the current number.
	Repeat from step 2 until the last number in the list has been reached.
	If any numbers were swapped, repeat again from step 1.
	If the end of the list is reached without any swaps being made, then the list is ordered and the algorithm can stop.
	
	 Animation => https://www.programmingsimplified.com/images/c/bubble-sort.gif
	 */
	public static int[] bubbleSort(int[] arr) {
    	for (int i = 0; i < arr.length; i++) {
    		for (int j = 1; j < arr.length; j++) {
    			if (arr[j] < arr[j - 1]) {
    				int temp = arr[j - 1];
    				arr[j - 1] = arr[j];
    				arr[j] = temp;
    			}
    		}
    	}
    	
    	return arr;
    }
    
    public static int[] enhancedBubbleSort(int[] arr) {
    	boolean isSwapped = true;
    	for(int i = 0; i < arr.length; i++) {
    		while(isSwapped) {
    			isSwapped = false;
    			for (int j = 1; j < arr.length - i; j++) {
        			if (arr[j - 1] > arr[j]) {
        				isSwapped = true;
        				int temp = arr[j];
        				arr[j] = arr[j - 1];
        				arr[j - 1] = temp;
        			}
        		}
    		}
    		
    	}
    	return arr;
    }
    
}
