package com.yuntu.basis_learn.java_net;

import java.net.InetSocketAddress;

/**
 * @author wang_lei
 * windows下 通过 netstat -ano命令查看占用port
 * linux下通过  lsof -i命令查看占用port
 * 加上端口的ip 使用 InetSocketAddress类表示
 */
public class Net_port {
	public static void main(String[] args) {
		InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1",8080);

	}
}
