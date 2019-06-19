package com.yuntu.basis_learn.design_parttern.builder;

/**
 * @author wang_lei
 * 建造者模式
 * 当一个对象构建过程比较复杂 有多重构建方式的时候使用
 *
 */
public class Clinet {
	public static void main(String[] args) {
		AirshipDirector airshipDirector = new AirshipDirector(new NormalAirshipBuilder());
		AirShip airShip = airshipDirector.directAirship();
		// 普通宇宙飞船出炉
		System.out.println(airShip);
	}
}
