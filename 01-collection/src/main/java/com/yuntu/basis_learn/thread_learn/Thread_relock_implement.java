package com.yuntu.basis_learn.thread_learn;

/**
 * @author wang_lei
 * 可重入锁的实现
 */
public class Thread_relock_implement {
	Relock relock = new Relock();
	public static void main(String[] args) {
		Thread_relock_implement s = new Thread_relock_implement();
		try {
			s.heloo();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void heloo() throws InterruptedException {
		relock.lock();
		System.out.println("entry work");
		work();
		relock.unlock();
	}
	public void work() throws InterruptedException {
		relock.lock();
		System.out.println("ss");
		relock.unlock();
	}
}

	class Relock{
		private Thread t =null;
		private int count;
		private boolean flag=false;
		public  synchronized void lock() throws InterruptedException {
			while(flag){
				wait();
			}
//			Thread thread = Thread.currentThread();
//			while(flag&&t!=thread){
//				wait();
//			}
//
//			t=thread;
			flag=true;
//			count++;
		}

		public synchronized  void unlock(){
//			if(Thread.currentThread()==t){
//				count--;
//				if(count==0){
					flag=false;
					notify();
//					t=null;
//				}
//			}


		}
	}
