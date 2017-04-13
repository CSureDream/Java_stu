package com.wang.java_stu.chm.thread;

public class RunnableDemo01 {

	public static void main(String[] args) throws Exception {
		Thread t1 = new Thread(new MyRunnable("线程a"));
		Thread t2 = new Thread(new MyRunnable("线程b"));
		System.out.println(t1.currentThread());
		System.out.println(t1.currentThread().getName());
		System.out.println("请等待2s");
		t1.setPriority(2);
		t1.sleep(2000);// 主线程结束后休眠5s
		t1.yield();// 让出cpu
		System.out.println("是否为后台线程：" + t1.isDaemon());
		t1.setDaemon(true);// 设为后台线程 必须在start前
		System.out.println("修改后  是否为后台线程：" + t1.isDaemon());
		System.out.println("判断t1是否live: --" + t1.isAlive());
		t1.start();
		System.out.println("判断t1是否live: --" + t1.isAlive());
		System.out.println("获取优先级：" + t1.MAX_PRIORITY + " " + t1.MIN_PRIORITY + " " + t1.NORM_PRIORITY);
		t2.setPriority(10);
		t2.start();// 启用t2
		System.out.println("shijian:" + System.currentTimeMillis());
		// 一般主線程結束后子線程不在執行
		//t2.join(10); // 利用 join設置设为 子线程结束后再继续运行住线程
		Thread myr = new Thread(new MyRunnable(null));
		myr.setName("MyRunable");
		System.out.println(myr.currentThread().getName());
		System.out.println("优先级my:" + myr.currentThread().getPriority() + " t1 " + t1.currentThread().getPriority()
				+ " t2 " + t2.currentThread().getPriority());
	}

}
