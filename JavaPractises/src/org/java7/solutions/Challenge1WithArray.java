package org.java7.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Challenge1WithArray {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int result = 0;
		File file = new File("E:\\Workspace\\JavaFeatures\\Team.txt");
		
		//user Input
		Scanner sc = new Scanner(file);
		
		//No. Of players in each team
		int noOfPlayers = Integer.parseInt(sc.nextLine().trim());
		System.out.println("No. of players in each team: " + noOfPlayers);
		
		//points of team A
		String teamA = sc.nextLine();
		String[] teamAPoints = teamA.split(" ");  //converting string into string array
		Arrays.sort(teamAPoints, Collections.reverseOrder());
		for(String a: teamAPoints)
		System.out.println("Points of Team A: " + a);
		
		//points of team B
		String teamB = sc.nextLine();
		String[] teamBPoints = teamB.split(" ");
		Arrays.sort(teamBPoints, Collections.reverseOrder());
		for(String b: teamBPoints)
		System.out.println("Points of Team B: " + b);
		
		if(teamAPoints.length == noOfPlayers && teamBPoints.length == noOfPlayers) {
			for(int i=0; i< noOfPlayers; i++) {
				if( (Integer.parseInt(teamAPoints[i])) > (Integer.parseInt(teamBPoints[i]))) {
					result++;
				}
			}
			
		}
		
		System.out.println("The probability of team A winning " + result + " times.");
	}

}
