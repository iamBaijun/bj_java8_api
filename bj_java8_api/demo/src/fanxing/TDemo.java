package fanxing;

public class TDemo<T> {

	T obj ;
	public TDemo(T obj) {
		this.obj = obj;
	}
	public TDemo() {
		
	}
	public void showType() {
		System.out.println("¿‡–Õ:"+obj.getClass().getName());
		System.out.println(obj);
	}
}
