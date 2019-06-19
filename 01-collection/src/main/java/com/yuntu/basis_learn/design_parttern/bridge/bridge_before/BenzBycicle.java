package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class BenzBycicle extends Bycicle {
	void benzBycicleRun(){
		System.out.println("我是奔驰");
		super.run();
	}
}
