package com.wang.java_stu.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MoneyRunnable implements Runnable {
	private final Lock lock = new ReentrantLock();
	//private double balance;
	private Account account;
	private double drawAmount;

	public MoneyRunnable(Account account, double drawAmount) {
		super();
		this.account = account;
		this.drawAmount = drawAmount;
	}

	@Override
	public void run() {
		lock.lock();
		System.out.println(Thread.currentThread().getName());
		if (account.getBalance() >= drawAmount) { // 1
			System.out.println("取钱成功， 取出钱数为：" + drawAmount);
			double balance = account.getBalance() - drawAmount;
			account.setBalance(balance);
			System.out.println("余额为：" + balance);
		}
		lock.unlock();
	}
}
