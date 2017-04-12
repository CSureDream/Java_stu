package com.wang.java_stu.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.sun.xml.internal.bind.v2.runtime.Name;

public class Test {

	public static void main(String[] args) throws Exception {
		// get class
		Class<?> clazz = Person.class;
		System.out.println(clazz);
		Object object = clazz.newInstance();
		// get 所有属性
		Field[] fs = clazz.getDeclaredFields();
		StringBuffer sb = new StringBuffer();
		for (Field field : fs) {
			sb.append(field.getName() + " ");
		}
		System.out.println(sb);

		// get field
		Field field1 = clazz.getDeclaredField("name");
		// 打破封装
		field1.setAccessible(true);
		// 设定值
		field1.set(object, "lili");
		System.out.println(field1.get(object));
		// get methods
		Method[] ms = clazz.getDeclaredMethods();
		for (int i = 0; i < ms.length; i++) {
			System.out.print(ms[i].getName() + " ");
		}
	}

}
