package com.excercise;

import java.util.Arrays;

public class InsertionSort{
	
	
	public static void main(String[] args) {
		
		int array[]={2,8,4,7,1,3};
		
		System.out.println("Before sorting..."+Arrays.toString(array));
		insertionSort(array);
		
		System.out.println("After sorting..."+Arrays.toString(array));
		
	}
	
	
	public static void insertionSort(int [] array){
		int min=0;
		int minIndex=0;
		for (int i = 1; i < array.length; i++) {
			min=array[i];
			minIndex=i;
			for(int j=i-1;j>=0;j--){
				if(min<=array[j]){
					swap(array, minIndex, j);
					minIndex=j;
				}
			}
		}
		
	}
	
	public static void swap(int array[],int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
	}
}