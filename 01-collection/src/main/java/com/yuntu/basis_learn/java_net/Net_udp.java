package com.yuntu.basis_learn.java_net;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * @author wang_lei
 * 使用udp协议发送和接受
 * 技术要点:
 * datagrampacket 数据报
 * datagramSocket 套接字
 * 要监听的ip和端口创建在socket上
 * 要发送的数据报中需要带上目的地  也就是 ip port
 */
public class Net_udp {
	@Test
	public void udp_server() throws IOException {
		DatagramSocket datagramSocket = new DatagramSocket(new InetSocketAddress("127.0.0.1",8080));
		byte [] bytes = new byte[1024];
		DatagramPacket datagramPacket = new DatagramPacket(bytes,bytes.length);
		datagramSocket.receive(datagramPacket);
		System.out.println(new String(bytes,0,bytes.length));
	}

	@Test
	public void udp_client() throws IOException {
		DatagramPacket datagramPacket;
		byte [] bytes = new byte[1024];
		datagramPacket = new DatagramPacket(bytes,bytes.length,new InetSocketAddress("127.0.0.1",8080));
		datagramPacket.setData("hello".getBytes());
		DatagramSocket datagramSocket = new DatagramSocket();
		datagramSocket.send(datagramPacket);

	}
}
