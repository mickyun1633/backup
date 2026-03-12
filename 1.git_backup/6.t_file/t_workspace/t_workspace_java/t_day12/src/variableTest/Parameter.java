package variableTest;
//6번 : 매개변수
public class Parameter {
	public static void main(String[] args) {
//		Parameter.printNumber(10); 
		Parameter p = new Parameter();
		p.printNumber(10);
		p.printNumber(10, 20, 30);
	}
	void printNumber(int ... number) {
		//매개변수의 값을 출력
		System.out.println(number); //가변 매개변수 => 참조값(배열의 시작 주소)
		for(int i = 0; i < number.length; i++) {
			System.out.println(number[i]);
		}
		
		for(int num : number) {
			System.out.println(num);
		}
	}
}
