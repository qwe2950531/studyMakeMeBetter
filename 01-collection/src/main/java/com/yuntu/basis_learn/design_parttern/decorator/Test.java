package com.yuntu.basis_learn.design_parttern.decorator;

public class Test {
	public static void main(String[] args) {
		ICar audiCar = new AudiCar();

		ZhenPiCar zhenPiCar = new ZhenPiCar(audiCar);
		zhenPiCar.run();

	}
}
