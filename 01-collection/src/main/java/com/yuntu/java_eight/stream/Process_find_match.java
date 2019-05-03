package com.yuntu.java_eight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author wang_lei
 */
public class Process_find_match {
	static class Dish{
		private String name;
		private Integer price;
		private boolean isVegetarian;
		private Integer power;

		public Dish(String name, Integer price, boolean isVegetarian, Integer power) {
			this.name = name;
			this.price = price;
			this.isVegetarian = isVegetarian;
			this.power = power;
		}

		public Dish() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public boolean isVegetarian() {
			return isVegetarian;
		}

		public void setVegetarian(boolean vegetarian) {
			isVegetarian = vegetarian;
		}

		public Integer getPower() {
			return power;
		}

		public void setPower(Integer power) {
			this.power = power;
		}

		@Override
		public String toString() {
			return "Dish{" +
					"name='" + name + '\'' +
					", price=" + price +
					", isVegetarian=" + isVegetarian +
					", power=" + power +
					'}';
		}
	}
	public static void main(String[] args) {
		Dish dishOne = new Dish("chicken",200,false,5000);
		Dish dishTwo = new Dish("beef",500,false,8000);
		Dish dishThree = new Dish("tomato",50,true,2000);
		List<Dish> dishes = new ArrayList<>();
		dishes.add(dishOne);
		dishes.add(dishTwo);
		dishes.add(dishThree);
		// allMatch
		if(dishes.stream().allMatch(Dish::isVegetarian)){
			System.out.println("nice!");
		} else {
			System.out.println("my god!");
		}

		// anyMatch
		if(dishes.stream().anyMatch(Dish::isVegetarian)){
			System.out.println("nice!");
		} else {
			System.out.println("my god!");
		}

		// noneMatch
		if(dishes.stream().noneMatch(dish -> dish.getName().equals("beef"))){
			System.out.println("good!");
		}

		// findAny
		Optional<Dish> any = dishes.stream().filter((s)-> false).findAny();
		// ifPresent  do something
		any.ifPresent(System.out::println);
		// assert present
		System.out.println(any.isPresent());
		// get value
		System.out.println(any.orElseGet(Dish::new));
		// orElse
		System.out.println(any.orElse(new Dish("sss", 11213, false, 213)));
		// findFirst
		System.out.println(dishes.stream().findFirst());
		// of
		Optional optional = Optional.of(new Dish("ss",123,true,123));

	}
}
