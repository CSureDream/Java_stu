package com.wang.java_stu.thread3;
//存-取-测试-Account(账户)

// 存钱类

public class DepositeMoneyThread extends Thread {
	private Account account;
	private double amount;

	public DepositeMoneyThread(Account account, double amount) {
		super();
		this.account = account;
		this.amount = amount;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposite(amount, i);
		}
		System.out.println("++++存钱次数结束++++");
	}

}
