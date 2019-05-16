package com.yuntu.basis_learn.thread_learn;

public class Thread_deadlock {

	public static void main(String[] args) {
		//注意！  要确保锁不是同一个对象  比如 1 1 在底层其实是同一个对象 是同一个锁
		Integer lockOne = 1;
		Integer lockTwo = 1;
		LockMe lockMe = new LockMe();
		LockMe lock = new LockMe();

			new Thread(() -> {
				synchronized (lockMe){
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {

					}
					System.out.println("entry LockOne");
					synchronized (lock){
						System.out.println("entry LockTwo");
					}
				}
			}).start();

			new Thread(() -> {
				synchronized (lock){
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {

					}
					System.out.println("entry LockTwo");
					synchronized (lockMe){
						System.out.println("entry LockOne");
					}
				}
			}).start();
		}


}
