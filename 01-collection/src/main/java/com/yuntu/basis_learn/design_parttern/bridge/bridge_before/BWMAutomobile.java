package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class BWMAutomobile extends Automobile {
	void BWMAutomobileRun(){
		System.out.println("我是宝马");
		super.run();
	}
}
