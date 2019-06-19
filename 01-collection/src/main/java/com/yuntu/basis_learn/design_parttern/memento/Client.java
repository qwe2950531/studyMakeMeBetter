package com.yuntu.basis_learn.design_parttern.memento;

public class Client {
	public static void main(String[] args) {
		Taker taker = new Taker();
		Emp wanglei = new Emp("wanglei", 18, 5000);
		taker.setMemento(wanglei.memento());

		System.out.println(wanglei);

		wanglei.setAge(222);
		wanglei.setName("wanglei");
		wanglei.setSalary(123123123);
		System.out.println(wanglei);

		wanglei.recovery(taker.getMemento());
		System.out.println(wanglei);
	}
}
