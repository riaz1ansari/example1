package com.excercise;

public class InnerClass {

	public A a;
	private A a1;
	
	public InnerClass() {
		a=new A("name1");
		a1=new A("name2");
	}
	
	public InnerClass(String s1,String s2) {
		a=new A(s1);
		a1=new A(s2);
		
	}
	
	public static void main(String[] args) {
		
		
		InnerClass i=new InnerClass("s1","s2");
		InnerClass i2=new InnerClass("m1","m2");
		
		InnerClass.A s=new InnerClass.A();
		
		System.out.println(InnerClass.A.k);
		System.out.println(i.a1.name);
		
		System.out.println(i2.a.name);
		System.out.println(i2.a1.name);
		
	}
	
	static class A{
		A(String name){
			this.name=name;
		}
		A(){
			this.name="";
		}
		String name="";
		static int k=0;
	}

}
