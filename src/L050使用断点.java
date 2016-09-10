
public class L050 π”√∂œµ„ {
	public static void main(String[] args) {
		Bean test = new Bean();
		test.a = 1;
		test.b = 2;
//		System.out.println("pre hash is "+test.hashCode());
		doAdd(test);
		System.out.println(test.c);
	}
	static void doAdd(Bean b){
		b = new Bean();
		b.c = b.a+b.b;
//		System.out.println("used hash is "+b.hashCode());
	}
	static class Bean{
		int a;
		int b;
		int c;
	}
}
