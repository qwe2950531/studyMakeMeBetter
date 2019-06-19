package com.yuntu.basis_learn.design_parttern.strategy;

public class BadSeller implements Strategy{
	@Override
	public double getPrice(double d) {
		return d/3;
	}
}
