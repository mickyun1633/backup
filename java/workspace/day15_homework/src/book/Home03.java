package book;

public class Home03 {
	public static void main(String[] args) {
		int score = 77;
		char result = 'A';
		
		if(score >= 60) {
			result = 'D';
		} else if(score >= 70) {
			result = 'c';
			
		}
		System.out.println(score + "점의 학점은 " + result + "입니다");
	}
}
