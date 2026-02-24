package review;
// 0번 : 복습 문제
public class Review { //클래스 중괄호 시작
   public static void main(String[] args) { //main 메소드 중괄호 시작
      //1. 변수를 선언하고 출력메소드를 한번만 사용해서 출력
      //[출력결과]
      //이름은 name 이고 나이는 age살입니다.
      //오늘은 today 수업입니다.
      
      //1) 변수 선언과 동시에 초기화
      //   문자열 name 정수형 age 문자열 today
      String name ="이름";
      int age = 20;
      String today = "5일차";
      //2) 출력메소드, 제어문자
      System.out.println("이름은 " + name + "이고 나이는 "+ age +"입니다.\n오늘은 " + today + " 수업입니다.");
      
      
      
      //2. 상수 선언 후 printf() 사용하여 출력
      //최고기온, 최저기온, 강수확률 상수 선언
      //[출력결과]
      //오늘 서울의 최고 기온은 3도이고 최저기온은 -2도 입니다
      //강수확률은 0%입니다
      
      //1) 상수선언 final 상수명 대문자로 작성 _연결
      final int MAX_TEMP = 3, MIN_TEMP = -2;
      final String RAIN_RATE = "0%";
//      System.out.println(MIN_TEMP);
      //2) 출력 printf    형식지정자 %d %d %s
      System.out.printf("오늘 서울의 최고기온은 %d도이고 최저기온은 %d도입니다.\n"
            + "강수확률은 %s입니다.", MAX_TEMP, MIN_TEMP, RAIN_RATE);
      System.out.println();
      
      //3. 아래 변수를 이용하여 정확한 평균값(실수)를 구하기
      int sum = 7, count = 2;
      //[출력결과]
      //7 / 2 = 값
      
      double avg1 = sum / count; //자동형변환 3.0
      System.out.println(avg1);
      
      double avg2 = (double)(sum/count); //강제형변환이지만 정수의 결과를 강제형변환
      //avg1과 결과 동일
      System.out.println(avg2);
      
      double avg3 = (double)sum/count; //강제형변환
      System.out.println(avg3);
      
      
      //4. 아래 출력결과가 나오도록 코드 작성하기
      int num1 = 10, num2 = 3;
      //[출력결과]
      //3.0
      //3.3333333333333335
      
      //정수 / 정수 => 실수타입의 변수
      //(실수)정수 / 정수 = 실수 / 정수 => 실수타입의 변수
      
      double result1 = num1 / num2;
      double result2 = (double)num1 / num2;
      System.out.println(result1);
      System.out.println(result2);
      

   }
}