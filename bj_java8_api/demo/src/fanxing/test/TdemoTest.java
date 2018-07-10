package fanxing.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import fanxing.TDemo;
import fanxing.TDemo1;
import fanxing.TDemo2;

public class TdemoTest {

	//泛型测试
	@Test
	public void test1() {
		TDemo obj = new TDemo<Integer>(100);
		obj.showType();
		obj = new TDemo<String>("你好");
		obj.showType();
	}
	//有界泛型
	@Test
	public void tet2() {
		Integer nums[] = {1,2,3,4};
		TDemo1<Integer> obj = new TDemo1<Integer>(nums);
		System.out.println("Integer"+obj.getAverage());
		TDemo1<Double> obj1 = new TDemo1<Double>(new Double[] {1.1,2.1,3.1});
		System.out.println("Double"+obj1.getAverage());
//		TDemo1<String> obj2 = new TDemo1<String>(new String[] {"","",""});
//		System.out.println("Double"+obj1.getAverage());
	}
	@Test//通配符
	public void test3() {
		TDemo1<Integer> obj1 = new TDemo1<Integer>(new Integer[] {1,2,3,4});
		System.out.println(obj1.someAvg(new TDemo1<Double>(new Double[] {1.1,2.2,3.1})));
	}
	@Test//有界通配符
	public void test4() {
//		TDemo1<Double> obj1 = new TDemo1<Double>(new Double[] {1.0,2.1,3.1,4.2});
//		System.out.println(obj1.someAvg2(new TDemo1<Double>(new Double[] {1.1,2.2,3.1})));
		TDemo1<Integer> obj1 = new TDemo1<Integer>(new Integer[] {1,2,3,4});
		System.out.println(obj1.someAvg2(new TDemo1<Integer>(new Integer[] {1,2,3})));
	}
	//创建泛型
	@Test
	public void test5() {
		Integer x =5;
		Integer[] y = {1,2,3,4,5,6};
		System.out.println(TDemo2.isIn(x,y));
		Double x1 =5.0;
		Double[] y1 = {1.0,2.0,3.0,4.0,5.0,6.0};
		System.out.println(TDemo2.isIn(x1,y1));
		
	}
	//泛型推断
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test
	public void test6() {
		
		Map<String,Object> map = new HashMap();
		map.put("1", 1);
		System.out.println(map);
	}
}
