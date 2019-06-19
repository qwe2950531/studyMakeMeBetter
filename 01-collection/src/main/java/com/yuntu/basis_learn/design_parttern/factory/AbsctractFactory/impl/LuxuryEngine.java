package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Engine;

public class LuxuryEngine implements Engine {
	@Override
	public void run() {
		System.out.println("跑的快");
	}

	@Override
	public void start() {
		System.out.println("启动快！可以自动启停！");
	}
}
