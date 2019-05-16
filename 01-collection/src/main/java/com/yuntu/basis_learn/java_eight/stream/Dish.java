package com.yuntu.basis_learn.java_eight.stream;

public class Dish{
		private String name;
		private Integer price;
		private Integer power;
		private boolean isVegetarian;
		private String cuisine;

		public Dish(String name, Integer price, Integer power, boolean isVegetarian, String cuisine) {
			this.name = name;
			this.price = price;
			this.power = power;
			this.isVegetarian = isVegetarian;
			this.cuisine = cuisine;
		}

		public Dish() {
		}

		String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public Integer getPower() {
			return power;
		}

		public void setPower(Integer power) {
			this.power = power;
		}

		public boolean isVegetarian() {
			return isVegetarian;
		}

		public void setVegetarian(boolean vegetarian) {
			isVegetarian = vegetarian;
		}

		public String getCuisine() {
			return cuisine;
		}

		public void setCuisine(String cuisine) {
			this.cuisine = cuisine;
		}

		@Override
		public String toString() {
			return "Dish{" +
					"name='" + name + '\'' +
					", price=" + price +
					", power=" + power +
					", isVegetarian=" + isVegetarian +
					", cuisine='" + cuisine + '\'' +
					'}';
		}
	}