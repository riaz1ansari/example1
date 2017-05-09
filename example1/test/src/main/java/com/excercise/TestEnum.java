package com.excercise;

public class TestEnum {

	public static void main(String[] args) {

		Mode m=Mode.S;
		System.out.println(Mode.S==m);
		
		int k=8;
		
		System.out.println(""+Integer.toBinaryString(k));
		byte b=(byte)128;
		
		int dec=101111111;
		
		System.out.println(b+" "+Integer.toBinaryString(-128));
	}

}

enum Mode{
	A,S;
	
	public String value() {
        return name();
    }

    public static Mode fromValue(String v) {
        return valueOf(v);
    }
}

