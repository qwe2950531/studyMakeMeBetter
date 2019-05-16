package com.yuntu.basis_learn.thread_learn;


/**
 * @author Administrator
 * 可以为每个线程提供一个独立的线程变量
 */
public class Thread_threadlocal extends  Thread{
	private static ThreadLocal<Apple> threadLocal = ThreadLocal.withInitial(()->new Apple(50,"green"));
	@Override
	public void run() {
		super.run();
		Apple apple = threadLocal.get();
//		apple.setColor("red");
//		apple.setWeight(100);
//		threadLocal.set(apple);
		System.out.println(threadLocal.get());
	}

	public static void main(String[] args) {
		Apple apple = threadLocal.get();
		apple.setWeight(200);
		apple.setColor("yellow");
		threadLocal.set(apple);
		System.out.println(threadLocal.get());
		Thread_threadlocal tt=  new Thread_threadlocal();
		tt.start();
	}
}
