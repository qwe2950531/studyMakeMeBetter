package com.yuntu.basis_learn.reflection_annotation.customize_annotation;

import javassist.*;
import org.junit.Test;

import java.io.IOException;
import java.lang.reflect.Method;

/**
 * @author 动态生成字节码
 * @date 2019-05-15
 * java中动态生成字节码
 */
public class Java_asist {
	public static void main(String[] args) throws CannotCompileException, NotFoundException, IOException {
		ClassPool classPool = ClassPool.getDefault();
		CtClass ctClass = classPool.makeClass("com.yuntu.assist.Hello");
		CtField field = CtField.make("private String hi;", ctClass);
		ctClass.addField(field);
		CtMethod method = CtMethod.make("public void setHi(String hi){ this.hi = hi;}", ctClass);
		ctClass.addMethod(method);
		CtMethod methodTwo = CtMethod.make("public String getHi(){ return this.hi;}", ctClass);
		ctClass.addMethod(methodTwo);
		CtConstructor ctConstructor = new CtConstructor(new CtClass[]{classPool.get("java.lang.String")},ctClass);
		ctClass.addConstructor(ctConstructor);
		ctClass.writeFile("D:\\data\\ideaWorkspace\\distributed\\study\\01-collection\\src\\main\\java\\com\\yuntu\\basis_learn\\reflection_annotation\\customize_annotation");
		System.out.println("生成成功");



	}

	@Test
	public void java_assist() throws Exception {
		ClassPool classPool = ClassPool.getDefault();
		CtClass ctClass = classPool.makeClass("com.yuntu.learn.Today");

		CtField field = new CtField(classPool.get("java.lang.String"), "weather", ctClass);
		field.setModifiers(Modifier.PRIVATE);
		ctClass.addField(field);

		CtMethod getWeather = new CtMethod(classPool.get("java.lang.String"), "getWeather", null, ctClass);
		getWeather.setModifiers(Modifier.PUBLIC);
		getWeather.setBody("{  System.out.println($0.weather); return weather;  }");
		ctClass.addMethod(getWeather);
		CtMethod setWeather = new CtMethod(CtClass.voidType, "setWeather", new CtClass[]{classPool.get("java.lang.String")}, ctClass);
		setWeather.setModifiers(Modifier.PUBLIC);
		setWeather.setBody("{ $0.weather = $1;}");
		ctClass.addMethod(setWeather);

		getWeather.insertAfter("System.out.println(\"after\");");
		getWeather.insertBefore("System.out.println(\"before\");");
		Class aClass = ctClass.toClass();
		Object o = aClass.newInstance();
		Method setWeather1 = aClass.getDeclaredMethod("setWeather", String.class);
		setWeather1.invoke(o,"hello");
		Method setWeather12 = aClass.getDeclaredMethod("getWeather");
		Object invoke = setWeather12.invoke(o);
//		System.out.println(invoke);


	}
}
