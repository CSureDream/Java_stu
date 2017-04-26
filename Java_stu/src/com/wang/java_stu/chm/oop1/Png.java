package com.wang.java_stu.chm.oop1;

public class Png extends Pet {

	public Png(String name, int age) {
		super(name, age);

	}

	@Override
	public void eat() {

		System.out.println("Png eat!");
	}

	public void swimming() {
		System.out.println("和企鹅玩游泳！！");
	}
}
