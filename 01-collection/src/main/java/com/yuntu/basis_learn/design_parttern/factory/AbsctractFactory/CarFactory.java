package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory;

/**
 * @author wang_lei
 * 汽车工厂
 */
public interface CarFactory {
	/**
	 * 建造引擎
	 */
	Engine createEngine();

	/**
	 * 建造轮胎
	 */
	Tyre createTyre();

	/**
	 * 建造座椅
	 */
	Seat createSeat();
}
