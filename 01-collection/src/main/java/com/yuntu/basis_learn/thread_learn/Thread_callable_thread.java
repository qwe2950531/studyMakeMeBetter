package com.yuntu.basis_learn.thread_learn;

import java.util.concurrent.*;

/**
 * @author wang_lei
 */
public class Thread_callable_thread implements Callable<String> {

	private String string ="hello Call";
	@Override
	public String call() throws Exception {
		return Thread.currentThread().getName()+string;
	}

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		ExecutorService  executorService = Executors.newFixedThreadPool(3);
		Thread_callable_thread thread_callable_thread = new Thread_callable_thread();
		Future<String> submit1 = executorService.submit(thread_callable_thread);
		Future<String> submit = executorService.submit(thread_callable_thread);
		Future<String> submit2 = executorService.submit(thread_callable_thread);

		System.out.println(submit.get());
		System.out.println(submit1.get());
		System.out.println(submit2.get());


	}
}
