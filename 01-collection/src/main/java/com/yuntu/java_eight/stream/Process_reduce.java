package com.yuntu.java_eight.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

public class Process_reduce {
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
		Process_find_match.Dish dishOne = new Process_find_match.Dish("chicken",200,false,5000);
		Process_find_match.Dish dishTwo = new Process_find_match.Dish("beef",500,false,8000);
		Process_find_match.Dish dishThree = new Process_find_match.Dish("tomato",50,true,2000);
		List<Process_find_match.Dish> dishes = new ArrayList<>();
		dishes.add(dishOne);
		dishes.add(dishTwo);
		dishes.add(dishThree);
		// min
		System.out.println(dishes.stream().map(Process_find_match.Dish::getPrice).reduce( (a, b) -> a < b ? a : b));
		// max
		System.out.println(dishes.stream().map(Process_find_match.Dish::getPrice).reduce((a, b) -> a > b ? a : b));
		// sum
		System.out.println(dishes.stream().map(Process_find_match.Dish::getPrice).reduce(0, (a, b) -> a + b));
	}
}
