package com.algorithms.search;

import com.utils.Print;

/**
 * @author Ibrahim Shehta
 */
public class LinerSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int res = linearSearch(new int[] {8, 9, 7, 13, 16, 34}, 13);
    	Print.printSingleValue(res, "Linear Search Result");
	}
	
	/**
	 
	  	Linear search algorithm finds a given element in a list of elements with O(n) time complexity where n is total number of elements in the list. 
	  	This search process starts comparing search element with the first element in the list. If both are matched then result is element found otherwise 
	  	search element is compared with the next element in the list. Repeat the same until search element is compared with the last element in the list, 
	  	if that last element also doesn't match, then the result is "Element not found in the list". That means, the search element is compared with element 
	  	by element in the list.
	 
	 	Step 1: Traverse the array
		Step 2: Match the key element with array element
		Step 3: If key element is found, return the index position of the array element
		Step 4: If key element is not found, return -1
		
		Best Case Time Complexity of Linear Search: O(1)
		Average Case Time Complexity of Linear Search: O(N)
		Worst Case Time Complexity of Linear Search: O(N)
		Space Complexity of Linear Search: O(1)
		
		Animation => https://schwarztiger.files.wordpress.com/2018/08/linear_search.gif
	 */
	public static int linearSearch(int[] arr, int target) {
    	for (int i = 0; i < arr.length; i++) {
    		if (arr[i] == target) {
    			return i;
    		}
    	}
    	return -1;
    }

}
