package com.wang.java_stu.chm.thread3;
/**
 * a线程等待b线程结束后调用ss的结果
 * 设置a线程wait  当ss线程结束后唤醒  notifya
 * @author Administrator
 *
 */
public class ThreadSs extends Thread {
         int total;

		@Override
		public void run() {
			synchronized(this){
				for (int i = 0; i < 100; i++) {
					total+=i;
				}
				try {
					System.out.println("休眠3s");
					sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// 当多个对象等待时使用notifyall();
				notify();
			}
		}
         
}
