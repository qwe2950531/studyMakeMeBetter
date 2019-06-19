package com.yuntu.basis_learn.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class main {
	public static final String DATE_STRING = ">>asdasasdasasasasddddddasdsadaqaqaqwweesssaaqqqq>>";
	public static final String P_COMM = "(?<=>>).*(?=>>)";
	public static void main(String[] args) {
		String html = HtmlUtils.getHtml("http://tingshen.court.gov.cn/court/1722");
		html=html.replaceAll("\"/static","\"http://tingshen.court.gov.cn/static");
//
		html=html.replaceAll("href=\"/(?!/)","href=\"localhost:8080/GAOSystem/transform?url=http://tingshen.court.gov.cn/");
//		html=html.replaceAll("(?<=<link).*(href=\"/).*(?=/>)","http://tingshen.court.gov.cn/");
		System.out.println(html);
//		Pattern pattern = Pattern.compile("(?<=<script).*(?<name>src=\"/static.*\").*(?=></script>)");
//		Matcher matcher = pattern.matcher(html);
//		while(matcher.find()){
//			System.out.println(matcher.group("name"));
		}

//		System.out.printf("\nmatcher.group(2) value:%s", matcher.group(2));
//		System.out.printf("\nmatcher.group(3) value:%s", matcher.group(3));
//		System.out.printf("\nmatcher.group(4) value:%s", matcher.group(4));
//	}
}
