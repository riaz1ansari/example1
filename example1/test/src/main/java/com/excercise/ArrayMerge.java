package com.excercise;

import java.util.Arrays;

public class ArrayMerge {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int b[]={1,5,6,7};
		
		merge(a, b);

	}
	
	public static void merge(int a[],int b[]){

		int len=0;
		int temp[]=new int [a.length+b.length];
		int k=0;
		
		for(int i=0;i<a.length;i++){
			temp[k++]=a[i];
			for(int j=0;i<b.length;j++){
				if(a[i] != b[j]){
					len++;
					temp[k++]=b[j];
				}
			}
			
		}
		
		System.out.println(Arrays.toString(temp));
		
		int r[]=new int [len];
		int l=0;
		int m=0;
		
		for(int i=0;i<len;i++){
			if(i<a.length){
				r[i]=a[l++];				
			}else{
				r[i]=b[m++];
			}
		}
		//int len=a.length+b.length;
		
		System.out.println(Arrays.toString(r));
		
	}
}	

