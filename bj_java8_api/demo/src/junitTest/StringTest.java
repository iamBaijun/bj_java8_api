package junitTest;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

public class StringTest {
	
	 /**
	 * @Description: staitc String valueOf(char[] cha); 
	 * void 
	 * @version: v1.0.0
	 * @author: bai
	 * @date: 2018年6月24日 下午8:18:23 
	 */
	@Test
	public void test1() {
		
		char[] ch = new char[500];
		for(char i=0;i<500;i++) {
			ch[i] = i;
		}
		String str = String.valueOf(ch);
		System.out.println(str);
	}
	
	 /**
	 * @Description: static String[] split(String reg,int index)    
	 * void 
	 * @version: v1.0.0
	 * @author: bai
	 * @date: 2018年6月24日 下午8:19:55 
	 */
	@Test
	public void test2() {
		String str = "a,b,c,d,e,f,g";
		String[] strs = str.split(",",4);
		objToStr(strs);
	}
	
	 /**
	 * @Description: static String join(String reg,...String str)  
	 * 	 static String join(String reg,Connections con)  
	 * void 
	 * @version: v1.0.0
	 * @author: bai
	 * @date: 2018年6月24日 下午8:21:10 
	 */
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
	 /**
	 * @Description: varrargs 可变长度参数     
	 * 不仅 String ,int 和boolean 或者其他都是可以的
	 * void 
	 * @version: v1.0.0
	 * @author: bai
	 * @date: 2018年6月24日 下午8:23:28 
	 */
	@Test
	public void test4() {
		varargs("hello","tom","!");
	}
	
	public void varargs(String ...str) {
		for(String n :str) {
			System.out.print(n+" ");
		}
	}
	
	
	public void objToStr(Object obj) {
		String str = obj.toString();
			System.out.print(str+" ");	
	}

}
