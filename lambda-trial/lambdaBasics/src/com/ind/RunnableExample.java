package com.ind;

public class RunnableExample {

	public static void main(String[] args) {
	
		//Traditional runnable implementation with inner class
		Thread myThread = new Thread (new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Running inside traditional runnable");
				
			}
		});		
		myThread.run();
		
		/*
		 * As lambda uses the interface, it is backward compatible. But this is possible
		 * only if the interface have only onle abstract method
		 */
		Thread lambdaThread = new Thread (() -> System.out.println("Running inside lambda thread"));
		lambdaThread.run();
	}

}
