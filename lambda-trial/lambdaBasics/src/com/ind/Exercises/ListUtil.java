package com.ind.Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/* Convert List<String> to List<Integer> using java8 Stream */
public class ListUtil {

	public static void main(String[] args) {
		List<String> stringList = Arrays.asList("1", "2", "3", "4", "5");
		List<Integer> integerList = stringList.stream()
									.map(s -> Integer.parseInt(s))
									.collect(Collectors.toList());
		System.out.println("List: " + integerList);

	}

}
