package com.excercise;

import java.util.Arrays;

public class MainTest {

	public static void main(String[] args) {
		System.out.println(args.length);
		//System.out.println(args[0]);
		
		System.out.println(Integer.toBinaryString(-5));
		
		System.out.println(Integer.toBinaryString(5));
		
		System.out.println((Integer.toBinaryString(-5 << 2))+ " == "+(-5 << 2));
		
		System.out.println((Integer.toBinaryString(-5 >>> 2))+ " == "+(-5 >>> 2));
		System.out.println((Integer.toBinaryString(-5 >> 2))+ " == "+(-5 >> 2));

		
		System.out.println(Integer.MAX_VALUE);
		
		double d1=3367.486338797814;
		
		double d2=3367.49;
		
		System.out.println(Math.round(d1*100));
		
		System.out.println(Math.round(d1*100)==Math.round(d2*100));
		
		//Class.forName("");
		
		//print();
		
	}
	
	public static void print(){
		int k=9462015;
		int m=k;
		
		int count =0;
		while (k>0){
			k=k/10;
			count++;
		}
		int[] c=new int[count];
		int p=0;
		
		while (m>0){
			c[p++]=m%10;
			m=m/10;
		}
		boolean exists=true;
		
		System.out.println(Arrays.toString(c));
		 
		 while(exists){
			 exists=false;
			 for(int i=c.length-1;i>=0;i--){
				if(c[i]>0){
					System.out.print("*");
					exists=true;
					c[i]=c[i]-1;
				}else{
					System.out.print(" ");
				}
				
			 }
			 System.out.println("");
		 }
		
		
	}

}
