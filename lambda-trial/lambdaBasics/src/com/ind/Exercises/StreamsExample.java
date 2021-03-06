package com.ind.Exercises;

import java.util.Arrays;
import java.util.List;

import com.ind.Exercises.model.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Levis", "Corroll", 30),
				new Person("Thomas", "Corlyle", 64), 
				new Person("Charlotte", "Brante", 45),
				new Person("Mathew", "Arnold", 39));
		
		/* Multiple operations can be performed over the collections */
		people.stream()
		.filter(p -> p.getLastName().startsWith("C"))
		.forEach(p -> System.out.println(p.getLastName()));
		
		long count = people.stream()
		.filter(p -> p.getFirstName().startsWith("C"))
		.count();
		System.out.println("count: " + count);
	}
}
