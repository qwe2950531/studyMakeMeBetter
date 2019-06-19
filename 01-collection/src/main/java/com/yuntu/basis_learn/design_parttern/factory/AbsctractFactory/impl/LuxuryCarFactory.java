package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.CarFactory;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Engine;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Seat;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Tyre;

public class LuxuryCarFactory implements CarFactory {
	@Override
	public Engine createEngine() {
		return new LuxuryEngine();
	}

	@Override
	public Tyre createTyre() {
		return new LuxuryTyre();
	}

	@Override
	public Seat createSeat() {
		return new LuxurySeat();
	}
}
