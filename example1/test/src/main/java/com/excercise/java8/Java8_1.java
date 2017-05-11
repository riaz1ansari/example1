package com.excercise.java8;

import java.util.Arrays;
import java.util.List;

public class Java8_1 {

	static Java8_1 java=new Java8_1();
	
	public static void main(String[] args) {
		
		List<Integer> list=(List<Integer>)Arrays.asList(new Integer []{1,2,3,4,5});
		
		//list.forEach(value -> System.out.println(value));
		
		//list.forEach(System.out::println);
		
		//list.forEach(java::print);
		
		list.forEach(value -> java.print(value));

	}

	public void print(Object obj){
		System.out.println(obj);
	}
}
