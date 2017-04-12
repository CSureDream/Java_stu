package com.wang.java_stu.enum1;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Color c1=Color.BLUE;
       System.out.println(c1.getName());
       Color c2=Color.getInStance(1);
       System.out.println(c2.getName());
              //for each 输出
       for (Color color : Color.values()) {
    	   System.out.println(color);
			}
       Set <Color> cSet=new TreeSet<Color>();
       cSet.add(Color.GREEN);
       cSet.add(Color.RED);
       cSet.add(Color.BLUE);
    
     
       
       Iterator<Color> iterator=cSet.iterator();
       while (iterator.hasNext()) {
	   System.out.print(iterator.next() + "、");
	}
       
    
	}

}
