package com.excercise;

import java.util.Arrays;

public class EvenOddPlace {

	public static void main(String[] args) {
		//int[] a1 = { 2, 1, 4, 3, 5, 7,8 };
		int[] a1 = { 2, 4, 3, 6, 5,1 };
		//int[] a1 = { 2, 1};

		System.out.println(Arrays.toString(a1));
		evenOdd(a1);
		System.out.println(Arrays.toString(a1));
		
	}

	public static void evenOdd(int[] a) {

		int odd=0;
		int even=1;
		int count=0;

		while (odd <=a.length && even <=a.length && count <a.length) {
			if(a[odd]%2==0 && a[even]%2!=0){
				swap(a, odd, even);
				if(checkLength(a,odd+2))
					odd+=2;
				if(checkLength(a,even+2))
					even+=2;
			}
			
			if(a[odd]%2!=0){
				if(checkLength(a,odd+2))
				odd+=2;
			}
			
			if(a[even]%2==0){
				if(checkLength(a,even+2))
				even+=2;
			}
			
			count++;
			
			System.out.println("Odd:"+odd+" even:"+even);
		}

	}

	public static void swap(int[] a, int i, int j) {

		a[i]=a[i]+a[j];	
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
		System.out.println("swap");
	
	}
	
	public static boolean checkLength(int[] a, int len) {

		if(len>=a.length){
			return false;
		}
	
		return true;
	}

}
