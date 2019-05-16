package com.yuntu.basis_learn.java_eight.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wang_lei
 * @date 2019-05-03
 */
public class Process_reduce_collect {
	@Test
	public  void hh() {
		Dish dishOne = new Dish("kongfuChicken",200,5000,false,"sichuan");
		Dish dishTwo = new Dish("tomato",50,300,true,"zhongguo");
		Dish dishThree = new Dish("fireFish",300,4000,false,"hubei");
		Dish dishFour = new Dish("beefStack",500,8000,false,"western");
		Dish dishFive = new Dish("fuqifeipian",500,3000,false,"sichuan");
		List<Dish> dishes = Arrays.asList(dishFive,dishFour,dishOne,dishThree,dishTwo);
		dishes.stream().map(Dish::getPower);
		// count
		System.out.println(dishes.stream().collect(Collectors.counting()));
		// maxBy
		System.out.println(dishes.stream().collect(Collectors.maxBy(Comparator.comparing(Dish::getPrice))));
		// minBy
		System.out.println(dishes.stream().collect(Collectors.minBy(Comparator.comparing(Dish::getPrice))));
		// sum
		System.out.println(dishes.stream().collect(Collectors.summingInt(Dish::getPrice)));
		// summarize
		System.out.println(dishes.stream().collect(Collectors.summarizingInt(Dish::getPrice)));
		// average
		System.out.println(dishes.stream().collect(Collectors.averagingInt(Dish::getPrice)));
		// joining
		System.out.println(dishes.stream().map(Dish::getName).collect(Collectors.joining(",","a","b")));
		// grouping
		System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getCuisine)));
		// 二级 grouping
		System.out.println(dishes.stream().collect(Collectors.groupingBy(Dish::getCuisine,Collectors.counting())));
		// partition
		System.out.println(dishes.stream().collect(Collectors.partitioningBy(Dish::isVegetarian)));
	}
}
