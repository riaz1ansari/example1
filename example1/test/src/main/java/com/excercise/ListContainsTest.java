package com.excercise;

import java.util.ArrayList;
import java.util.List;

public class ListContainsTest {

	public static void main(String[] args) {
//		System.out.println(args.length);
//		//System.out.println(args[0]);
//		
//		System.out.println((Integer.toBinaryString(-5 << 2))+ " == "+(-5 << 2));
//		
//		System.out.println((Integer.toBinaryString(-5 >>> 2))+ " == "+(-5 >>> 2));
//		System.out.println((Integer.toBinaryString(-5 >> 2))+ " == "+(-5 >> 2));
//
//		
//		System.out.println(Integer.MAX_VALUE);
		
		
		List<T> list=new ArrayList<T>();
		
		T t=new T(1L,2L);
		T t2=new T1(2L,3L);
		list.add(t);
		list.add(t2);
		
		
		System.out.println(list.contains(new T1(1L,2L)));
	}
	
	
	

}

class T{
	Long id;
	Long pincode;
	
	T(){
		
	}
	T(Long id,Long pincode){
		this.id=id;this.pincode=pincode;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPincode() {
		return pincode;
	}
	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}
	
}


class T1 extends T{
	T1(Long id,Long pincode){
		super(id, pincode);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		T1 t1=(T1)obj;
		
		return (this.id.equals(t1.id) && this.pincode.equals(t1.pincode));
	}
}