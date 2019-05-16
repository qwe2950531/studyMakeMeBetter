package com.yuntu.basis_learn.java_eight.stream;

import java.util.Arrays;
import java.util.List;

public class MyCollectorTest {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("wang_lei","shizhenzhen");
		System.out.println(strings.stream().collect(new MyCollector()));

	}
}
