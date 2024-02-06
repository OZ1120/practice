package edu.kh.array.ex;

import java.util.Arrays;

public class ArrayEx2 {

	public void method1() {

		int[] arr1 = {100, 200,300,400};
		int[] arr2 = arr1;

		System.out.println("array1 : "+Arrays.toString(arr1));
		System.out.println("array2 : "+Arrays.toString(arr2));
		
		arr1[0] = 1234;
		arr2[1] = 9876;

		System.out.println("array1 : "+Arrays.toString(arr1));
		System.out.println("array2 : "+Arrays.toString(arr2));
	}
	
	public void method2() {
		
		int[] arr1 = {10,20,30,40,50};
		
		int[]arr2 = new int[arr1.length];
		int[]arr3 = new int[arr1.length];
		
		for(int i=0; i<arr1.length; i++) {
			arr2[i]= arr1[i];
		}

		System.arraycopy(arr1, 0, arr3, 0, arr1.length);

		System.out.println("arr1 : " + Arrays.toString(arr1)); //원본
		System.out.println("arr2 : " + Arrays.toString(arr2));
		System.out.println("arr3 : " + Arrays.toString(arr3));
		
		arr1[0] = 999;
		arr2[1]= 888;
		arr3[2]= 777;
		System.out.println("==============================="); //
		System.out.println("arr1 : " + Arrays.toString(arr1)); //원본
		System.out.println("arr2 : " + Arrays.toString(arr2)); // for
		System.out.println("arr3 : " + Arrays.toString(arr3)); // arraycoy
		
	}
	
	
}
