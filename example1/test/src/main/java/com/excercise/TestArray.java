package com.excercise;

import java.util.Arrays;
import java.util.Date;

public class TestArray {

	static void test(int[] nums) {

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				swap(nums, i);
			}
		}
	}

	static void swap(int[] nums,int k) {

		for (int i = k; i < nums.length; i++) {
			
			for (int j = k+1; j<=k+1 && j<nums.length; j++) {
				if(nums[i]==0){
					continue;
				}
				int temp=nums[i];
				nums[i]=nums[j];
				nums[j]=temp;
			}
		}
		
		System.out.println(Arrays.toString(nums));

	}

	public static void main(String[] args) {
		int [] arr=new int[]{0,1,2,12,0,0,3,7,0};
		System.out.println(Arrays.toString(arr));
		//swap(arr,0);
		
		swap1(arr);
		System.out.println(Arrays.toString(arr));
		
		
		

	}
	
	static void swap1(int[] nums) {

		int m=0;int n=1;
		while(m <nums.length && n <nums.length){
			
			if(nums[m]==0 && n <nums.length && nums[n]!=0){
				int temp=nums[m];
				nums[m]=nums[n];
				nums[n]=temp;
				m++;n++;
			}else {
				n++;
			}
			//System.out.println(Arrays.toString(nums));
			
		}
		
		

	}

}



class Temp{
	
	java.sql.Date date;
	String city;
	double tempreature;
	
	public java.sql.Date getDate() {
		return date;
	}
	public void setDate(java.sql.Date date) {
		this.date = date;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getTempreature() {
		return tempreature;
	}
	public void setTempreature(double tempreature) {
		this.tempreature = tempreature;
	}
	
	
	
}
