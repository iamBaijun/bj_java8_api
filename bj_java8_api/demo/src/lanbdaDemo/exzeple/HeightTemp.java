package lanbdaDemo.exzeple;

/**   
 * @ClassName:  heightTemp   
 * @Description:lamdba ʵ����������
 * @author: baijun 
 * @date:   2018��7��10�� ����11:29:55   
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
