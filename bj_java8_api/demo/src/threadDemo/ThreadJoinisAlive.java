package threadDemo;

public class ThreadJoinisAlive implements Runnable{

	String name;
	Thread t;
	ThreadJoinisAlive(String threadName){
		this.name = threadName;
		this.t = new Thread(this,name); 
		System.out.println("ThreadJoinisAlive:"+t);
		t.start();
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(name+":"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	

}
