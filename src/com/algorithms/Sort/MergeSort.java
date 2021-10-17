package com.algorithms.Sort;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] array = {5, 4, 3, 2, 1};
	        mergeSort(array);
	        for(int i =0; i< array.length;++i){
	            System.out.print(array[i]+ " ");
	        }

	}

	
	/**
	  Animation => https://cdn-images-1.medium.com/max/600/1*ZwWt6m6bMRZTL_-8r4zOOQ.gif
	 */
	public static void mergeSort(int[] arr) {
		
		int len = arr.length;
		
		// base case
		if (len == 1) return;
		
		// move data to new arrays
		int mid = len / 2;
		int[] left = new int[mid];
		int[] right = new int[len - mid];
		
		for(int i = 0; i < len; i ++) {
			if (i < mid) {
				left[i] = arr[i];
			} else {
				right[i - mid] = arr[i];
			}
		}
		
		
		
		// split again until base case
		mergeSort(left);
		mergeSort(right);
		
		
		// merge
		merge(left, right, arr);
	}
	
	public static void merge(int[] left, int[] right, int[] arr) {
		int i = 0, l = 0, r = 0;
		int leftSize = left.length, rightSize = right.length;
		while (l < leftSize && r < rightSize) {
			if (left[l] < right[r]) {
				arr[i++] = left[l++];
			} else {
				arr[i++] = right[r++];
			}
		}
		
		while(l < leftSize) {
			arr[i++] = left[l++];
		}
		
		while(r < rightSize) {
			arr[i++] = right[r++];
		}
	}
}
