package com.wang.java_stu.thread;

public class MyRunnable implements Runnable {
        //runnable 创建线程
	private int i = 0;

	@Override
	public void run() {
    for (int i = 0; i < 100; i++) {
		System.out.println(Thread.currentThread().getName()+"  "+i);
	}
	}
			
}
