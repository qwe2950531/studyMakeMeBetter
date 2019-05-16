package com.yuntu.basis_learn.thread_learn;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wang_lei
 * 原子操作 cas思想
 */
public class Thread_atomic {
	private static AtomicInteger integer = new AtomicInteger(5);
	private static Integer myInteger = 5;
	public static void main(String[] args) {

		for(int i=0;i<5;i++){
			new Thread(()->{
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				Integer left = integer.decrementAndGet();
				if(left==0){
					System.out.println("抢完了~。。。。。");
				}
				System.out.println("线程"+Thread.currentThread().getName()+"抢到一件 还剩"+left+"件");
			}).start();
		}

//		for(int i=0;i<5;i++){
//			new Thread(()->{
//				try {
//					Thread.sleep(300);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//				Integer left = --myInteger;
//				if(left==0){
//					System.out.println("抢完了~。。。。。");
//				}
//				System.out.println("线程"+Thread.currentThread().getName()+"抢到一件 还剩"+left+"件");
//			}).start();
//		}
	}
}
