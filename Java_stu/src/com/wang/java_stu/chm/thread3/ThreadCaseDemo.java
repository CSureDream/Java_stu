package com.wang.java_stu.chm.thread3;


public class ThreadCaseDemo {

	public static void main(String[] args) {
		Info info=new Info();
		Producer pro=new Producer(info);
		Consumer con =new Consumer(info);
		new Thread(pro).start();
		new Thread(con).start();

	}

}
