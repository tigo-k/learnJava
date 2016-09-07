//Runnable可以交给线程池去执行。
public class L202用Runnable做多线程 implements Runnable{
	private String name;

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(this.name + "跑到了 " + i);
			try {
				Thread.sleep(i*100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public L202用Runnable做多线程(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		L202用Runnable做多线程 mt1 = new L202用Runnable做多线程("运动员张三");
		L202用Runnable做多线程 mt2 = new L202用Runnable做多线程("运动会李四");
		new Thread(mt1).start();  
		new Thread(mt2).start(); 
	}
}
