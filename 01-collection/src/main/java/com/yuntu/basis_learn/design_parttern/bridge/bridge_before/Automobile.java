package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class Automobile implements Car {
	@Override
	public void run() {
		System.out.println("小汽车跑");
	}
}
