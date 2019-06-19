package com.yuntu.basis_learn.design_parttern.prototype;

import java.util.Date;

public class CloneTest {
	public static void main(String[] args) {
		Ship shipOne = new Ship();
		shipOne.setBir(new Date());
		shipOne.setAge(11);
		shipOne.setName("多里");

		Ship shipTwo = null;
		try {
			shipTwo = (Ship) shipOne.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Date bir = shipOne.getBir();
		bir.setTime(123123123213213L);
		System.out.println("two:");
		System.out.println(shipTwo);
		System.out.println("one:");
		System.out.println(shipOne);

	}
}
