package com.yuntu.basis_learn.thread_learn;

public class Thread_happen_before {
	public volatile static boolean flag =true;
	public volatile static int a = 0;
	public static int c=0;
	public static void main(String[] args) throws InterruptedException {
			for (int i=0;i<40000;i++){
				Thread threadOne = new Thread(() -> {
					a=1;
					flag=false;
				});

				Thread threadTwo = new Thread(() -> {
					if(flag){
						a*=1;
					}
					if (a == 0) {
						System.out.println("happen before  "+ a);
						c=1;
					}
				});
				threadOne.start();
				threadTwo.start();

				threadOne.join();
				threadTwo.join();
			}

		}

}
