package threadDemo;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
		ThreadJoinisAlive obj1 = new ThreadJoinisAlive("one");
		ThreadJoinisAlive obj2 =new ThreadJoinisAlive("two");
		ThreadJoinisAlive obj3 =new ThreadJoinisAlive("three");
		System.out.println("one isAlive ："+obj1.t.isAlive());
		System.out.println("two isAlive ："+obj2.t.isAlive());
		System.out.println("three isAlive ："+obj3.t.isAlive());
		System.out.println("等待线程结束");
		obj1.t.join();
		obj2.t.join();
		obj3.t.join();
		System.out.println("one isAlive ："+obj1.t.isAlive());
		System.out.println("two isAlive ："+obj2.t.isAlive());
		System.out.println("three isAlive ："+obj3.t.isAlive());

	}

}
