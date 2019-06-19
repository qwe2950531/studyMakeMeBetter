package com.yuntu.basis_learn.design_parttern.strategy;

public class Client {
	public static void main(String[] args) {
		System.out.println("好人去进货");
		double monney = 99;
		// 碰到好卖家开的价
		Strategy strategy = new NiceSeller();
		System.out.println(strategy.getPrice(monney));
		// 碰到坏卖家给的价
		BadSeller badSeller = new BadSeller();
		System.out.println(badSeller.getPrice(monney));
	}
}
