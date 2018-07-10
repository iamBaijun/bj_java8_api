package fanxing;

public class TDemo2 {
	
	public static <T extends Comparable<T>,V extends T> boolean isIn(T x,V[] y){
		for(int i=0;i<y.length;i++) {
			if(x .equals(y[i])) {
				return true;
			}
		}
		return false;
	}
	


}
