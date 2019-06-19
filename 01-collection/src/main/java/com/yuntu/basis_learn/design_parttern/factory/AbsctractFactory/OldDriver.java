package com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory;

import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl.LowCarFactory;
import com.yuntu.basis_learn.design_parttern.factory.AbsctractFactory.impl.LuxuryCarFactory;

/**
 * @author wang_lei
 */
public class OldDriver {
	public static void main(String[] args) {
		// 创建豪华汽车工厂
		CarFactory carFactory = new LuxuryCarFactory();
		Engine engine = carFactory.createEngine();
		Seat seat = carFactory.createSeat();
		Tyre tyre = carFactory.createTyre();
		engine.run();
		seat.message();
		tyre.revolve();

		// 创建便宜汽车工厂
		CarFactory lowCarFactory = new LowCarFactory();
		Engine lowEngine = lowCarFactory.createEngine();
		Seat lowSeat = lowCarFactory.createSeat();
		Tyre lowTyre = lowCarFactory.createTyre();
		lowEngine.run();
		lowSeat.message();
		lowTyre.revolve();
	}
}
