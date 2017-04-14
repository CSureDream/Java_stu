package com.wang.java_stu.thread;


public class DeadLockTest {


	public static void main(String[] args) {

		Paper paper = new Paper();
		Pen pen = new Pen();
		DeadLockThead war = new DeadLockThead(paper, pen);
		DeadLockThead war2 = new DeadLockThead(paper, pen);
		Thread zhangsan = new Thread(war, "zhangsan");
		Thread wanglaowu = new Thread(war2, "wanglaowu");
		zhangsan.start();
		wanglaowu.start();
	}

}
