import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class L315减少数据库访问 {
	
	public static void main(String[] args) {
		//获取某个班级的学生的详细信息。
		List<Student> list = getStudentsByClassId(1);
		for(Student st : list){
			PersonDetail pd = getPersonDetail(st.id);
			fillToResponse(st,pd);
		}
		//改造办法，使用sql join语句，一次查出所需的信息。
	}

	private static void fillToResponse(Student st, PersonDetail pd) {
		//构造需要的数据信息
	}

	static PersonDetail getPersonDetail(int id) {
		//模拟从数据库查询
		PersonDetail ret = new PersonDetail();
		ret.address = "西三旗";
		ret.tel="10086";
		return ret;
	}

	static List<Student> getStudentsByClassId(int classId){
		//模拟数据库获得某班学生列表
		return Arrays.asList(new Student[]{
				makeStudent(1),
				makeStudent(2),
				makeStudent(3),
		});
		
	}
	static Student makeStudent(int id){
		Student ret = new Student();
		ret.id = id;
		ret.入学时间 =new Date();
		ret.班级id=id%10;
		return ret;
	}
	static class Student{
		int id;
		Date 入学时间;
		int 班级id;
	}
	static class PersonDetail{
		int id;
		String address;//家庭住址
		String tel;//手机号
	}
}
