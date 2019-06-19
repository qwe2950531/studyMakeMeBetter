package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.Engine;

public class LowEngine implements Engine {
	@Override
	public void run() {
		System.out.println("跑的慢");
	}

	@Override
	public void start() {
		System.out.println("启动慢");
	}
}
