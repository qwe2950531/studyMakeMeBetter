package com.yuntu.basis_learn.thread_learn.hight_level;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TestScheduleExecutor {
	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newScheduledThreadPool(4);
		service.scheduleAtFixedRate(()->{
			try{
				TimeUnit.MICROSECONDS.sleep(new Random().nextInt(1000));
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
		},0,500,TimeUnit.MILLISECONDS);
	}
}
