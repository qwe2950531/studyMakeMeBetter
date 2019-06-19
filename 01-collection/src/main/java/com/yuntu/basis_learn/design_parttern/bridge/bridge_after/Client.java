package com.yuntu.basis_learn.design_parttern.bridge.bridge_after;

public class Client {
	public static void main(String[] args) {
		Car car = new Bycicle(new Benz());
		car.run();
	}
}
