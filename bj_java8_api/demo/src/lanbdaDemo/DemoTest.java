package lanbdaDemo;

import org.junit.Test;

import lanbdaDemo.exzeple.Func;
import lanbdaDemo.exzeple.HeightTemp;

/**   
 * @ClassName:  DemoTest   
 * @Description:lambda ���� 
 * @author: baijun 
 * @date:   2018��7��10�� ����9:15:33   
 *     
 * @Copyright: 2018  
 */  
public class DemoTest {
	@Test//��������
	public void test1() {
		Demo demo;
		demo = ()->123;
		System.out.println(demo.getNum());
		demo = () -> Math.random();
		System.out.println(demo.getNum());
		
	}
	//������
	@Test
	public void test2() {
		Demo1 demo;
		//�����ַ�ʽ������
		demo = (name)->"����:"+name;
		//demo = (String name)->"����:"+name;
		System.out.println(demo.getStr("zhangsan"));
	}
	//����������
	@Test
	public void test3() {
		Demo2 demo = (a,b)-> a%b ==0;
		System.out.println(demo.test(10, 2));
	}
	//lamdba �� �׳�
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
	@Test//lanbda �� �ߵ��ַ���
	public void test5() {
		Demo1 demo = (name) ->{
			String str = "";
			for(int i = name.length()-1;i>=0;i--) {
				str += name.charAt(i); 
			}
			return str;
		};
		System.out.println(demo.getStr("�Ϻ�����ˮ���Ժ���"));
		System.out.println(demo.getStr("0123456789"));
	}
	@Test //���ͺ���
	public void test6() {
		Demo3<String> demo = (name) ->{
			
			return "����:"+name;
		};
		System.out.println(demo.getNumAndString("����"));
		Demo3<Integer> demo2 = (num) -> {
			int sum = 0;
			for(int i=0;i<=num;i++) {
				sum += i;
			}
			return sum;
		};
		System.out.println(demo2.getNumAndString(100));
	}
	//lambad ��Ϊ��������
	public String getLambda(Demo1 demo,String str) {
		return demo.getStr(str);
	}
	@Test //��Ϊ��������
	public void test7() {
		String str = getLambda((name)->{
			return "����:"+name;
		}, "����");
		System.out.println(str);
		str = getLambda((name)->"���"+name,"����");
		System.out.println(str);
	}
	//���������� java8 �µı�ʶ�� ::(���÷���)
	@Test
	public void tst8() {
		String str = getLambda(DemoUtil::reverse, "����");
		System.out.println(str);
	}
	//ʵ����������
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
