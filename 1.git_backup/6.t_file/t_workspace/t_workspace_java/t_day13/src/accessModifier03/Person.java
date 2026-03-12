package accessModifier03;
//6번 : private 접근제한자
public class Person {
	//필드
	private String name;
	private int age;
	//setter 메소드 : name, age 필드 값을 설정(매개변수)
	//getter 메소드 : name, age 필드 값을 반환(리턴)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
