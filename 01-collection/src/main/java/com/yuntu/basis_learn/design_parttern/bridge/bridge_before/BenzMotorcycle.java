package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class BenzMotorcycle extends Motorcycle {
	void benzMotorcycle(){
		System.out.println("我是奔驰");
		super.run();
	}
}
