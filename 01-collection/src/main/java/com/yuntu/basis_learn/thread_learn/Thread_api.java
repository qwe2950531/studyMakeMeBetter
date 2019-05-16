package com.yuntu.basis_learn.thread_learn;

public class Thread_api implements Runnable {
	@Override
	public void run() {
		try {
			Thread.sleep(100);
			if(Thread.currentThread().getName().equals("one")||Thread.currentThread().getName().equals("two")){
				Thread.sleep(1000);
				Thread.yield();
			}
//			new Thread(()-> System.out.println("start using join!")).join();
			System.out.println("after join");
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {


		Thread threadOne = new Thread(new Thread_api());
		threadOne.setName("one");
		threadOne.start();

		Thread threadTwo = new Thread(new Thread_api());
		threadTwo.setName("two");
		threadTwo.setPriority(8);
		threadTwo.start();


		Thread thread = new Thread(new Thread_api());
		thread.setDaemon(true);
		thread.setName("Deamon!");
		thread.start();
		Thread.State state = thread.getState();
		String name =null;
		while (!(name=state.name()).equals(Thread.State.TERMINATED)){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name);
		}

	}
}
