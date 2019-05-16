package com.yuntu.basis_learn.io_stream_learn;

import org.junit.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.util.Iterator;
import java.util.Set;

/**
 * @author wang_lei
 */
public class NIO_learn_selector {
	@Test
	public void selector(){
		try {
			Selector selector = Selector.open();
			ServerSocketChannel channel1 = ServerSocketChannel.open();
			channel1.bind(new InetSocketAddress("localhost",8080));
			channel1.configureBlocking(false);
			channel1.register(selector, SelectionKey.OP_ACCEPT);
			while(selector.select()>0){
				Set<SelectionKey> keys = selector.selectedKeys();
				Iterator<SelectionKey> iterator = keys.iterator();
				while(iterator.hasNext()){
					SelectionKey next = iterator.next();
					if(next.isAcceptable()){
						SocketChannel accept = channel1.accept();
						accept.configureBlocking(false);
						accept.register(selector,SelectionKey.OP_READ);
					} else if(next.isReadable()){
						 SocketChannel socketChannel =(SocketChannel) next.channel();
						 ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
						int read = socketChannel.read(byteBuffer);
						byteBuffer.flip();
						 	System.out.println(new String(byteBuffer.array(),0,read));
						 	byteBuffer.clear();
					}
					iterator.remove();

				}


			}



		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void client() throws IOException {
		SocketChannel open = SocketChannel.open(new InetSocketAddress("localhost",8080));
		open.configureBlocking(false);
		ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
		byteBuffer.put("woaini".getBytes());
		byteBuffer.flip();
		open.write(byteBuffer);
		byteBuffer.clear();
		open.close();


	}
}
