package lanbdaDemo;

import org.junit.Test;

import lanbdaDemo.exzeple.Func;
import lanbdaDemo.exzeple.HeightTemp;

/**   
 * @ClassName:  DemoTest   
 * @Description:lambda 测试 
 * @author: baijun 
 * @date:   2018年7月10日 上午9:15:33   
 *     
 * @Copyright: 2018  
 */  
public class DemoTest {
	@Test//不带参数
	public void test1() {
		Demo demo;
		demo = ()->123;
		System.out.println(demo.getNum());
		demo = () -> Math.random();
		System.out.println(demo.getNum());
		
	}
	//带参数
	@Test
	public void test2() {
		Demo1 demo;
		//这两种方式都可以
		demo = (name)->"姓名:"+name;
		//demo = (String name)->"姓名:"+name;
		System.out.println(demo.getStr("zhangsan"));
	}
	//带两个参数
	@Test
	public void test3() {
		Demo2 demo = (a,b)-> a%b ==0;
		System.out.println(demo.test(10, 2));
	}
	//lamdba 块 阶乘
	@Test
	public void test4() {
		Demo demo = ()->{
			int s = 0;
			for(int i=0;i<=100;i++) {
				
				System.out.println(s+" + "+i+ " = "+(s+i));
				s+=i;
			}
			return s;
		};
		System.out.println(demo.getNum());
	}
	@Test//lanbda 块 颠倒字符串
	public void test5() {
		Demo1 demo = (name) ->{
			String str = "";
			for(int i = name.length()-1;i>=0;i--) {
				str += name.charAt(i); 
			}
			return str;
		};
		System.out.println(demo.getStr("上海自来水来自海上"));
		System.out.println(demo.getStr("0123456789"));
	}
	@Test //泛型函数
	public void test6() {
		Demo3<String> demo = (name) ->{
			
			return "姓名:"+name;
		};
		System.out.println(demo.getNumAndString("张三"));
		Demo3<Integer> demo2 = (num) -> {
			int sum = 0;
			for(int i=0;i<=num;i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(demo2.getNumAndString(100));
	}
	//lambad 作为参数传递
	public String getLambda(Demo1 demo,String str) {
		return demo.getStr(str);
	}
	@Test //作为参数传递
	public void test7() {
		String str = getLambda((name)->{
			return "姓名:"+name;
		}, "张三");
		System.out.println(str);
		str = getLambda((name)->"你好"+name,"张三");
		System.out.println(str);
	}
	//方法的引用 java8 新的标识符 ::(引用方法)
	@Test
	public void tst8() {
		String str = getLambda(DemoUtil::reverse, "张三");
		System.out.println(str);
	}
	//实例方法引用
	public <T> int conter(T[] nums,Func<T> func,T v) {
		int count = 0;
		for(int i=0;i<nums.length;i++) 
			if(func.func(nums[i], v))
				count++;
		return count;
	} 
	@Test
	public void test9() {
		int count = 0;
		HeightTemp[] htemps = {
				new HeightTemp(10),
				new HeightTemp(20),
				new HeightTemp(30),
				new HeightTemp(40),
				new HeightTemp(50),
				new HeightTemp(60),
		};
		count = conter(htemps,HeightTemp::sameTemp,new HeightTemp(50));
		System.out.println(count);
		count = conter(htemps,HeightTemp::lessThanTemp,new HeightTemp(6));
		System.out.println(count);
	}

}
