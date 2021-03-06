package com.ind.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.ind.Exercises.model.Person;

public class StandardFuntionalInterfaceEx {
	
	public static void main(String[] args) {

		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Levis", "Corroll", 30),
				new Person("Thomas", "Corlyle", 64), 
				new Person("Charlotte", "Brante", 45),
				new Person("Mathew", "Arnold", 39));
		
	//sort the list by last name
		/* comparator is a functional Interface and so lambda expression can be used */
		Collections.sort(people, (p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));		
	
	// print all persons
		System.out.println("---------  Printing all the persons ---------");
		printConditionally(people, p -> true, p -> System.out.println(p));
	
		System.out.println("---------- Printing persons with lastname C -------");
		printConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
		
	// print persons with first name c
		System.out.println(" ------- Printing persons with firstname C --------");
		printConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p));	
	}

	/*
	 * uses the predicate of java.util.functions. There are many other out of box
	 * interfaces that can be used for lambda
	 * 
	 * The predicate and the consumer interfaces are from java.util.functions for lambda 
	 */
	public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
		for (Person p : people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}

