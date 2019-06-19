package com.yuntu.basis_learn.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HtmlUtils {
	public static String getHtml(String u){
		URL url = null;
		try {
			url = new URL(u);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		StringBuilder sb = new StringBuilder();
		System.out.println("协议:"+url.getProtocol());
		System.out.println("主机名:"+url.getHost());
		System.out.println("端口:"+url.getPort());
		System.out.println("完整路径 包含请求参数:"+url.getFile());
		System.out.println("只包含路径 uri:"+url.getPath());
		HttpURLConnection connection=null;
		try {
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/74.0.3729.131 Safari/537.36");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			InputStream inputStream = connection.getInputStream();
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"UTF-8"));
			String msg = null;
			while((msg=bufferedReader.readLine())!=null){
				sb.append("\n");
				sb.append(msg);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}
}
