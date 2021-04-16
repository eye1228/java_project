package Test;

public class ThreadTest implements Runnable{

	int x = 0;
	@Override
	public synchronized void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + (++x));
			if(x == 50 || x == 100) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else if(x == 51 || x == 101){
				notify();
			}
		}
	}

}
