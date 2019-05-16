package com.yuntu.basis_learn.thread_learn;

import java.util.Date;

import static java.lang.Thread.currentThread;

/**
 * @author wang_lei
 * 使用继承的方式创建线程
 */
public class Thread_extend_thread  {
	static class MyThread extends Thread{
		@Override
		public  void run() {
			super.run();
			for(int i = 0;i < 20;i++){
				for(int j=0; j<1000;j++){
					Date date = new Date();
					date.clone();
					date.clone();
					date.clone();
					date.clone();
					date.clone();
				}
				System.out.println("learning JAVA");

			}
		}
	}

	public static void main(String[] args) {
		Thread_extend_thread.MyThread myThread = new Thread_extend_thread.MyThread();
		myThread.start();
		for(int i=0;i<20;i++){
			for(int j=0; j<1000;j++){
				Date date = new Date();
				date.clone();
				date.clone();
				date.clone();
				date.clone();
				date.clone();
			}
			System.out.println("learning Python");
		}

	}
}
