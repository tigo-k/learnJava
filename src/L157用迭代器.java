import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class L157用迭代器 {
	public static void main(String[] args) {
		List<String> list = new LinkedList<>();
		list.add("10");
		list.add("22");
		list.add("33");
		Iterator<String> it = list.iterator();
		//for(String v : list){
		while(it.hasNext()){
			String v = it.next();
			if("10".equals(v)){
				//list.remove(v);
				it.remove();
			}
		}
		System.out.println("能正常结束吗？");
	}
}
