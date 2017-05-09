package com.excercise;

public class TestParent {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		A a = new B(10);

		System.out.println(a.geti());

		A a1 = new A();

		System.out.println(a1.geti());
	}

}

class A {

	A(){
		System.out.println("A");
	}
	
	 int i = 10;
	
	 int geti() throws Exception{
		 
		 try{
			 int k=10/0;
			 return 5;
		 }catch(Exception e){
			 System.out.println("Exception");
			 throw new Exception (e.getMessage());
			 
		 }
		 finally {
			return 10;
		}
		 
	 }
}

class B extends A {

	B(int k){
		
		System.out.println("B");
	}
	
	int i = 20;
	
	 int geti(){
		 return this.i;
	 }
}