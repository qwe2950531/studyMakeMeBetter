package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author wang_lei
 * 缓冲区（有多种类型的缓冲区，其中最常用的缓冲区类型就是byteBuffer
 * ByteBuffer
 * 各类型Buffer: longBuffer
 * 常用API:
 *
 * put():存入数据到缓冲区
 * get():获取缓冲区数据
 *
 * 核心属性：
 * position: 当前位置
 * limit: 可读取的总大小
 * capacity  最大容量
 * mark: 记录当前position位置 之后position变化后可以通过reset()方法恢复
 * 其他属性：
 * remaining： 可读长度 当调用flip方法后进去读取
 *
 */
public class NIO_learn_buffer {
	@Test
	public  void testOne() {
		ByteBuffer allocate = ByteBuffer.allocate(1024);
		System.out.println("initial(默认初始化是写模式) .....");
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());

		// 写入数据
		allocate.put("i love u".getBytes());
		System.out.println("put .....");
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());

		// 切换到读模式
		System.out.println("flip .....");
		allocate.flip();
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());

		// 读取数据
		byte[] my= new byte[allocate.limit()];
		allocate.get(my);
		System.out.println(new String(my));

		System.out.println("after get .....");
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());


		// rewind(): 重读数据
		allocate.rewind();
		System.out.println("after rewind .....");
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());

		// clear():清空缓冲区（并不会真正的清空byte数组 但是会处于被遗忘状态）
//		allocate.clear();
		// compact():同样是清空缓冲区,但是position重置为limit limit重置为capacity 这意味着原来的可读数据不会被遗忘
		allocate.compact();
		System.out.println("after clear.....");
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());
		allocate.flip();
		System.out.println(allocate.position());
		System.out.println(allocate.limit());
		System.out.println(allocate.capacity());

	}
	/**
	 * mark reset
	 */
	@Test
	public void testTwo(){
		String str = "abcd";
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		byteBuffer.put(str.getBytes());

		System.out.println("after put.....");
		System.out.println(byteBuffer.position());
		System.out.println(byteBuffer.limit());
		System.out.println(byteBuffer.capacity());

		byteBuffer.mark();

		// clear 会清楚mark的位置
//		byteBuffer.clear();
//		System.out.println("after clear.....");
//		System.out.println(byteBuffer.position());
//		System.out.println(byteBuffer.limit());
//		System.out.println(byteBuffer.capacity());
		byteBuffer.flip();
		byteBuffer.mark();
		byte[] bytes = new byte[2];
		byteBuffer.get(bytes);
		System.out.println(byteBuffer.position());
		System.out.println(new String(bytes));


		byteBuffer.reset();
		System.out.println("after reset.....");
		System.out.println(byteBuffer.position());
		System.out.println(byteBuffer.limit());
		System.out.println(byteBuffer.capacity());

		byte[] bytes1 = new byte[2];
		byteBuffer.get(bytes1);
		System.out.println(new String(bytes1));
	}
}
