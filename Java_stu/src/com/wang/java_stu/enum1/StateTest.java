package com.wang.java_stu.enum1;

import java.util.EnumMap;
import java.util.Map.Entry;

public class StateTest {

	public static void main(String[] args) {
		EnumMap<State, String> StateTest=new EnumMap<>(State.class);
		StateTest.put(State.Deleted, "已删除");
		StateTest.put(State.Fired, "已man");
		StateTest.put(State.Normal, "正常");
		StateTest.put(State.Update, "已升级");
		for (Entry<State, String> entry : StateTest.entrySet()) {
			//entry.getKey().getIndex()=map>>key>>index
			//entry.getKey()==map>>key
			//entry.getValue()== map>value
			System.out.println(entry.getKey().getIndex() + "--" + 
		entry.getKey() + "--" +entry.getValue());
			
		}
		
	}
	

}
