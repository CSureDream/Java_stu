package com.wang.java_stu.chm.oop;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public abstract class Pet {
	private String name;
	private int age;
	

	public Pet(String name) {
		super();
		this.name = name;
	}

	public Pet(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public final void print() {
		System.out.println("name: " + name + ",age:" + age );
	}

	public void eat() {
		System.out.println("Pet eat mrthod!");
	}
}
