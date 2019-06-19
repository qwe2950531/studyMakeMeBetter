package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Seat;

public class LowSeat implements Seat {
	@Override
	public void message() {
		System.out.println("手动按摩");
	}
}
