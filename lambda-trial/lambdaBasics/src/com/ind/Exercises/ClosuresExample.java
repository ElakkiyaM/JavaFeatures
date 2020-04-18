package com.ind.Exercises;

public class ClosuresExample {

	public static void main(String[] args) {
		int i = 10;
		int j = 20;
		doProcess(i, a -> System.out.println(a + j));
	}
	
	static void doProcess(int i, Process p) {
		p.process(i);
	}

}

interface Process {
	void process(int i);
}