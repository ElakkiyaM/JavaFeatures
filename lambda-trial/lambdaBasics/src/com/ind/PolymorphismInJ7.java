package com.ind;

public class PolymorphismInJ7 {

	public void Greet(Greeting greeting) {
		greeting.perform();
	}
	public static void main(String[] args) {
		
		// Traditional interface implementation		
		PolymorphismInJ7 poly = new PolymorphismInJ7();		
		Greeting hello = new HelloWorld();
		poly.Greet(hello);		
		
		// Lamda expression implementation
		Greeting lambdaImpl = () -> System.out.println("Hello world from lambda expression");
		lambdaImpl.perform();
		
		// using anonymous inner class
		 Greeting innerClassGreeting = new Greeting() {
			 public void perform() {
				 System.out.println("Hello world from anonymous inner class");
			 }
		 };		 
		poly.Greet(innerClassGreeting);
	}
 
}
