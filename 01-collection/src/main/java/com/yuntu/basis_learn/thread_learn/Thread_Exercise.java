package com.yuntu.basis_learn.thread_learn;

public class Thread_Exercise implements Runnable {
	private  Integer ticket = 100;
	@Override
	public void run() {
		for(int i=0;i<50;i++){
			try{
				Thread.currentThread().sleep(100);
			}catch (Exception e){
				e.printStackTrace();
			}
//			synchronized(this){
				System.out.println(Thread.currentThread().getName()+" sell ticket Num:"+ticket--);

//			}
		}
	}

	public static void main(String[] args) {
		Thread_Exercise thread_exercise = new Thread_Exercise();
		Thread thread = new Thread(thread_exercise);
		thread.setName("sellerOne");
		Thread thread1 = new Thread(thread_exercise);
		thread1.setName("sellerTwo");
		thread.start();
		thread1.start();
	}
}
