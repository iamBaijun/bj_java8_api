package junitTest;

import org.junit.Test;

import IOTest.file.FileDemo;

public class FIleTest {
	
	@Test
	public void test1() {
		boolean boo = new FileDemo().createFile();
		System.out.println(boo?"�����ɹ�":"����ʧ��");
		boolean boo1 = new FileDemo().deleteFile();
		System.out.println(boo1?"ɾ���ɹ�":"ɾ��ʧ��");
	}

}
