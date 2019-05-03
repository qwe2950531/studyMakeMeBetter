package com.yuntu.java_eight.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author wang_lei
 */
public class Process_map {

	public static void main(String[] args) {
		// map
		List<String> words = Arrays.asList("java8","Eminem","cute_girl","sunny");
//		words.stream().map(String::length).forEach(System.out::println);

		// flatmap方法让你把一个流中的每个值都换成另一个流，然后把所有的流连接
		//起来成为一个流
//		words.stream().map(string->string.split("")).forEach(System.out::println);
		words.stream().map(string->string.split("")).flatMap(Arrays::stream).forEach(System.out::println);
		List<Integer> numbers1 = Arrays.asList(1, 2, 3);
		List<Integer> numbers2 = Arrays.asList(3, 4);

		numbers1.stream()
				.flatMap(i -> numbers2.stream()
						.map(j -> new int[]{i, j})
				).forEach(s->System.out.print(Arrays.asList(s)));

	}
}
