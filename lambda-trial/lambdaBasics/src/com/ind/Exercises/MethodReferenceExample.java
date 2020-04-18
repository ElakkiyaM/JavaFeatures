package com.ind.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.ind.Exercises.model.Person;

public class MethodReferenceExample {

	public static void main(String[] args) {
		
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60), 
				new Person("Levis", "Corroll", 30),
				new Person("Thomas", "Corlyle", 64), 
				new Person("Charlotte", "Brante", 45),
				new Person("Mathew", "Arnold", 39));
		
		// () -> method()
		//MethodReferenceExample::printMessage === ()->printMessage()
		Thread t = new Thread(MethodReferenceExample::printMessage);		
		t.start();
		
		//p -> method(p)
		//System.out::println === p -> system.out.println(p)
		printConditionally(people, p -> p.getFirstName().startsWith("C"), System.out::println);
		
		/* print all person using forEach iteration (Internal iterator) */
		System.out.println("The forEach Iteration usinng Lambda");
		people.forEach(p -> System.out.println(p));
	}
	
	public static void printMessage() {
		System.out.println("Hello Scorpion");
	}
	
	public static void printConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer ) {
		for (Person p: people) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}

}
