package com.wang.java_stu.chm.thread3;

public class Producer implements Runnable {
	private Info Info = null; // info 引用

	public Producer(Info info) {
		super();
		Info = info;
	}

	@Override
	public void run() {
		// 定义标记位
		boolean flag = false;
		for (int i = 0; i < 50; i++) {
			if (flag) {
				this.Info.set("ss", "nvnn");
				flag = false;
			} else {
				this.Info.set("sm", "rqb");
				flag = true;
			}
		}
	}

}
