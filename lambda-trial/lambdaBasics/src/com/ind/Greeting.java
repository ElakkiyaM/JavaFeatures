package com.ind;


/*Functional interface is the Interface with one Abstract Method only. 
This is required to implement the lambda expression.
In java 8 the implementations can be written in the Interface itself.
Thus the functional Interface allows 2 other implementations along with the Abstract Method.

The annotation is optional but a good practice.*/

@FunctionalInterface
public interface Greeting {	
	public void perform();
}
