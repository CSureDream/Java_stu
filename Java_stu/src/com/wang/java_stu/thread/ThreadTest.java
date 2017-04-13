package com.wang.java_stu.thread;

/**
 * thread1 与Thread2 没有设置优先级 其输出顺序由 cpu决定
 *
 */
public class ThreadTest {
	public static void main(String[] args) {
		// 1 测试thread类创建线程
		for (int i = 0; i < 100; i++) {
			// Thread.currentThread() 获取当前线程 main方法下 = main
			System.out.println(Thread.currentThread().getName() + " " + i);
			if (i == 30) {
				Thread myThread1 = new MyThread(); // 创建一个新的线程 myThread1 //
													// 此线程进入新建状态

				Thread myThread2 = new MyThread(); // 创建一个新的线程 myThread2 //
													// 此线程进入新建状态

				myThread1.start(); // 调用start()方法使得线程进入就绪状态
				myThread2.start(); // 调用start()方法使得线程进入就绪状态
			}
		}

		// 2 测试runnable创建线程
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "-" + i);
			if (i == 30) {
				// 创建一个Runnable实现类的对象
				Runnable myRunnable = new MyRunnable();
				Thread thread1 = new Thread(myRunnable);// 将myRunnable作为Thread
														// target创建新的线程
				// 这种方式创建 可省略 Runnable myRunnable=new MyRunnable();
				Thread thread2 = new Thread(new MyRunnable());
				thread1.start();
				thread2.start();
			}
		}
	}

}
