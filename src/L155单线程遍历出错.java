import java.util.LinkedList;
import java.util.List;

public class L155单线程遍历出错 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("10");
		list.add("22");
		list.add("33");
		for(String v : list){
			if("10".equals(v)){
				list.remove(v);
			}
		}
		System.out.println("能正常结束吗？");
	}
}
