package com.yuntu.basis_learn.thread_learn;

public class Thread_singleton {
	 static MySingleTon  mySingleTon = null;


	public static void main(String[] args) throws InterruptedException {
		for(int i=0;i<100;i++){

			Thread thread1 = new Thread(new Runnable() {
				@Override
				public void run() {
					mySingleTon = MySingleTon.getInstence();
				}
			});
			Thread thread2 = new Thread(()->{

				if(mySingleTon!=null){
					System.out.println(mySingleTon);
				}
			});
			thread1.start();
			thread2.start();
			thread1.join();
			thread2.join();
		}


	}
}
class MySingleTon{
	private int anInt =1;
	private MySingleTon(){

	}
	// 保证多线程读取时不会出现重排现象
//	private volatile static MySingleTon mySingleTon;
	private    static MySingleTon mySingleTon;

	public static MySingleTon getInstence(){
		//提高性能不必阻塞于锁
		if(mySingleTon!=null){
			return mySingleTon;
		}
		//保证原子操作
		synchronized (MySingleTon.class){
			if(mySingleTon==null){
				mySingleTon=new MySingleTon();
				return mySingleTon;
			}
		}
		return mySingleTon;
	}

	@Override
	public String toString() {
		return "MySingleTon{" +
				"anInt=" + anInt +
				'}';
	}
}

class ThreadOne implements Runnable{
	MySingleTon mySingleTon = null;

	@Override
	public void run() {
		mySingleTon = MySingleTon.getInstence();
	}
}
class ThreadTwo implements Runnable{
	MySingleTon mySingleTon = null;
	@Override
	public void run() {
		if(mySingleTon!=null){
			System.out.println(mySingleTon);
		}
	}
}