package com.ind.Exercises;

import java.util.function.BiConsumer;

public class ExceptionHandlingEx {

	public static void main(String[] args) {
	
		int[] numbers = {1,2,3,4,5};
		int key = 0;
		
		processOperations(numbers, key, (v,k) -> System.out.println("The sum of value "+v+ " and key " + k +" is: " + (v + k)));
		processOperations(numbers, key, wrapperLambda((v, k) -> System.out.println("The quotient is: " + v/k)));
	}

	private static void processOperations(int[] numbers, int key, BiConsumer<Integer, Integer> consumer) {
		for (int v: numbers) {
			consumer.accept(v, key);
		}
	}
	
	/*
	 * The method is externalized to handle exception and this can be generalized
	 * for such exeption alone. The actual method is used for other process too.
	 */
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
		return(v,k) -> {
			try {
				consumer.accept(v, k);
			} catch (ArithmeticException ex) {
				System.out.println("The arithmetic exception occured");
			}
		};
	}

}
