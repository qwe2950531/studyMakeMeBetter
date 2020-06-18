package com.yuntu.basis_learn.thread_learn.hight_level;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

import static java.lang.Thread.sleep;

public class TestTreadPool {
	public static void main(String ...args) throws InterruptedException {
		ExecutorService executorService  = Executors.newFixedThreadPool(5);
		for(int i=0;i<6;i++){
			executorService.execute(()->{
				try{
					sleep(500);
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName());
			});
		}
		System.out.println(executorService);
		// 线程池调用关闭方法关闭时  不会立即关闭  会等待任务全部完成之后再关闭
		executorService.shutdown();
		// isTerminated方法显示的是线程池时候完成停止工作（任务全部完成后才为true)
		System.out.println(executorService.isTerminated());
		// isShutdown方法显示线程池是否调用了shutdown方法
		System.out.println(executorService.isShutdown());
		System.out.println(executorService);
		sleep(5000);
		System.out.println(executorService.isTerminated());
		System.out.println(executorService.isShutdown());
		System.out.println(executorService);


	}
}
