package threadDemo;

public class NewThread implements Runnable{
	
	Thread thread;
	
	public NewThread() {
		thread = new Thread(this,"new thread");
		System.out.println("new thread :"+thread);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("����"+thread.getName()+"��run����");
		for(int i=0;i<5;i++) {
			System.out.println(thread.getName()+":"+i);
			try {
				thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public static void main(String[] args) {
		new NewThread().run();
		Thread t = new Thread();
		
		for(int i=0;i<5;i++) {
			System.out.println(t.getName()+":"+i);
			try {
				t.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
