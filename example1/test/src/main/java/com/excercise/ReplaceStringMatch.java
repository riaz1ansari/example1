package com.excercise;

public class ReplaceStringMatch {

	public static void main(String[] args) {
		String test="test%20string%20match";
		String pattern="%20";
		System.out.println(findAndReplace(test,pattern));
	}

	public static String findAndReplace(String test,String pattern){
		
		char arrayoutput[]=test.toCharArray();
		int count=0;
		int matchedchars=0;
		
		for(int i=0;i<test.length();i++){
			 count=0;
			//arrayoutput[i]=test.charAt(i);
			if(arrayoutput[i]!=pattern.charAt(count)){
				while(i<test.length() && arrayoutput[i]!=pattern.charAt(count)){
					i++;
				}
			}
			
			if(i<test.length()){
				for(;i<test.length()&& count<pattern.length() && arrayoutput[i]==pattern.charAt(count) ;i++,count++){
					arrayoutput[i]=' ';
					matchedchars++;
				}
			}
			
		}
		
		return new String(arrayoutput);
	}
}
