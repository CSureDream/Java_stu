package com.wang.java_stu.chm.thread;

class MyRunnable implements Runnable {
	private String name;

	public MyRunnable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(name + " 运行    i=" + i);
		}

	}

}
