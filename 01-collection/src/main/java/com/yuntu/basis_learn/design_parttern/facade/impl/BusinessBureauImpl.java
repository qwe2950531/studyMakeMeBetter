package com.yuntu.basis_learn.design_parttern.facade.impl;

import com.yuntu.basis_learn.design_parttern.facade.BusinessBureau;

public class BusinessBureauImpl implements BusinessBureau {
	@Override
	public void getName() {
		System.out.println("工商局注册名字");
	}
}
