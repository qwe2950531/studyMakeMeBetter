package com.yuntu.basis_learn.thread_learn.hight_level;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * ThreadPoolExecutor：大多数的线程池的实现背后调用的都是ThreadPoolExecutor（前面6种就ForkJoinPool不是），它是线程池通用的一个类，可以自定义线程池；
 * ThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler)
 * corePoolSize：核心的线程池里的线程数，自己指定。
 * maximumPoolSize：最多这个线程池里装多少个线程；
 * keepAliveTime：线程呆多久没有任务传给它就会消失；
 * unit：和上面统一指定的；
 * blockingQueue：真正的装任务的容器，往往都是用blockingQueue；阻塞式的；任务来了就扔进去，什么时候用到了都可以取。
 */
public class TestThreadPoolExecutor {
	public static void main(String[] args) {
		new ThreadPoolExecutor(4, 4,
				0L, TimeUnit.MILLISECONDS,
				new LinkedBlockingQueue<Runnable>());
	}
}
