package com.excercise;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class Factorial {

	static char c;
	
	public static void main(String[] args) {

		int array[] = { 1,2,3,4,5 };
		
		Calendar calendar=Calendar.getInstance();
		calendar.set(2017,Calendar.APRIL,20, 0, 0, 0);
		
		Date d=new Date(117,03,20,00,1,1);
		System.out.println(d+":::"+calendar.getTime());
		
		System.out.println("date compare:"+ (d.getTime() >= calendar.getTimeInMillis()));

		System.out.println("Before sorting..." + Arrays.toString(array));
		
		System.out.println("char c;::"+c);

		for (int i = 0; i < array.length; i++) {
			fact(array[i]);

		}

		System.out.println("After sorting..." + Arrays.toString(array));

	}

	static void fact(int m) {
		int result[]=new int[m];
		if (m > 0) {
			result[0]=1;
			//result[1]=2;
			//int count=1;
			for (int i = 1; i < m ; i++) {
				result[i] = (i+1) * result[i - 1];
				
			}
			System.out.println("fact of "+ m+ " is "+result[m-1]);
		}
	}
}
