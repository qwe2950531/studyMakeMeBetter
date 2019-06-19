package com.yuntu.basis_learn.design_parttern.bridge.bridge_after;

public class Motorcycle implements Car {
	@Override
	public void run() {
		System.out.println("摩托车跑");
	}
}
