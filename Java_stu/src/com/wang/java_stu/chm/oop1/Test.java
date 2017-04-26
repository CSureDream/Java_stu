package com.wang.java_stu.chm.oop1;
public class Test {

	public static void main(String[] args) {
		
     Master master=new Master();//使用master类 创建 master对象
     Dog dog =new Dog("ss", 2);
     Png png =new Png("sm", 3);
     
     
     Pet pet =new Dog("ss", 2);// 向上转型
     master.feed(pet);  //调用的是dog eat 方法  
     System.out.println(pet.getName()+" "+pet.getAge());
     
     Pet pet1 =new Png("sm",3);
     master.feed(pet1);  // 调用png 的方法
     System.out.println(pet1.getName()+" "+ pet1.getAge());
     
    master.play(pet1);
    master.play(pet);
    
    // 领养宠物的get方法
    Pet pet2=master.getpet("dog");
    Pet pet3=master.getpet("png");
    master.play(pet3);
    master.play(pet2);
    
    
	}

}
