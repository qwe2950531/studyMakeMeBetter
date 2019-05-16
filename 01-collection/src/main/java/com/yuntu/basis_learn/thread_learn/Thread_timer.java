package com.yuntu.basis_learn.thread_learn;

import java.util.Timer;
import java.util.TimerTask;

public class Thread_timer {
	public static void main(String[] args) {
		MyTask task = new MyTask();
		Timer timer = new Timer();
//		timer.schedule(task,5000);
		timer.schedule(task,5000,2000);
		System.out.println("hello");
	}
}

class MyTask extends TimerTask {

	@Override
	public void run() {
		System.out.println("hello world");
	}
}