package lanbdaDemo;

import lanbdaDemo.exzeple.Func;

public class DemoUtil {
	
	public static String reverse(String str) {
		String s = "";
		for(int i=str.length()-1;i>=0;i--) {
			s += str.charAt(i);
		}
		return s;
	}
	
	public  static <T> int conter(T[] nums,Func<T> func,T v) {
		int count = 0;
		for(int i=0;i<nums.length;i++) {
			func.func(nums[i], v);
			count++;
		}
		return count;
	} 

}
