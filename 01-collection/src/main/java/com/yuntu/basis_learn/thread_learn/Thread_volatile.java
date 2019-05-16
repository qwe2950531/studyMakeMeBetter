package com.yuntu.basis_learn.thread_learn;

/**
 * @author wang_lei
 * 保证多线程之间变量的可见性
 * 1.将写操作的数据及时刷新到主内存并通知引用该变量的线程刷新
 * 2.使用join操作时避免指令重排
 */
public class Thread_volatile {
//	public  static int num = 0;
	public volatile  static int num = 0;

	public static void main(String[] args) {

		Thread threadOne = new Thread(()->{
			while (num==0){

			}
		});
		threadOne.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		num=1;
		System.out.println(num);
	}
}
