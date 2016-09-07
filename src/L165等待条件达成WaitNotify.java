
public class L165等待条件达成WaitNotify implements Runnable{
	Object lock = new Object();
	int value = 1;
	public static void main(String[] args) {
		L165等待条件达成WaitNotify t = new L165等待条件达成WaitNotify();
		t.doTest();
	}
	private void doTest() {
		new Thread(this).start();
		read();
	}
	void read(){
		int v = 0;
		System.out.println("开始检查");
		synchronized (lock) {
			while(value != 2){
				try {
					System.out.println("条件不成立，等待。");
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			v = value;
			System.out.println("条件达成:"+v);
		}
		System.out.println("测试结束:"+v);
	}
	void write(){
		System.out.println("写操作开始。");
		synchronized (lock) {
			value = 2;
			System.out.println("写好了。");
			lock.notify();
		}
		System.out.println("写操作结束。");
	}
	@Override
	public void run() {
		try {
			write();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
/*
开始检查
条件不成立，等待。
写操作开始。
写好了。
写操作结束。
条件达成:2
测试结束:2
----
开始检查
写操作开始。			//开始检查后，写线程也启动了，这时锁被堵线程先抢到。
条件不成立，等待。
写好了。
写操作结束。
条件达成:2
测试结束:2
 * 
 * 
 * 
 */
