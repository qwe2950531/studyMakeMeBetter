package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class Bycicle implements Car {
	@Override
	public void run() {
		System.out.println("自行车跑");
	}
}
