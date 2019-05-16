package com.yuntu.basis_learn.webserver;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;

/**
 * @author wang_lei
 * @date 2019-05-12
 * xml流解析方式
 */
public class Webserver_sax {
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		MyHandler myHandler = new MyHandler();
		saxParser.parse(new File("C:\\Users\\Administrator\\Desktop\\0302_171120180302054557.xml"),myHandler);
	}
}
class MyHandler extends DefaultHandler{
	@Override
	public void startDocument() throws SAXException {
		System.out.println("start Document");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("end Document");;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("qName:"+qName);
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {

		String trim = new String(ch, start, length).trim();
		if(trim.length()>0){
			System.out.println(trim);

		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("qName:"+qName);
	}
}
