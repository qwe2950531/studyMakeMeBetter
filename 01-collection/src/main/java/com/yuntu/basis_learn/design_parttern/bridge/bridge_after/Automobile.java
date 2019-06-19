package com.yuntu.basis_learn.design_parttern.bridge.bridge_after;

public class Automobile implements Car {
	@Override
	public void run() {
		System.out.println("汽车跑");
	}
}
