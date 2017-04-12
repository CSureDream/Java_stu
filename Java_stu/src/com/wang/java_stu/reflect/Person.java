package com.wang.java_stu.reflect;


import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Person {
	 //封装属性
	private String name ;
	private int age;
	//constructor
	public Person() {
	}
	public Person(String name){
		
	}
	public Person (int age) {
		
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
	
		return this.name+this.age;
	}
    
    
}
