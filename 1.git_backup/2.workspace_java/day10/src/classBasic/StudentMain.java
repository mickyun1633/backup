package classBasic;
//10-2번 : Student 클래스의 객체를 만들 클래스
public class StudentMain {	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		System.out.println(st1); //classBasic.Student@5305068a
		
		Student st2 = new Student();
		System.out.println(st2); //classBasic.Student@1f32e575
		
		System.out.println(st1.name);
		System.out.println(st1.math);
		System.out.println(st1.avg);
		//겍체명.필드
		st1.name = "윤철민";
		System.out.println(st1.name);
		System.out.println(st2.name);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
