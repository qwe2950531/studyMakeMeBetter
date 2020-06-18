package com.yuntu.basis_learn.thread_learn;

import java.util.concurrent.atomic.AtomicInteger;

public class TestHello {
		static 	AtomicInteger  integer= new AtomicInteger(0);
		final int x;
		int y;
		static TestHello testHello;
		public TestHello(){
			x = 1;
			y=2;
		}
		public static void writer(){
				testHello = new TestHello();
		}



}
