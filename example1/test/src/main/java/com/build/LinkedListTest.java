package com.build;

public class LinkedListTest {

	public static void main(String[] args) {
		
		LinkedList<String> list=new LinkedList<String>();
		list.add("first");
		list.add("second");
		list.add("third");
		
		list.printAll();
		
		System.out.println("contains :"+list.contains("third"));
		
		LinkedList<A> list2=new LinkedList<A>();
		list2.add(new A(1));
		list2.add(new A(2));
		list2.add(new A(3));
		
		list2.printAll();
		
		System.out.println("contains :"+list2.contains(new A(1)));
	}

}

class A{
	
	public A(int k) {
		this.k=k;
	}
	
	int k=0;
	
	@Override
	public String toString() {
	
		return k+"";
	}
}