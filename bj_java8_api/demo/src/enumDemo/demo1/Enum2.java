package enumDemo.demo1;

public enum Enum2 {
	oldMan(50),child(10),name("уехЩ");
	Object obj;
	Enum2(Object obj) {
		this.obj=obj;
	}
	
	Object getObj() {
		return this.obj;
	}
	

}
class Demo{
	public static void main(String[] args) {
		Enum2 e = Enum2.oldMan;
		Enum2 e1 = Enum2.child;
		System.out.println(e.getObj());
		System.out.println(e.ordinal());
		System.out.println(e.compareTo(e1));
	}
}
