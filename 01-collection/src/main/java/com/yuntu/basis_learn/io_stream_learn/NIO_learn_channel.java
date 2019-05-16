package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author wang_lei
 * @date 2019-05-07
 * 通道
 */
public class NIO_learn_channel {

	@Test
	public void testChannel(){
		try {
			InputStream inputStream = new FileInputStream(new File("D:\\data\\ideaWorkspace\\distributed\\study\\story.txt"));
			FileChannel channel = ((FileInputStream) inputStream).getChannel();
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

			int read = channel.read(byteBuffer);
			while(read!=-1){
				byteBuffer.flip();
				byte[] my = new byte[byteBuffer.limit()];
				byteBuffer.get(my);
				System.out.println("---");
				System.out.print(new String(my));

				byteBuffer.clear();
				read = channel.read(byteBuffer);
			}
			inputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
