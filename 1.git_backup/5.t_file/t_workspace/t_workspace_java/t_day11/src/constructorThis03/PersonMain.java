package constructorThis03;
//5번 : this() 자기자신의 생성자 호출
public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동");
		Person p3 = new Person("짱구", 5);
		Person p4 = new Person("유리", "학생");
		Person p5 = new Person("맹구", 5, "유치원생");
		
		System.out.println(p1);
		p1.printInfo();
		System.out.println(p2);
		p2.printInfo();
		System.out.println(p3);
		p3.printInfo();
		System.out.println(p4);
		p4.printInfo();
		System.out.println(p5);
		p5.printInfo();

	}
}
