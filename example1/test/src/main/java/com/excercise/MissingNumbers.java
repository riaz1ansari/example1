package com.excercise;

public class MissingNumbers {

	public static void main(String[] args) {
		int a[]={6,5,4,3};
		findMissing(a, a.length+3);
	}

	public static void findMissing(int a[] ,int size){
		
		
		boolean b[]=new boolean[size];
		
		for (int i = 0; i < size-3; i++) {
			b[a[i]]=true;
		}
		
		for (int i = 1; i <size; i++) {
			if(!b[i]){
				System.out.println("missing number "+(i));
			}
		}
	}
}
