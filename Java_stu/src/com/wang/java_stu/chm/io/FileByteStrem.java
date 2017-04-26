package com.wang.java_stu.chm.io;

/**
 * 文件读写操作
 * 简单的复制
 * @author Administrator
 *
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileByteStrem {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream("sun.jpg");
		FileOutputStream fos = new FileOutputStream("suncop.jpg");
		int read = fis.read();
		while (read != -1) {
			fos.write(read);
			read = fis.read();
		}
         fis.close();
         fos.close();
         System.out.println("copy ok");
	}

}
