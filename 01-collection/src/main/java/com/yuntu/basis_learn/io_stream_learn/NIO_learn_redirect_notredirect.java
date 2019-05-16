package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author wang_lei
 * 直接缓冲区和非直接缓冲区的使用
 */
public class NIO_learn_redirect_notredirect {
	/**
	 * 非直接缓冲区
	 */
	@Test
	public void not_redirect() throws IOException {
		ByteBuffer allocate = ByteBuffer.allocate(1024);
		FileChannel open = FileChannel.open(Paths.get("D:\\data\\ideaWorkspace\\distributed\\study\\newStory.txt"), StandardOpenOption.READ);
		open.read(allocate);
		FileChannel openFileChannel = FileChannel.open(Paths.get("D:\\data\\ideaWorkspace\\distributed\\study\\newOneStory.txt"),StandardOpenOption.WRITE);
		allocate.flip();
		openFileChannel.write(allocate);
	}

	/**
	 * 直接缓冲区 Buffer形式
	 */
	@Test
	public void redirect() throws IOException {
		FileChannel open = FileChannel.open(Paths.get("E:\\新建文件夹\\[瑞树×萌你妹]美少女万华镜-罪与罚的少女-.rar"), StandardOpenOption.READ);
		ByteBuffer allocate = ByteBuffer.allocate(10240);
		FileChannel openFileChannel = FileChannel.open(Paths.get("D:\\data\\ideaWorkspace\\distributed\\study\\newOneStory.rar"),StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);

		while(open.read(allocate)>0){
			allocate.flip();
			openFileChannel.write(allocate);
			allocate.clear();
		}
	}

	/**
	 * 直接缓冲区 文件映射形式
	 */
	@Test
	public void mapRedirect() throws IOException {
		long twoG = 1L<<29;
		long cur = 0L;
		FileChannel open = FileChannel.open(Paths.get("E:\\新建文件夹\\[瑞树×萌你妹]美少女万华镜-罪与罚的少女-.rar"), StandardOpenOption.READ);
		FileChannel openFileChannel = FileChannel.open(Paths.get("D:\\data\\ideaWorkspace\\distributed\\study\\newOneStory.rar"),StandardOpenOption.WRITE,StandardOpenOption.READ,StandardOpenOption.CREATE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("3221225472");
//		while(cur<open.size()) {
//			MappedByteBuffer map = open.map(FileChannel.MapMode.READ_ONLY, cur, twoG);
//			byte[] bytes = new byte[map.limit()];
//			map.get(bytes);
//			MappedByteBuffer map1 = openFileChannel.map(FileChannel.MapMode.READ_WRITE, cur, twoG);
//			map1.put(bytes);
//			cur+=twoG;
//			if(cur>open.size()){
//				System.out.println("11");
//				cur=open.size()-twoG;
//			}
//			System.out.println(cur);
//
//		}


		open.close();
		openFileChannel.close();




	}

}
