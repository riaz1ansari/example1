package com.excercise.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListTest {

	public static void main(String[] args) throws Exception{
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		
		Iterator itr=list.iterator();
		
//		while(itr.hasNext()){
//			itr.next();
//			itr.remove();
//		}
		
		
		for (Integer i :list) {
			
			list.remove(1);
			
		}
		
	}


}
