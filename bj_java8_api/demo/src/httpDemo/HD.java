package httpDemo;

public class HD {

	public static void main(String[] args) {
		String str = "abc";
		String s = "def";
		System.out.println(str.codePointAt(2));
		System.out.println((char)str.codePointAt(2));
		System.out.println(str.codePointCount(1, 2));
		System.out.println(s.compareTo(str));


	}

}
