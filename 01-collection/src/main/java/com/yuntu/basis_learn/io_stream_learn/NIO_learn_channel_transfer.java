package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * @author wang_lei
 * @date 2019-05-07
 * 通道与通道之间直接的数据传输
 */
public class NIO_learn_channel_transfer {
	/**
	 * transferTo
	 */
	@Test
	public void transferTo(){
		try {
			RandomAccessFile  rfOne = new RandomAccessFile(new File("D:\\data\\ideaWorkspace\\distributed\\study\\newStory.txt"),"rw");
			RandomAccessFile rfTwo = new RandomAccessFile(new File("D:\\data\\ideaWorkspace\\distributed\\study\\story.txt"),"rw");
			FileChannel channeOne = rfOne.getChannel();
			FileChannel channelTwo = rfTwo.getChannel();
			channelTwo.transferTo(0,channelTwo.size(),channeOne);


		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}


	}

	/**
	 * transferFrom
	 */
	public void transferFrom(){
		RandomAccessFile  rfOne = null;
		try {
			rfOne = new RandomAccessFile(new File("D:\\data\\ideaWorkspace\\distributed\\study\\newStory.txt"),"rw");
			RandomAccessFile rfTwo = new RandomAccessFile(new File("D:\\data\\ideaWorkspace\\distributed\\study\\story.txt"),"rw");
			FileChannel channeOne = rfOne.getChannel();
			FileChannel channelTwo = rfTwo.getChannel();
			channeOne.transferFrom(channelTwo,0,channelTwo.size());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
