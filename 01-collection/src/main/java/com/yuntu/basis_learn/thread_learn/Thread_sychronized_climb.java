package com.yuntu.basis_learn.thread_learn;


public class Thread_sychronized_climb implements Runnable{
	private Integer monny=5000;
	private Integer permoney=0;

	public Thread_sychronized_climb(Integer permoney){
		this.permoney=permoney;
	}
	@Override
	public void run() {
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//在读写共享数据的地方加上sychronized
		synchronized (this){
			while(monny>0){
			     System.out.println("当前有"+monny+"元"+"取走"+permoney+"元");
			     monny=monny-permoney;
		     }
		 }
	}

	public static void main(String[] args) {
		Thread_sychronized_climb thread_sychronized_climb = new Thread_sychronized_climb(500);
		new Thread(thread_sychronized_climb).start();
		new Thread(thread_sychronized_climb).start();
	}
}
