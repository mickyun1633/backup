package inheritance01;
//1번 : this, this(), super, super()
public class Main {
	public static void main(String[] args) {
		
		System.out.println("---Person 기본 생성자---");
		Person p1 = new Person();
		
		System.out.println("---Person 매개변수 생성자---");
		Person p2 = new Person("홍길동", 20);
		
		System.out.println("\n---Student 기본 생성자---");
		Student st1 = new Student();
		
		System.out.println("\n---Student 매개변수 생성자---");
		Student st2 = new Student("짱구", 5, "학생");
		
	}
}
