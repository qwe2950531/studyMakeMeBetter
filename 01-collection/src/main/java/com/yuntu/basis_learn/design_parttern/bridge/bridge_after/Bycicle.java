package com.yuntu.basis_learn.design_parttern.bridge.bridge_after;

public class Bycicle implements Car {
	private Brand brand;
	public Bycicle(Brand brand){
		this.brand=brand;
	}
	@Override
	public void run() {
		brand.whatmyname();
		System.out.println("自行车跑");
	}
}
