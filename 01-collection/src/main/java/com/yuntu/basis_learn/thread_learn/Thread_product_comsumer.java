package com.yuntu.basis_learn.thread_learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
/**
 * @author wang_lei
 * 线程的通信  生产者消费者问题
 * 多个消费者时应该注意 使用while作为判断语句来wait 及时更新读取的数据
 * 多个消费者时使用notifyAll  notify可能造成假死
 */
public class Thread_product_comsumer {
//	@Test
	public  static  void main(String...args) {
		Object lock = new Object();
		List<String> loves = new ArrayList<>();
		Comsumer comsumer = new Comsumer(loves,lock);
		Productor productor = new Productor(loves,lock);
		Thread productorThread = new Thread(productor);
		Thread comsumerThreadOne = new Thread(comsumer);
		Thread comsumerThreadTwo = new Thread(comsumer);
		productorThread.start();
		comsumerThreadOne.start();
		comsumerThreadTwo.start();

	}
}

class Comsumer extends Thread{
		private List<String> loves;
		Object lock;
		public Comsumer(List loves,Object lock){
			this.loves=loves;
			this.lock=lock;
		}
		@Override
		public void run(){
				while (true){
				synchronized (loves){
						while(loves.size()==0){
							try {
								loves.wait();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					loves.remove("love");
					System.out.println(Thread.currentThread().getName()+"消费1个");
					loves.notifyAll();
					}
			}
			}

		}
	class Productor implements Runnable{
		private List<String> loves;
		Object lock;
		public Productor(List loves,Object lock){
			this.loves=loves;
			this.lock=lock;
		}
		@Override
		public void run() {
			while (true){
				synchronized (loves){
					while(loves.size()==1){
						try {
							loves.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
						loves.add("love");
					System.out.println("生产1个");
					System.out.println(loves.size());
					loves.notifyAll();

				}
			}

		}
	}

