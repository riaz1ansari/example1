package com.excercise;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int array[] = { 2, 8, 4, 7, 1, 3 };

		System.out.println("Before sorting..." + Arrays.toString(array));
		mergeSort(array);

		System.out.println("After sorting..." + Arrays.toString(array));

	}

	public static void mergeSort(int[] array) {

		if (array.length == 1)
			return;
		int mid = array.length / 2;
		int array1[] = new int[mid];
		int array2[] = new int[array.length - mid];
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (i == mid) {
				index = 0;
			}
			if (i < mid) {
				array1[index++] = array[i];
			} else {
				array2[index++] = array[i];
			}
		}

		mergeSort(array1);
		mergeSort(array2);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		array=merge(array1, array2,array);
		System.out.println(Arrays.toString(array));
	}

	public static void swap(int array[], int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static int[] merge(int array1[], int[] array2,int array[]) {
		int len1 = 0;
		int len2 = 0;
		//int array[] = new int[array1.length + array2.length];
		//array = new int[array1.length + array2.length];
		int k=0;
		
		while(len1< array1.length || len2 <array2.length){
			
			if (len1 >= array1.length && len2 < array2.length) {
				array[k++] = array2[len2++];
			}else 
			
			if (len2 >= array2.length && len1 < array1.length) {
				array[k++] = array1[len1++];
			} else
			
			if(array1[len1] < array2[len2]){
				array[k++] = array1[len1++];
			}else{
				array[k++] = array2[len2++];
			}
		}
		
		while(len1 <array1.length){
			array[k++] = array1[len1++];
		}
		
		while(len2 <array2.length){
			array[k++] = array2[len2++];
		}
		
		return array;
	}
}
