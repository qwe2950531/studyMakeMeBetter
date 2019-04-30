package com.yuntu.java_eight;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author wang_lei
 * 三种泛型函数式接口
 */
public class FunctionInterfaceTest {
	public static void main(String[] args) {
		List<Apple> apples = new ArrayList<Apple>();
		Apple appleOne = new Apple(15,"yellow");
		apples.add(appleOne);
		Apple appleTwo = new Apple(12,"green");
		apples.add(appleTwo);
		Apple appleThree = new Apple(13,"green");
		apples.add(appleThree);
		Apple appleFour = new Apple(11,"yellow");
		apples.add(appleFour);
		apples.stream().forEach((Apple apple) -> {System.out.println(apple.getColor());});
		apples.stream().filter(Predicate.isEqual(appleFour));
		List<Integer> collect = apples.stream().map(apple -> apple.getWeight()).collect(Collectors.toList());
		apples.sort(Comparator.comparing(Apple::getColor));
		System.out.println(collect);
	}
}
