package com.yuntu.basis_learn.webserver;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Webserver_sax_data {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		SAXParser saxParser = factory.newSAXParser();
		PersonHandler personHandler = new PersonHandler();
		saxParser.parse(new File("C:\\Users\\Administrator\\Desktop\\0302_171120180302054557.xml"),personHandler);
		List<Person> personList = personHandler.getPersonList();
		System.out.println(personList);
	}
}
class PersonHandler extends DefaultHandler{
	List<Person> personList;

	public List<Person> getPersonList() {
		return personList;
	}

	public void setPersonList(List<Person> personList) {
		this.personList = personList;
	}
	private static String tagName;
	private Person person;
	@Override
	public void startDocument() throws SAXException {
		personList = new ArrayList<>();
	}


	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		tagName = qName;
		if(tagName.equals("person")){
			person = new Person();
		}

	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String s = new String(ch, start, length).trim();
		if(s.length()>0){
			switch (tagName) {
				case "name":
					person.setName(s);
					break;
				case "age":
					person.setAge(Integer.valueOf(s));
					break;
				default:
			}
		}

	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
		if(qName.equals("person")){
			personList.add(person);
		}
	}


	@Override
	public void endDocument() throws SAXException {
		System.out.println("解析结束");
	}
}
class Person{
	private String name;
	private Integer age;

	public Person(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public Person() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", age=" + age +
				'}';
	}
}
