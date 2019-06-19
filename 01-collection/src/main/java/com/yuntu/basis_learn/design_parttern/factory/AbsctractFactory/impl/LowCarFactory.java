package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.CarFactory;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Engine;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Seat;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Tyre;

public class LowCarFactory implements CarFactory {
	@Override
	public Engine createEngine() {
		return new LowEngine();
	}

	@Override
	public Tyre createTyre() {
		return new LowTyre();
	}

	@Override
	public Seat createSeat() {
		return new LowSeat();
	}
}
