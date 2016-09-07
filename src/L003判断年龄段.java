
public class L003判断年龄段 {
	public static void main(String[] args) {
		int 年龄=18;//年龄是一个数字，int表示一个数字,=就是“是”的意思，这句话理解为：年龄是18。
		//如何允许请参考L001
		//请修改 年龄，多次运行试试效果。
		System.out.println("我的年龄是:"+年龄);
		//int 判断值=4;
		if(年龄<3){//请把上面一行前面的斜线（表示注释）去掉，把3改成判断值试试。
			System.out.println("我的年龄小于3岁");
			//请把年龄改成一个小于判断值的数字试试。
		}else{
			System.out.println("我的年龄不小于3岁");
			System.out.println("我的年龄>=3岁");
		}
	}
}
