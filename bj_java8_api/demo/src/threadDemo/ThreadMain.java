package threadDemo;

public class ThreadMain {

	public static void main(String[] args) {
		//��ȡ���߳�
		Thread thread = Thread.currentThread();
		System.out.println(thread);
		//�����߳�����
		thread.setName("���߳�");
		System.out.println(thread);
		//�߳���
		ThreadGroup t = thread.getThreadGroup();
		System.out.println(t);
	
		
		//�̹߳���
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
