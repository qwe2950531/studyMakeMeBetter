package com.yuntu.basis_learn.design_parttern.observer;


import lombok.Data;

import java.util.Observable;
import java.util.Observer;
@Data
public class MyObserver extends Observable {
	private String stat;
	@Override
	public synchronized void addObserver(Observer o) {
		super.addObserver(o);
	}

	@Override
	public void notifyObservers(Object arg) {
		//需要调用setChange 客户端才能更新
		setChanged();
		super.notifyObservers(stat);
	}
}
