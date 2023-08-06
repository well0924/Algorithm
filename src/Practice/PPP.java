package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Practice.Domain.Member;
import Practice.Domain.Student;


public class PPP {
	public static void main(String[] args) {
		  List<String>list = Arrays .asList( "This is a java book",
				  "Lamda Expressions", "Java8 supports lamda expressions");
				  
				  list .stream() .filter(str->str.startsWith("T"))
				  .filter(str->str.toLowerCase().contains("java"))
				  .forEach(str->System.out.println(str));
				
				
				  List<Member>memberList = Arrays
						  .asList( new Member("test1","디자이너",40), new Member("test2","개발자",30), new Member("test4","개발자",26));
				  
				  double age = memberList.stream().mapToInt(Member::getAge).average().getAsDouble();
				  
				  System.out.println("평균 나이::"+age);
				  
				  System.out.println("평균 나이::"+memberList.stream().collect(Collectors.averagingDouble(Member::getAge)));
				  System.out.println("나이 합계::"+memberList.stream().collect(Collectors.summingInt(Member::getAge)));
				  
				  System.out.println("회원 이름만 출력::"+memberList.stream().map(Member::getName).collect(Collectors.toList()).toString());
				  
				  List<Member>result = memberList
						  .stream()
						  .filter(member->member.getJob()=="개발자").toList();
				  
				  result.stream().forEach(member->System.out.println("직업이 개발자인 사람의 이름::"+member.getName()));
				  System.out.println("개발자ㅅ");
				  Map<String,List<Practice.Domain.Member>>jobList = memberList.stream().collect(Collectors.groupingBy(m->m.getJob()));
				  System.out.print("개발자");
				  jobList.get("개발자").forEach(m->System.out.println(m));
				  
				  System.out.print("디자이너");
				  jobList.get("디자이너").forEach(m->System.out.println(m));
				  
				  int[]intArr = {1,2,3,4,5,6};
				  
				  System.out.println("숫자 배열에 2의 배수의 개수::"+Arrays.stream(intArr).filter(n->n%2==0).count());
				  System.out.println(Arrays.stream(intArr).filter(n->n%2==0).sum());
				  System.out.println(Arrays.stream(intArr).filter(n->n%2==0).average().getAsDouble());
				  System.out.println(Arrays.stream(intArr).max().getAsInt());
				  Arrays.stream(intArr).min().ifPresent(a->System.out.println(a));
				  
				  List<Student>studentList = Arrays.asList(new Student("tester1",80,Student.Sex.FEMALE));
				  
				  System.out.println(studentList.stream().mapToInt(Student::getScore).sum());
				  
				  System.out.println(studentList.stream().map(Student::getScore).reduce((a,b)->a+b).get());
				  System.out.println(studentList.stream().map(Student::getScore).reduce(0,(a,b)->a+b));

	}
}
