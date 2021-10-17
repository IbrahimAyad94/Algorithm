package com.algorithms.Sort;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8, 2, 9, 5, 6, 7, 4, 3, 1};
		
		arr = selectionSort(arr);
		Print.printArr(arr, "Selection Sort");
		
	}
	/**
	 	Step 1 - Select the first element of the list (i.e., Element at first position in the list).
		Step 2: Compare the selected element with all the other elements in the list.
		Step 3: In every comparision, if any element is found smaller than the selected element (for Ascending order), then both are swapped.
		Step 4: Repeat the same procedure with element in the next position in the list till the entire list is sorted.
	
	 
	 	Worst Case : O(n2)
		Best Case : Ω(n2)
		Average Case : Θ(n2)
		
		Animation => https://i2.wp.com/algorithms.tutorialhorizon.com/files/2019/01/Selection-Sort-Gif.gif?ssl=1

	 */
	 public static int[] selectionSort(int[] arr) {
	    	for(int i = 0; i < arr.length - 1; i++) {
	    		int min = i;
				for (int j = i; j < arr.length; j++) {
					if (arr[j] < min) {
						min = j;
					}
				}
				
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
	    		
	    	}
	    	return arr;
	    }
	 
}
