package com.yuntu.basis_learn.reflection_annotation.customize_annotation;

import java.lang.reflect.*;

import static java.lang.Class.forName;

/**
 * @author wang_lei
 * 通过全类名获取 类对象
 * 类对象是单例的
 * 获取类的属性 方法 构造器
 * 设置 isAccessable为空可以关闭安全检查 提高效率
 */
public class RelectionTest {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
		System.out.println(forName("com.yuntu.basis_learn.reflection_annotation.customize_annotation.Student").hashCode());
		System.out.println(forName("com.yuntu.basis_learn.reflection_annotation.customize_annotation.Student").hashCode());
		Class<Student> aClass = (Class<Student>)Class.forName("com.yuntu.basis_learn.reflection_annotation.customize_annotation.Student");

		// 属性api

		// 全类名
		String name1 = aClass.getName();
		System.out.println(name1);
		// 简化类名
		String simpleName = aClass.getSimpleName();
		System.out.println(simpleName);
		//   全部属性
		Field name = aClass.getDeclaredField("name");
		System.out.println(name);
		Field[] declaredFields = aClass.getDeclaredFields();
		for(Field field : declaredFields){
			System.out.println(field);
		}

		//   公开属性
		Field age = aClass.getField("age");
		System.out.println(age);
		Field[] fields = aClass.getFields();


		// 获取构造器
		Constructor<Student> constructor = aClass.getConstructor();
		Constructor<?>[] constructors = aClass.getConstructors();
		Student o = constructor.newInstance();
		// 获取全部构造器
		Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
		Constructor<?>[] declaredConstructors = aClass.getDeclaredConstructors();

		// 获取公开方法
		Method setName = aClass.getMethod("setName", String.class);
		Method[] methods = aClass.getMethods();
		setName.invoke(o,"ss");
		// 获取所有方法
		Method setAge = aClass.getDeclaredMethod("setAge", int.class);
		Method[] declaredMethods = aClass.getDeclaredMethods();

		// 获取方法返回值泛型
		Type genericReturnType = setName.getGenericReturnType();
		Type[] genericParameterTypes = setName.getGenericParameterTypes();

	}
}
