package com.wang.java_stu.thread;

public class MyThread extends Thread {
         //thread 类 创建线程
	private int i = 0;

	@Override
	public void run() {

		for (i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}

}
