package com.yuntu.basis_learn.reflection_annotation.customize_annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Optional;

/**
 * @author wang_lei
 * 获取注解信息
 */
public class ORMAnnotationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> aClass = Class.forName("com.yuntu.basis_learn.reflection_annotation.customize_annotation.Student");
		Field[] fields = aClass.getDeclaredFields();
		for(Field field : fields){
//			System.out.println(field);
			ORMAnnotation annotations = field.getAnnotation(ORMAnnotation.class);
			Optional<ORMAnnotation> annotations1 = Optional.ofNullable(annotations);
			annotations1.ifPresent(a->{
				System.out.println(a.columnName());
				System.out.println(a.type());
				System.out.println(a.length());
			});
//			if(annotations!=null){
//				System.out.println(annotations.columnName());
//				System.out.println(annotations.type());
//				System.out.println(annotations.length());
//			}


		}

	}
}
