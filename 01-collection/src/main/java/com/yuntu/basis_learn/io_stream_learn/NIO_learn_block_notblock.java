package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.io.*;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/**
 * @author wang_lei
 * 阻塞的tcp通信
 */
public class NIO_learn_block_notblock {
	@Test
	public void blockClient() throws IOException {
		Selector open1 = Selector.open();
		SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("localhost",8080));
		FileChannel open = FileChannel.open(Paths.get("D:\\data\\ideaWorkspace\\distributed\\study\\newStory.txt"), StandardOpenOption.READ);
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		while(open.read(byteBuffer)!=-1){
			byteBuffer.flip();
			socketChannel.write(byteBuffer);
			byteBuffer.clear();
		}
		socketChannel.shutdownOutput();
		socketChannel.read(byteBuffer);
		byteBuffer.flip();
		byte[] bytes = new byte[byteBuffer.limit()];
		byteBuffer.get(bytes);
		System.out.println(new String(bytes));

		open.close();
		socketChannel.close();

	}

	@Test
	public void blockServer() throws IOException {
		ServerSocketChannel open = ServerSocketChannel.open();
		open.bind(new InetSocketAddress(8080));
		while(true){
			SocketChannel accept = open.accept();
			System.out.println("一个新连接");
			ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

			while(accept.read(byteBuffer)!=-1){
				byteBuffer.flip();
				byte[] bytes = new byte[byteBuffer.limit()];
				byteBuffer.get(bytes);
				System.out.println("asd");
				byteBuffer.clear();
			}
			byteBuffer.put("success!".getBytes());
			byteBuffer.flip();
			accept.write(byteBuffer);
			byteBuffer.clear();
			accept.close();
		}









	}

	public static void main(String... args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(9090);
//让Socket开始接受数据
		Socket socket = serverSocket.accept();
		InputStream is = socket.getInputStream();
		byte[] b = new byte[1024];
		int len;
		while((len = is.read(b))!=-1) {
			String str = new String(b,0,len);
			System.out.println(str);
			if(str.equals("e")||str.equals("exit")) {
				is.close();
				socket.close();
				serverSocket.close();
				break;
			}
		}
	}
	@Test
	public void isClient() throws IOException {
		Socket socket = new Socket(InetAddress.getLocalHost(),9090);
		InputStream is = System.in;
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		OutputStream os = socket.getOutputStream();
//		System.out.println("请输入字符串");
		String str = null;
		while(true) {
			str = br.readLine();
			os.write("adasd".getBytes());
			if(str.equals("e")||str.equals("exit")){
				break;
			}
		}
		os.close();
		socket.close();
	}
}
