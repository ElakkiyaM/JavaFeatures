package com.ind;

public class TypeInferenceExample {

	public static void main(String[] args) {
		
	// Lambda Exprn
	StringLengthLambda stringLambda = s -> s.length();
	System.out.println(stringLambda.getLength("Hello Aadhvick Sai"));
	
	//With a method impl
	printLamda(s -> s.length());
	}	
	
	public static void printLamda(StringLengthLambda l) {
		System.out.println(l.getLength("Hello World"));
	}

	interface StringLengthLambda {
		int getLength(String s);
	}
}

