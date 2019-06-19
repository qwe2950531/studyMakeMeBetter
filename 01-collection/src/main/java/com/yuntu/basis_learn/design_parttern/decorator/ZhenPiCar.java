package com.yuntu.basis_learn.design_parttern.decorator;

import java.io.BufferedInputStream;

public class ZhenPiCar extends ModifyCar {
	public ZhenPiCar(ICar iCar) {
		super(iCar);
	}

	@Override
	public void run() {
		this.jiapi();
		super.iCar.run();

	}

	public void jiapi(){
		System.out.println("加真皮");
	}
}
