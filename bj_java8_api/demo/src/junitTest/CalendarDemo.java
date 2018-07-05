package junitTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.Test;

public class CalendarDemo {

	@Test
	public void test1() {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH, 1);// ����Ϊ1��,��ǰ���ڼ�Ϊ���µ�һ��
		System.out.println(c.getTime());
		String first = format.format(c.getTime());
		System.out.println("===============first:" + first);
	}

}
