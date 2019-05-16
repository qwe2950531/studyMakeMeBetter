package com.yuntu.basis_learn.java_net;

import org.junit.Test;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Net_tcp {
	@Test
	public void server() throws IOException {
		ServerSocket serverSocket = new ServerSocket(8080);
		Socket accept = serverSocket.accept();
		InputStream inputStream = accept.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
		String message = null;
		while((message=br.readLine())!=null){
			System.out.println(message);
		}
		accept.close();
		serverSocket.close();
	}

	@Test
	public void client() throws IOException {
		Socket socket =new Socket("localhost",8080);
		OutputStream outputStream = socket.getOutputStream();
		outputStream.write("hello".getBytes());
		outputStream.close();
		socket.close();

	}
}
