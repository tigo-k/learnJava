import java.util.LinkedList;
import java.util.List;

public class L150多线程并发修改异常 implements Runnable{
	List<String> list = new LinkedList<>();
	public static void main(String[] args) {
		L150多线程并发修改异常 t = new L150多线程并发修改异常();
		t.doTest();
	}

	public void doTest() {
		fillList();
		startModifyThread();
		dump();
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dump();
	}

	public void dump() {
		for(String s:list){
			System.out.println(s);
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private void startModifyThread() {
		new Thread(this).start();
	}

	private void fillList() {
		for(int i=1;i<20;i++){
			list.add("E"+i*10);
		}
	}

	@Override
	public void run() {
		for(int i=0;i<10;i++){
			addElement(i);
			try {
				Thread.sleep(i*i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void addElement(int i) {
		list.add("newElement"+i);
	}
}
