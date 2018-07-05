package threadDemo;

public class ThreadMain {

	public static void main(String[] args) {
		//获取主线程
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		//更改线程名称
		thread.setName("主线程");
		System.out.println(thread);
		//线程组
		ThreadGroup t = thread.getThreadGroup();
		System.out.println(t);
	
		
		//线程挂起
		for(int i=0;i<5;i++) {
			System.out.println(i);
			try {
				
				thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}

	}

}
