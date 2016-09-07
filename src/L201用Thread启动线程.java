
//一个类只能继承一个父类，这是此方法的局限。
public class L201用Thread启动线程 extends Thread {
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

	public L201用Thread启动线程(String name) {
		super();
		this.name = name;
	}

	public static void main(String[] args) {
		L201用Thread启动线程 mt1 = new L201用Thread启动线程("运动员张三");
		L201用Thread启动线程 mt2 = new L201用Thread启动线程("运动会李四");
		mt1.start();
		mt2.start();
	}
}
