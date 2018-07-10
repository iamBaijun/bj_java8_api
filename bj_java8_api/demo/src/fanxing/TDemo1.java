package fanxing;
/**
 * 
 * @ClassName:  TDemo1   
 * @Description:有界类型的泛型
 * @author: baijun 
 * @date:   2018年7月9日 上午11:09:22   
 *     
 * @Copyright: 2018
 */
public class TDemo1<T extends Number> {
	T[] number;
	public TDemo1(T[] number) {
		this.number = number;
	}
	public TDemo1() {}
	//取平均值
	public double getAverage(){
		double num = 0.0;
		for(int i=0;i<number.length;i++) {
			num += number[i].doubleValue();
		}
		
		return num/number.length;
	}
	//判断两个值是否相等
	/**   
	 * @Title: someAvg   
	 * @author:baijun
	 * @Description: ?通配符的作用  
	 * @date:2018年7月9日上午11:38:34
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
	 * @Description: 有界通配符
	 * @date:2018年7月9日上午11:59:18
	 * @param obj
	 * @return      
	 * boolean      
	 * @throws   
	 */
	public boolean someAvg2(TDemo1<? extends Integer> obj) {
		return getAverage() == obj.getAverage();
	}
	

}
