package com.yuntu.basis_learn.thread_learn;

import java.util.Date;

/**
 * @author wang_lei
 * 使用实现接口的方式创建线程
 * 好处 可以使用接口方便数据共享打破单继承局限性
 * 坏处 无法直接调用start()方法 需要使用new Thread()代理
 */
public class Thread_implement_thread implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<20;i++){
			Date date = new Date();
			date.clone();
			date.clone();
			date.clone();
			date.clone();
			date.clone();
			date.clone();
			System.out.println("守");
		}
	}

	public static void main(String ... args){
		Thread_implement_thread thread_implement_thread = new Thread_implement_thread();
		new Thread(thread_implement_thread).start();
		for(int i=0;i<20;i++){
			Date date = new Date();
			date.clone();
			date.clone();
			date.clone();
			date.clone();
			date.clone();
			date.clone();
			System.out.println("破");
		}
	}
}
