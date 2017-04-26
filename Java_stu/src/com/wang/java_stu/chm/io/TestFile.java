package com.wang.java_stu.chm.io;

import java.io.File;

//这是file常见的方法

public class TestFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File f1 =new File("sun.jpg");
       
       System.out.print("Path"+f1.getPath());
       System.out.print("Path"+f1.getAbsolutePath());
	}

}
