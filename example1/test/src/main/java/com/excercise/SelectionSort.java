package com.excercise;

import java.util.Arrays;

public class SelectionSort{
	
	
	public static void main(String[] args) {
		
		int array[]={2,8,4,7,1,3};
		
		System.out.println("Before sorting..."+Arrays.toString(array));
		selectionSort(array);
		
		System.out.println("After sorting..."+Arrays.toString(array));
		
	}
	
	
	public static void selectionSort(int [] array){
		int min=0;
		for (int i = 0; i < array.length-1; i++) {
			int minIndex=i;
			min=array[i];
			for(int j=i+1;j<array.length;j++){
				if(array[j]<min){
					minIndex=j;
					min=array[j];
				}
			}
			if(minIndex!=i){
				swap(array, i, minIndex);
			}	
		}
		
	}
	
	public static void swap(int array[],int i,int j){
		int temp=array[i];
		array[i]=array[j];
		array[j]=temp;
		
	}
}