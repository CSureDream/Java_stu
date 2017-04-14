package com.wang.java_stu.thread;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Account {
	private String accountNo;
	private double balance;
	private boolean hasMoney = false;

	public Account() {
	}

	public Account(String accountNo, double balance) {
		super();
		this.accountNo = accountNo;
		this.balance = balance;
	}

	public synchronized void deposite(double depositeAmount, int i) {

		if (hasMoney) {
			// 账户中已有人存钱进去，此时当前线程需要等待阻塞
			try {
				System.out.println(Thread.currentThread().getName() + " 开始要执行wait操作" + " -- i=" + i);
				wait();
				// 1
				System.out.println(Thread.currentThread().getName() + " 执行了wait操作" + " -- i=" + i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			// 开始存钱
			System.out.println(Thread.currentThread().getName() + " 存款:" + depositeAmount + " -- i=" + i);
			setBalance(balance + depositeAmount);
			System.out.println("存钱后余额为：" + getBalance());
			hasMoney = true;
			// 唤醒其他线程
			notifyAll();
			// 2
			/*
			 * try { Thread.sleep(3000); } catch (InterruptedException e) {
			 * e.printStackTrace(); }
			 */
			System.out.println(Thread.currentThread().getName() + "-- 存钱 -- 执行完毕" + " -- i=" + i);
		}
	}
}
