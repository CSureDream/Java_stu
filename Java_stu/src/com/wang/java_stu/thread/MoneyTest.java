package com.wang.java_stu.thread;

public class MoneyTest {

	public static void main(String[] args) {

		Account account = new Account("123456", 2000);
		MoneyRunnable drawMoneyRunnable = new MoneyRunnable(account, 700);
		Thread myThread1 = new Thread(drawMoneyRunnable);
		Thread myThread2 = new Thread(drawMoneyRunnable);
		Thread myThread3 = new Thread(drawMoneyRunnable);
		Thread myThread4 = new Thread(drawMoneyRunnable);
		Thread myThread5 = new Thread(drawMoneyRunnable);
		myThread1.start();
		myThread2.start();
		myThread3.start();
		myThread4.start();
		myThread5.start();
	}

}
