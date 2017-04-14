package com.wang.java_stu.thread3;

public class DemoProducersConsumers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Account account = new Account("123456", 0);	//相当于仓库
		
		Thread drawMoneyThread = new DrawMoneyThread(account, 700);	//消费者
		Thread depositeMoneyThread = new DepositeMoneyThread(account, 700);	//生产者

		drawMoneyThread.start();
		depositeMoneyThread.start();
	}

}
