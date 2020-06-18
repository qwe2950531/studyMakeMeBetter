package com.yuntu.basis_learn.thread_learn.two;

public class VisibilityDemo {
	public static void main(String[] args) throws InterruptedException {
		TimeConsumingTask timeConsumingTask = new TimeConsumingTask();
		Thread thread = new Thread(timeConsumingTask);
		thread.start();
		Thread.sleep(10000);
		timeConsumingTask.cancel();

	}

}
class TimeConsumingTask implements Runnable{
	private boolean toCancel = false;

	@Override
	public void run() {
		while(!toCancel){
			if(doExcute()){
				break;
			}
		}
		if(toCancel){
			System.out.println("Task was canceled.");
		} else {
			System.out.println("Task done.");
		}
	}
	private boolean doExcute(){
		boolean isDone = false;
		System.out.println("excuting ......");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return isDone;
	}

	public void cancel(){
		toCancel = true;
		System.out.println(this + "canceled.");
	}
}