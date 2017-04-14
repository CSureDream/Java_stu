package com.wang.java_stu.thread3;

public class DrawMoneyThread extends Thread {
	private Account account;
	private double amount;
	public DrawMoneyThread(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}
	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			account.draw(amount, i);
		}
		System.out.println("----取钱的次数结束！----");
	}
	}
	


