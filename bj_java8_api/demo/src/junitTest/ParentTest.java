package junitTest;

import org.junit.Test;

import entity.child.EmpFinance;

public class ParentTest {
	
	 /**
	 * @Description: ���ø���ķ�����ʹ�ø���ĳ�Ա����   
	 * void 
	 * @version: v1.0.0
	 * @author: bai
	 * @date: 2018��6��24�� ����8:46:10 
	 */
	@Test
	public void test1() {
		EmpFinance finance = new EmpFinance();
		String str = finance.getParent("hello");
		System.out.println(str);
		Object obj = finance.getClass();
		System.out.println(finance.hashCode());
		System.out.println(obj);
		
	}

}
