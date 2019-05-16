package com.yuntu.basis_learn.java_eight.parallel_stream;

import java.util.concurrent.RecursiveTask;

public class MyForkJoin extends RecursiveTask<Long> {
	private final long[] numbers;
	private final int start;
	private final int end;

	public MyForkJoin(long[] numbers, int start, int end) {
		this.numbers = numbers;
		this.start = start;
		this.end = end;
	}

	public static final long THRESHOLD = 10_000;
	public MyForkJoin(long[] n){
		this.numbers=n;
		this.end=n.length;
		this.start=0;
	}

	@Override
	protected Long compute() {
		int length = end-start;
		if(length<=THRESHOLD){
			return computeSequentially();
		}
		MyForkJoin left = new MyForkJoin(numbers,start,start+length/2);
		left.fork();
		MyForkJoin right = new MyForkJoin(numbers,start+length/2,end);
		Long rightResult = right.compute();
		Long leftResult = left.join();

		return leftResult+rightResult;
	}

	private long computeSequentially(){
		long sum = 0;
		for(int i=start;i<end;i++){
			sum+=numbers[i];
		}
		return sum;
	}
}
