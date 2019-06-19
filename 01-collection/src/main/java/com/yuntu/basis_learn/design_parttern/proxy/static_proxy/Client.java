package com.yuntu.basis_learn.design_parttern.proxy.static_proxy;

/**
 * @author wang_lei
 * 静态代理模式实现
 */
public class Client {
	public static void main(String[] args) {
		findMeAZhoujielun(new MissLi());
	}

	public static void findMeAZhoujielun(Star star){
		star.sing();
	}
}
