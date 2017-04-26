package com.wang.java_stu.chm.oop2;

public class Text {

	public static void main(String[] args) {
		// 向上
		Person p = new Stu();    //父类对象通过子类实例化     向上转
		p.fun1();
		p.fun2();
       //向下
		Person person =new Stu();  //父类对象自由实例化     向下 转
		Stu stu= (Stu) p;
		person.fun1();
		person.fun2();
		stu.fun1();
		stu.fun2();
		stu.fun3();
	}

}
