import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 生产者消费者模型
 *
 */
public class L173使用队列生产者消费者模型 implements Runnable {
	enum DoWhat{
		Read,
		Write;
	}
	DoWhat doWhat;
	/**	 可以保证不会出现重复的数字	 */
	static AtomicInteger seed = new AtomicInteger();
	static LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>();
	public static void main(String[] args) {
		start(DoWhat.Read);
		start(DoWhat.Read);
		start(DoWhat.Write);
		start(DoWhat.Write);
	}

	private static void start(DoWhat dw) {
		L173使用队列生产者消费者模型 t = new L173使用队列生产者消费者模型();
		t.doWhat = dw;
		new Thread(t).start();
	}

	@Override
	public void run() {
		while(true){
			boolean stop = false;
			switch(doWhat){
			case Read:
				stop = read();
				break;
			case Write:
				write();
				break;
			}
			if(stop){
				break;
			}
		}
	}

	private boolean write() {
		queue.add(seed.getAndIncrement());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return true;
		}
		return false;
	}

	private boolean read() {
		try {
			int v = queue.take();
			System.out.println("读到数字："+v);
		} catch (InterruptedException e) {
			e.printStackTrace();
			return true;
		}
		return false;
	}
}
