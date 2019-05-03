package com.yuntu.java_eight.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wang_lei
 */
public class Process_filter_slice {
	static class  Menu{
		private String name;
		private boolean vegetarian;
		private Integer price;

		public Menu(String name, boolean vegetarian, Integer price) {
			this.name = name;
			this.vegetarian = vegetarian;
			this.price = price;
		}

		public Menu() {
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public boolean isVegetarian() {
			return vegetarian;
		}

		public void setVegetarian(boolean vegetarian) {
			this.vegetarian = vegetarian;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Menu{" +
					"name='" + name + '\'' +
					", vegetarian=" + vegetarian +
					", price=" + price +
					'}';
		}
	}
	public static void main(String[] args) {
		Menu menuOne = new Menu("beef",false,200);
		Menu menuTwo = new Menu("tomato",true,100);
		Menu menuThree = new Menu("chicken",false,150);

		// filter
		List<Menu> menu = new ArrayList<>();
		menu.add(menuOne);
		menu.add(menuTwo);
		menu.add(menuThree);
//		menu.stream().filter(Menu::isVegetarian).forEach(System.out::println);

		// distinct
//		Arrays.asList(1,2,3,4,4,5,5).stream().distinct().forEach(System.out::println);

		// limit
//		Arrays.asList(1,2,3,4,4,5,5).stream().limit(2).forEach(System.out::println);

		// skip
		Arrays.asList(1,2,3,4,4,5,5).stream().skip(2).forEach(System.out::println);
	}
}
