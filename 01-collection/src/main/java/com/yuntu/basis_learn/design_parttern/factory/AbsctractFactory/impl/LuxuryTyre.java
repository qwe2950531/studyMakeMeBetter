package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Tyre;

public class LuxuryTyre implements Tyre {
	@Override
	public void revolve() {
		System.out.println("磨损慢");
	}
}
