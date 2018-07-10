package lanbdaDemo.exzeple;

/**   
 * @ClassName:  heightTemp   
 * @Description:lamdba 实例方法引用
 * @author: baijun 
 * @date:   2018年7月10日 上午11:29:55   
 *     
 * @Copyright: 2018  
 */  
public class HeightTemp {
	
	int htemp;
	
	public HeightTemp(int h) {
		this.htemp = h;
	}
	
	public boolean sameTemp(HeightTemp h2) {
		return this.htemp == h2.htemp;
	}
	
	public boolean lessThanTemp(HeightTemp h2) {
		return this.htemp < h2.htemp;
	}
	
	

}
