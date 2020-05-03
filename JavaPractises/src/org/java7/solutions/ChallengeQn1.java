package org.java7.solutions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChallengeQn1 {

	public static void main(String[] args) {

		List<Integer> teamA = new ArrayList<>();
		List<Integer> teamB = new ArrayList<>();
		int noOfPlayers = 0;
		int output = 0;

		File file = new File("E:\\Workspace\\JavaFeatures\\Team.txt");
		try {
			Scanner sc = new Scanner(file);
			noOfPlayers = Integer.parseInt(sc.nextLine().trim());
			String a = sc.nextLine();
			String b = sc.nextLine();

			// converting the string to a list of string
			List<String> aList = Arrays.asList(a.split(" "));
			List<String> bList = Arrays.asList(b.split(" "));

			// converting List<String> to List<Integer>
			teamA = aList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
			teamB = bList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
			Collections.sort(teamA, Collections.reverseOrder());
			Collections.sort(teamB, Collections.reverseOrder());

			System.out.println("Total no. of players in each team: " + noOfPlayers);
			System.out.println("The power points of Team A: " + teamA);
			System.out.println("The power points of Team B: "+ teamB);
			
			//checking the probability of Team A winning the matches
			if (teamA.size() == noOfPlayers && teamA.size() == noOfPlayers) {
				for (int x : teamA) {
					for (int y : teamB) {
						if (x > y) {
							output++;
						}
					}
				}
				System.out.println("The probability of Team A winning the match is: " + output);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
