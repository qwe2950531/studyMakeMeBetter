package com.yuntu.basis_learn.io_stream_learn;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;

public class Test {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\test.txt");
		RandomAccessFile raf;
		raf = new RandomAccessFile(file, "rw");
//		CountDownLatch
//		try {
//			raf.setLength(1024000);
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			raf.close();
//		}
	}
}
