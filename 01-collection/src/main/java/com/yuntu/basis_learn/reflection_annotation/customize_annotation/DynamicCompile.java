package com.yuntu.basis_learn.reflection_annotation.customize_annotation;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Authorize wang_lei
 * 动态编译
 */
public class DynamicCompile {
	public static  String dir = "D:\\compileTest\\";
	public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
		//动态编写java代码
		String code = "public class HelloWorld{" +
					"public static void main(String...args){" +
					"System.out.println(\"hello world\");" +
					"}" +
				"}";
		String className = "HelloWorld";

		File file = new File(dir+className+".java");
		if(!file.exists()){
			file.createNewFile();
		}
		OutputStream os = new FileOutputStream(file);
		os.write(code.getBytes());

		// 动态编译
		JavaCompiler compiler = ToolProvider.getSystemJavaCompiler();
		// 第一个参数为 编译命令参数  第二个参数为编译信息 第三个参数为错误信息
		int result = compiler.run(null,null,null,dir+className+".java");
		System.out.println(result==0?"编译成功":"编译失败");

//		 动态执行(Runtime 方式)
//		Runtime runtime = Runtime.getRuntime();
//		// 命令 目录 类名 之间必须有空格
//		Process exec = runtime.exec("java -cp " + dir +" "+ className);
//		// 获取代码执行打印的控制台信息
//		InputStream inputStream = exec.getInputStream();
//		BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
//		String info = null;
//		while((info=br.readLine())!=null){
//			System.out.println(info);
//		}
//		br.close();
//		inputStream.close();
//		os.close();
		// 动态执行(反射方式) :后面就是/+dir
		URL[] urls = new URL[]{new URL("file:/"+dir)};
		URLClassLoader classLoader = new URLClassLoader(urls);
		Class<?> aClass = classLoader.loadClass(className);
		aClass.getMethod("main",String[].class).invoke(null,(Object)new String []{});
	}
}
