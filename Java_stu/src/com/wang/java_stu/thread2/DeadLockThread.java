package com.wang.java_stu.thread2;
/**
 * 死锁的简单程序
 * @author Administrator
 *
 */



public class DeadLockThread extends Thread {
	private char[] source;
	private char[] dest;

	public DeadLockThread(char[] source, char[] dest) {
		super();
		this.source = source;
		this.dest = dest;
	}

	@Override
	public void run() {
		synchronized (source) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
          synchronized(dest){
          System.arraycopy(source, 0, dest, 0, source.length);
          System.out.println(dest);
          }
	}

}
