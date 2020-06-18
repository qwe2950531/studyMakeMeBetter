package com.yuntu.basis_learn.thread_learn.hight_level;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestWorkStealingPool {
	public static void main(String[] args) throws IOException {
		ExecutorService service = Executors.newWorkStealingPool();
		// 看cpu是多少核的，默认就放你起多少个线程
		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("您的电脑有"+count+"个核心");
		service.execute(new R(1000));
		for(int i = 0;i<count;i++){
			service.execute(new R(2000));
		}

		System.in.read();
	}
	static class R implements Runnable{
		int time;
		R(int t){
			this.time = t;
		}

		@Override
		public void run() {
			try {
				TimeUnit.MILLISECONDS.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println(time + " " + Thread.currentThread().getName());
		}
	}

}

