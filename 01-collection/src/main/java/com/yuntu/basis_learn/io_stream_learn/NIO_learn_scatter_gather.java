package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wang_lei
 * 散射和收集
 */
public class NIO_learn_scatter_gather {
	/**
	 * 散射
	 */
	@Test
	public void scatter(){
		try {
			InputStream inputStream = new FileInputStream(new File("D:\\data\\ideaWorkspace\\distributed\\study\\story.txt"));
			FileChannel channel = ((FileInputStream) inputStream).getChannel();
			ByteBuffer byteBufferOne = ByteBuffer.allocate(28);
			ByteBuffer byteBufferTwo = ByteBuffer.allocate(1024);
			ByteBuffer[] byteBuffers = {byteBufferOne,byteBufferTwo};
			channel.read(byteBuffers);

			System.out.println(byteBufferOne);
			System.out.println(byteBufferTwo);
			byte[] bytes = new byte[1024];
			byteBufferOne.flip();
			byteBufferTwo.flip();
			byteBufferOne.get(bytes,0,byteBufferOne.limit());
			byteBufferTwo.get(bytes,28,byteBufferTwo.limit());
			System.out.println(new String(bytes));
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 收集
	 */
	@Test
	public void gather(){
		InputStream inputStream = null;
		try {
			inputStream = new FileInputStream(new File("D:\\data\\ideaWorkspace\\distributed\\study\\story.txt"));
			FileChannel channel = ((FileInputStream) inputStream).getChannel();
			ByteBuffer byteBufferOne = ByteBuffer.allocate(28);
			ByteBuffer byteBufferTwo = ByteBuffer.allocate(1024);
			ByteBuffer[] byteBuffers = {byteBufferOne,byteBufferTwo};
			channel.read(byteBuffers);
			byteBufferOne.flip();
			byteBufferTwo.flip();
			System.out.println(byteBufferOne);
			System.out.println(byteBufferTwo);
			OutputStream outputStream = new FileOutputStream(new File("D:\\data\\ideaWorkspace\\distributed\\study\\newStory.txt"));
			FileChannel channel1 = ((FileOutputStream) outputStream).getChannel();
			channel1.write(byteBuffers);
			inputStream.close();
			outputStream.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
