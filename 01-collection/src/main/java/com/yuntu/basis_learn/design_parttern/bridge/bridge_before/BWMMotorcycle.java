package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class BWMMotorcycle extends Motorcycle {
	void BWMMotorcycleRun(){
		System.out.println("我是宝马");
		super.run();
	}
}
