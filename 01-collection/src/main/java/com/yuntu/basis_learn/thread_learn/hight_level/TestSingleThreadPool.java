package com.yuntu.basis_learn.thread_learn.hight_level;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSingleThreadPool {
	public static void main(String[] args) {
		// 他能保证任务一定是按顺序执行的 先扔的一定先执行完
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		for(int i=0;i<5;i++){
			final int j = i;
			executorService.execute(()->{
				System.out.println(j+" "+Thread.currentThread().getName());
			});
		}
	}
}
