package com.yuntu.basis_learn.reflection_annotation.customize_annotation;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtField;
import org.junit.Test;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.*;
import java.net.URL;
import java.util.Arrays;

/**
 * @author wang_lei
 * java 执行javascript代码
 */
public class Process_javascript {
	public static void main(String[] args) throws ScriptException, NoSuchMethodException, FileNotFoundException {
		ScriptEngineManager sem = new ScriptEngineManager();
		ScriptEngine engine = sem.getEngineByName("javascript");
//		String javascriptCode = "var a = 10; var b =19; var c = a + b; var user = " +
//				"{name : 'wang_lei',age: 18, schools:['清华','北大']}; ";
//
		// 调用javascript 代码并获取变量
//		engine.eval(javascriptCode);
//		System.out.println(engine.get("a"));
		// 调用javascript 代码并调用方法
//		String javascriptCode = "function add(a,b){" +
//				"var c = a+b; return c;}";
//		engine.eval(javascriptCode);
//		Invocable invo = (Invocable) engine;
//		Object add = invo.invokeFunction("add", new Object[]{2, 5});
//		System.out.println(add);
//		String javascriptTwo = "var number = add(5,2);   print(number)";
//		engine.eval(javascriptTwo);
		// 调用javascript 代码并使用java方法
//		String javascript = " var array_list =java.util.Arrays.asList(\"hello\",\"hi\");  print(array_list);";
//		engine.eval(javascript);
		// 调用javascript file
		URL resourceAsStream = Process_javascript.class.getClassLoader().getResource("hello.js");
		System.out.println(resourceAsStream);
		FileReader fileReader = new FileReader(new File(resourceAsStream.getPath()));
		engine.eval(fileReader);
	}


}
