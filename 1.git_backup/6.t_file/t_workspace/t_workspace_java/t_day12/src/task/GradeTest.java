package task;

public class GradeTest {
	public static void main(String[] args) {
		//점수 배열 생성
		int[] scores = { 0, 96, 30, 100, 100, 100, 88, 60, 70, 40, 20};
		
		//enum 배열로 반환
		Grade[] grades = GradeUtil.grades(scores);
		
		System.out.println(grades);
		
		//합격자수 출력
		int pass = 0;
		for(Grade g : grades) {
//			System.out.println(g);
			if(g.isPass()) {
				System.out.println(g);
				pass++;
			}
		}
		System.out.println("합격자수 : " + pass);

	}
}
