package com.yuntu.basis_learn.thread_learn;

/**
 * @author wang_lei
 * 线程api
 */
public class Thread_api implements Runnable {
	@Override
	public void run() {
		try {
			// 线程休眠（不释放锁)
			Thread.sleep(100);
			if(Thread.currentThread().getName().equals("one")||Thread.currentThread().getName().equals("two")){
				Thread.sleep(1000);
				// 线程赞礼让
				Thread.yield();
			}
//			new Thread(()-> System.out.println("start using join!")).join();
			System.out.println("after join");
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread threadOne = new Thread(new Thread_api());
		threadOne.setName("one");
		threadOne.start();

		Thread threadTwo = new Thread(new Thread_api());
		threadTwo.setName("two");
		// 设置线程权重
		threadTwo.setPriority(8);
		threadTwo.start();

		// 线程合并
		threadOne.join();
		threadTwo.join();

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
