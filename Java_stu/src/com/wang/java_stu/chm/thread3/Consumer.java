package com.wang.java_stu.chm.thread3;

public class Consumer implements Runnable {
      private Info info=null;
      
	public Consumer(Info info) {
		super();
		this.info = info;
	}

	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			this.info.get();
			System.out.println(this.info.getName()+"------>"+this.info.getContent());
		}
	
         
	}

}
