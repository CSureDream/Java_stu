package com.wang.java_stu.chm.oop1;

public class Dog extends Pet {

	public Dog(String name, int age) {
		super(name, age);

	}

	@Override
	public void eat() {

		System.out.println("dog eat");
	}

	public void catchingFlyDisc() {
		System.out.println("和狗狗玩飞碟的方法");
	}
}
