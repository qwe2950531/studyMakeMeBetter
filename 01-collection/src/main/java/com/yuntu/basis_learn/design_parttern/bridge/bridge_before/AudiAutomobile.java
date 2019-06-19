package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class AudiAutomobile extends Automobile {
	void audiAutomobileRun(){
		System.out.println("我是奥迪");
		super.run();
	}
}
