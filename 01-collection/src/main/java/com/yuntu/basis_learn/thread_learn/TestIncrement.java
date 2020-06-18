package com.yuntu.basis_learn.thread_learn;

import com.yuntu.basis_learn.pattern.Test;

import java.util.concurrent.atomic.AtomicInteger;

public class TestIncrement implements Runnable {
	@Override
	public void run() {
		for(int i=0;i<1000000;i++){
			TestHello.writer();
		}
	}

	public static void main(String[] args) throws InterruptedException {
				new Thread(new TestIncrement()).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i=0;i<1000000;i++){
					if(TestHello.testHello!=null){
						if(TestHello.testHello.y==0){
							System.out.println('1');
						}
					}
				}


			}
		}).start();
			Thread.sleep(50000);


	}

}
