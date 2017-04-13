package com.wang.java_stu.enum1;
import lombok.Getter;
import lombok.Setter;
@Getter
public enum State implements ICanReadState  {
	Normal("正常", 1), Update("已更新", 2), Deleted("以删除", 3), Fired("已屏蔽", 4);
	// 成员变量
	@Setter
	private String name;
	@Setter
	private int index;

	// 构造方法

	private State(String name, int index) {
		this.name = name;
		this.index = index;
	}

	// putong fangfa
	public static String getName(int index) {
		for (State c : State.values()) {
			if (c.getIndex() == index) {
				return c.name;
			}
		}
		return null;
	}

	@Override
	public String getState() {
		
		return this.name;
	}
	@Override
	public void read() {
		System.out.println(this.index+"--"+this.name);
		
	}

          

	
	 
}
