package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class BenzAutomobile extends Automobile{

	void benzAutomobileRun(){
		System.out.println("我是奔驰");
		super.run();
	}
}
