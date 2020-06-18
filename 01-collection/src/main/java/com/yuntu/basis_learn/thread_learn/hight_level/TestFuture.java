package com.yuntu.basis_learn.thread_learn.hight_level;

import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class TestFuture {
	public static void main(String[] args) throws ExecutionException, InterruptedException {
		FutureTask<String>  futureTask = new FutureTask<>(()-> {
			sleep(5000);
			return "hello world";
		});
		new Thread(futureTask).start();
		// 调用get方法会导致主线程阻塞
		System.out.println(futureTask.get());
		System.out.println("test blocking");

		// 线程池的应用

		ExecutorService executorService = Executors.newFixedThreadPool(5);
		Future<String> submit = executorService.submit(() -> {
			sleep(500);
			return "hello";
		});
		System.out.println(submit.isDone());
		System.out.println(submit.get());
		System.out.println(submit.isDone());
	}
}
