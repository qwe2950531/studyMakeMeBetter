package com.yuntu.basis_learn.design_parttern.factory.MethodFactory;

public class OldDriver {
	public static void main(String[] args) {
		Car audi = new AudiFactory().createCar();
		audi.run();
	}
}
