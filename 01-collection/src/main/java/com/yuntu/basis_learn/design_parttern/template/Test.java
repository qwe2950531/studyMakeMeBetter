package com.yuntu.basis_learn.design_parttern.template;

public class Test {
	public static void main(String[] args) {
		EatAbstract wangleiEat = new WangleiEat();
		wangleiEat.go();
		wangleiEat.order();
		wangleiEat.checkOut();
	}
}
