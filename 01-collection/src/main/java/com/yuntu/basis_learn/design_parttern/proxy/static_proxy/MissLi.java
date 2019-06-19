package com.yuntu.basis_learn.design_parttern.proxy.static_proxy;

/**
 * @author wang_lei
 * 李秘书
 */
public class MissLi implements Star {
	Star zhou = new ZhouJieLun();
	@Override
	public void sing() {
		System.out.println("谈判");
		System.out.println("签合同");
		System.out.println("订票");
		zhou.sing();
		System.out.println("收钱");
	}
}
