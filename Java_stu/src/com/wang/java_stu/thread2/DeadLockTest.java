package com.wang.java_stu.thread2;

public class DeadLockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     char[]a={'A','B','C'};
	 char[]b={'D','E','F'};
	 DeadLockThread t1=new DeadLockThread(a, b);
	 DeadLockThread t2=new DeadLockThread(b, a);
	 t1.start();
	 t2.start();
	 
	}

}
