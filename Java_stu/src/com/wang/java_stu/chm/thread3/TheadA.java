package com.wang.java_stu.chm.thread3;



public class TheadA {

	public static void main(String[] args) throws Exception {
		ThreadSs ss = new ThreadSs();
		ss.start();
		synchronized (ss) {
			System.out.println("等待对象ss完成计算---");
			// 当前线程等待
			ss.wait();
		}
              System.out.println("对象ss计算结果为"+ss.total);
	}

}
