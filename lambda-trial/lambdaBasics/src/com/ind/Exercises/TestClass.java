package com.ind.Exercises;

import java.util.Scanner;

public class TestClass {
	    public static void main(String args[] ) throws Exception { 
	    	
	    	Scanner sc = new Scanner(System.in);
	    	
	    	System.out.println("Enter number of elements: ");
	        int noOfIntegers= sc.nextInt();
	       
	        int arrayElements[] = new int[noOfIntegers];
	        System.out.println("Enter "+noOfIntegers+" array elements: ");
	        
	        for(int i = 0; i<noOfIntegers; i++) {
	        	arrayElements[i] = sc.nextInt();
	        }
	        
	        int sum = findInitialSum(noOfIntegers, arrayElements);
	        System.out.println("Result: " + arrayUpdate(noOfIntegers, sum));	           

	    }
	   public static int findInitialSum(int n, int[] x) {
		   int initialSum = 0;
		   for (int i = 0; i < n; i++){	        	
	            initialSum = initialSum + x[i];
	        }   
		   return initialSum;
	   }
	   
	   public static int arrayUpdate (int n, int sum) {	
	       
	        int finalSum = 0;
	        int result = 0;        
	        
	        for(int j=1; j<=n; j++) {
	        	finalSum = n * j;
	        	if(finalSum > sum) {
	        		result = j;
	        		break;
	        	}
	        }
	        return result;
	   }
}
