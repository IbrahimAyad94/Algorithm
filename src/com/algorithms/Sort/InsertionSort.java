package com.algorithms.Sort;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {8, 2, 9, 5, 6, 7, 4, 3, 1};
		
		arr = insertionSort(arr);
		Print.printArr(arr, "Insertion Sort");
	}

	/**
	  
	  	Step 1 - Assume that first element in the list is in sorted portion and all the remaining elements are in unsorted portion.
		Step 2: Take first element from the unsorted portion and insert that element into the sorted portion in the order specified.
		Step 3: Repeat the above process until all the elements from the unsorted portion are moved into the sorted portion.
	  
	  
	  	Worst Case : O(n2)
		Best Case : Ω(n)
		Average Case : Θ(n2)
		
		Animation => https://miro.medium.com/max/1102/1*qc-KD7DII1K097jnvOWqsg.gif
	 */
	public static int[] insertionSort(int[] arr) {
     	 
     	 for(int i = 1; i < arr.length; i++) {
     		 int key = arr[i];
     		 int j = i - 1;
     		 while(j >= 0 && arr[j] > key) {
     			 arr[j + 1] = arr[j];
     			 j--;
     		 }
     		arr[j + 1] = key;
     	 }
     	 
     	return arr;
    }
   
	
}
