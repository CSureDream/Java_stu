package com.wang.java_stu.chm.thread3;

import org.omg.CORBA.PUBLIC_MEMBER;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Info {
	private String name = "ss";
	private String content = "僵尸";
	private boolean flag = false;// 设置标志位

	public synchronized void set(String name, String content) {
		if (flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setName(name); // 设置名称
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.setContent(content); // 设置内容
			flag = false;
			super.notify();
		}

	}

	public synchronized void get() {
		if (flag) {
			try {
				super.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(this.getName()+"-->"+this.getContent());
			flag=true;
			super.notify();
		}

	}
}
