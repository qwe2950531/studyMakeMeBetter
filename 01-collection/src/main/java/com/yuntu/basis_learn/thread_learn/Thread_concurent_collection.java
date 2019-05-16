package com.yuntu.basis_learn.thread_learn;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author Administrator
 * 只是在内部对读写操作加了可重入锁  在使用list.size()等方法的时候还是要小心因为外部并未加锁
 */
public class Thread_concurent_collection  {
	public static void main(String[] args) {
		CopyOnWriteArrayList list = new CopyOnWriteArrayList();
		for(int i=0;i<5000;i++){
			list.add("sa");
		}
		for(int i=0;i<5000;i++){
			new Thread(()->{
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				list.remove(list.size()-1);
			}).start();
		}

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(list.size());
	}
}
