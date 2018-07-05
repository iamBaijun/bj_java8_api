package enumDemo.demo1;

public class Enum1 {
	
	enum color{red,green,black};
	
	public Enum1() {
		System.out.println(color.red);
	}
	public static void main(String[] args) {
		color c = color.red;
		switch(c) {
		case green:
			System.out.println(color.green);
		case black:
			System.out.println(color.black);
		case red:
			System.out.println(color.red);
		}
		
		System.out.println(c.values()[1]);
		
	}

}
