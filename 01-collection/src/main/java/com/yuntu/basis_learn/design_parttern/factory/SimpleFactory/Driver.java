package com.yuntu.basis_learn.design_parttern.factory.SimpleFactory;

import java.util.Scanner;

/**
 * @author wang_lei
 * 老司机
 */
public class Driver {
	public static void main(String[] args) {
		System.out.println("老司机:老板给我辆车!");
		System.out.println("先生您好！请问您需要什么牌子的汽车 1,奥迪 2,奔驰 3,宝马");
		Scanner scanner = new Scanner(System.in);
		String type = scanner.next();
		Car car = CarFactoryVersonOne.createCar(type);
		car.run();

	}
}
