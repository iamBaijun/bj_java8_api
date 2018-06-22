package junitTest;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class StringTest {
	
	@Test
	public void test1() {
		
		char[] ch = new char[500];
		for(char i=0;i<500;i++) {
			ch[i] = i;
		}
		String str = String.valueOf(ch);
		System.out.println(str);
	}
	
	@Test
	public void test2() {
		String str = "a,b,c,d,e,f,g";
		String[] strs = str.split(",",4);
		objToStr(strs);
	}
	
	public void objToStr(Object obj) {
		String str = obj.toString();
			System.out.println(str);	
	}
	@Test
	public void test3() {
		objToStr(String.join("-", "b","c","d"));
		List<String> list = new LinkedList<String>();
		list.add("f");
		list.add("f");
		list.add("f");
		list.add("f");
		objToStr(String.join("~", list));
		
	}

}
