package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class AudiMotorcycle extends Motorcycle{
	void audiMotorcycleRun(){
		System.out.println("我是奥迪");
		super.run();
	}
}
