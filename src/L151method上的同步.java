
public class L151method上的同步 extends L150多线程并发修改异常{
	public static void main(String[] args) {
		L151method上的同步 t = new L151method上的同步();
		t.doTest();
	}
	@Override
	public synchronized void dump() {
		// TODO Auto-generated method stub
		super.dump();
	}
	
	@Override
	public synchronized void addElement(int i) {
		// TODO Auto-generated method stub
		super.addElement(i);
	}
}
