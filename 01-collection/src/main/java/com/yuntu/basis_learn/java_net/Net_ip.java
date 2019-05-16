package com.yuntu.basis_learn.java_net;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @author wang_lei
 * @date 2019.05.12
 * 网络编程之ip
 */
public class Net_ip {

	public static void main(String[] args) {
		InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",8080);
		System.out.println(inetSocketAddress.getAddress());
		System.out.println(inetSocketAddress.getHostName());
		System.out.println(inetSocketAddress.getHostString());
		System.out.println(inetSocketAddress.getPort());
	}
}
