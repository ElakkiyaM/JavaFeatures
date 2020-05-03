package org.java7.userinput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class BufferedReaderIp {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter name of the person: ");
		String name = reader.readLine();

		System.out.println("Enter Age of the person: ");
		int age = Integer.parseInt(reader.readLine());
		System.out.println("The user is " + name + " of age " + age);

		// Read a file to get the about content of the person
		String about;
		try {
			File file = new File("E:\\Workspace\\JavaFeatures\\ASN.txt");
			@SuppressWarnings("resource")
			BufferedReader fileRead = new BufferedReader(new FileReader(file));
			while ((about = fileRead.readLine()) != null) {
				System.out.println("About the person in short: " + about);
			}
		} catch (FileNotFoundException fEX) {
			System.out.println("File not found");
		}

	}

}
