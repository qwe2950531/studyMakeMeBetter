package com.yuntu.basis_learn.design_parttern.bridge.bridge_before;

public class AudiBycicle extends Bycicle {
	void AudiBycicleRun(){
		System.out.println("我是奥迪");
		super.run();
	}
}
