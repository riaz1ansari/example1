package com.excercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

	public static void main(String[] args) throws Exception{
		
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list2=new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		
		list2.add(4);
		list2.add(5);
		list2.add(7);
		
		List<List<Integer>> list3=new ArrayList<List<Integer>>();
		list3.add(list);
		list3.add(list2);
		
		Iterator itr=list3.iterator();
		
		MIterator<Integer> itrm=new MIterator<Integer>(itr);
		
		int i=0;
//		while(itrm.hasNext()){
			System.out.println(itrm.next());
			System.out.println(itrm.next());
			//if(i==2){
				itrm.remove();
//			}
//			i++;
//		}
		
		MIterator<Integer> itrm1=new MIterator<Integer>(itr);
		
		while(itrm1.hasNext()){
			System.out.println(itrm1.next());
		}
		
		
	}


}
