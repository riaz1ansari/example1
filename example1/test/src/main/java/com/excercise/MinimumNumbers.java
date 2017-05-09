package com.excercise;

public class MinimumNumbers {

	public static void main(String[] args) {
		int a[]={6,5,1,4,3,6,4,2,1,4,3};
		System.out.println(min(a));;
	}

	public static int min(int a[]){
		
		int start=1;
		int end=a.length-1;
		
		int min=a[start];
		while(start<=end){
			
			if(a[start]<=min){
				min=a[start];
			}
			
			if(a[end]<min){
				min=a[end];
			}
			
			start++;
			end--;
			System.out.println("running...");
		}
		
		return min;
	}
}
