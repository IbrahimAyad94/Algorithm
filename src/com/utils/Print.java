package com.utils;

import java.util.Arrays;

public abstract class Print {

	public static void printArr(int[] arr, String msg) {
    	System.out.println(msg + ": " + Arrays.toString(arr));
    }
    
    
    public static void printSingleValue(Object value, String msg) {
    	System.out.println(msg + ": " + value);
    }
    
}
