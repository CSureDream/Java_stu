package com.wang.java_stu.chm.oop1;

/**
 * 多态测试
 */
public class Master {
	public void feed(Pet pet) {
		pet.eat();
	}

	// get pet 方法
	public Pet getpet(String type) {// 父类作为返回值
		if (type.equalsIgnoreCase("dog")) {
			Pet pet = new Dog(null, 0);
			return pet;
		} else if (type.equalsIgnoreCase("png")) {
			Pet pet = new Png(null, 0);
			return pet;
		}
		return null;
	}

	// play 方法
	public void play(Pet pet) { // 父类作为参数
		if (pet instanceof Dog) {
			Dog dog = (Dog) pet; // 向下转型
			dog.catchingFlyDisc();
		} else if (pet instanceof Png) {
			Png png = (Png) pet;
			png.swimming();
		}
	}
}
