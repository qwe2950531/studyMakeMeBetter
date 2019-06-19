package com.yuntu.basis_learn.design_parttern.observer;

import java.util.Observable;
import java.util.Observer;

public class RObserver implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		MyObserver myObserver =(MyObserver)o;
		System.out.println(myObserver.getStat());
	}
}
