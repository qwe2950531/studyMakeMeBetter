package com.yuntu.basis_learn.design_parttern.strategy;

public class NiceSeller implements Strategy {
	@Override
	public double getPrice(double d) {
		return d/2;
	}
}
