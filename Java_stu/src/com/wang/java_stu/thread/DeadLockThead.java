package com.wang.java_stu.thread;

public class DeadLockThead implements Runnable {
	private Paper Paper;
	private Pen pen;
	private boolean isRuning = true;
	private int count = 20;

	public DeadLockThead(com.wang.java_stu.thread.Paper paper, Pen pen) {
		super();
		Paper = paper;
		this.pen = pen;
	}

	@Override
	public void run() {
			while (isRuning) {
				if (!Paper.getIsPrivated()) {
					Paper.setIsPrivated(true);
					Paper.setOwner(Thread.currentThread().getName());
				}
				// 判断Pen资源是否可以得到
				if (!pen.getIsPrivated()) {
					pen.setIsPrivated(true);
					pen.setOwner(Thread.currentThread().getName());
				}

				Boolean getPaper = Paper.getOwner().equals(Thread.currentThread().getName());
				Boolean getPen = pen.getOwner().equals(Thread.currentThread().getName());
				// 判断Paper资源是否可以得到
				// 写文章
				if (getPaper && getPen) {
					System.out.println(Thread.currentThread().getName() + "得到了纸与笔，我可以正常写作！");
					System.out.println("系统正常退出！");
					Paper.setIsPrivated(false);
					pen.setIsPrivated(false);
					this.isRuning = false; //

				} else if (getPaper && !getPen) {
					System.out.println(Thread.currentThread().getName() + "得到了纸，我缺少笔！");
					System.out.println(Thread.currentThread().getName() + "我要等待钢笔资源！");
					--count;
					if (count <= 0) {
						System.out.println("i == " + count);
						System.out.println(Thread.currentThread().getName() + " :我检测到形成死锁 ，算了 我先礼让 一下 ");
						System.out.println(Thread.currentThread().getName() + ": 我释放资源，你们写吧！");
						Paper.setIsPrivated(false);
						Thread.currentThread().setPriority(Thread.MIN_PRIORITY);// 降低线程的优先级！

					}

				} else if (!getPaper && getPen) {
					System.out.println(Thread.currentThread().getName() + "得到了钢笔，我缺少纸张！");
					System.out.println(Thread.currentThread().getName() + "我要等待纸张资源！");
					--count;
					if (count <= 0) {
						System.out.println("i == " + count);
						System.out.println(Thread.currentThread().getName() + " :我检测到形成死锁 ，算了 我先礼让 一下 ");
						System.out.println(Thread.currentThread().getName() + ": 我释放资源，你们写吧！");
						pen.setIsPrivated(false);

					}
				} else {
					System.out.println(Thread.currentThread().getName() + "我好悲剧,我什么都没有得到！");
					System.out.println(Thread.currentThread().getName() + "我要继续等待机会....");
				}
			}

		}
		
	}

