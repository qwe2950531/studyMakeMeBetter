package com.yuntu.basis_learn.design_parttern.template;

public abstract class EatAbstract {
	public void go(){
		System.out.println("去饭店");
	}
	abstract void order();
	public void checkOut(){
		System.out.println("结账");
	}

}
