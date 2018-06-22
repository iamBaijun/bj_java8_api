package junitTest;

import org.junit.Test;

import IOTest.file.FileDemo;

public class FIleTest {
	
	@Test
	public void test1() {
		boolean boo = new FileDemo().createFile();
		System.out.println(boo?"创建成功":"创建失败");
		boolean boo1 = new FileDemo().deleteFile();
		System.out.println(boo1?"删除成功":"删除失败");
	}

}
