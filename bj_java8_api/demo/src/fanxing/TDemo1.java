package fanxing;
/**
 * 
 * @ClassName:  TDemo1   
 * @Description:�н����͵ķ���
 * @author: baijun 
 * @date:   2018��7��9�� ����11:09:22   
 *     
 * @Copyright: 2018
 */
public class TDemo1<T extends Number> {
	T[] number;
	public TDemo1(T[] number) {
		this.number = number;
	}
	public TDemo1() {}
	//ȡƽ��ֵ
	public double getAverage(){
		double num = 0.0;
		for(int i=0;i<number.length;i++) {
			num += number[i].doubleValue();
		}
		
		return num/number.length;
	}
	//�ж�����ֵ�Ƿ����
	/**   
	 * @Title: someAvg   
	 * @author:baijun
	 * @Description: ?ͨ���������  
	 * @date:2018��7��9������11:38:34
	 * @param obj
	 * @return      
	 * boolean      
	 * @throws   
	 */
	public boolean someAvg(TDemo1<?> obj) {
		return getAverage() == obj.getAverage();
	}
	
	/**   
	 * @Title: someAvg2   
	 * @author:baijun
	 * @Description: �н�ͨ���
	 * @date:2018��7��9������11:59:18
	 * @param obj
	 * @return      
	 * boolean      
	 * @throws   
	 */
	public boolean someAvg2(TDemo1<? extends Integer> obj) {
		return getAverage() == obj.getAverage();
	}
	

}
