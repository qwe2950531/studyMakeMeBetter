package com.yuntu.basis_learn.design_parttern.observer;

public class Test {
	public static void main(String[] args) {
		RObserver rObserver = new RObserver();
		RObserver rObserver1 = new RObserver();

		MyObserver myObserver = new MyObserver();
		myObserver.addObserver(rObserver);
		myObserver.addObserver(rObserver1);
		myObserver.setStat("123");
		myObserver.notifyObservers();
	}
}
