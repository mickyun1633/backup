package whileTest;
//5번 : while문 활용한 총 합 구하기
public class WhileTest02 {
   public static void main(String[] args) {
      //1부터 100까지 합 구하기(for문 이용)
      //1) 총합구할 변수 선언
      //2) for(초기식   int i = 1;
      //      조건식   i <= 100;
      //      증감식   i++){
      //3)   총합구할변수 += i; }
      //4) 최종 합 출력
      int result1 = 0;
      for(int i = 1; i <= 100; i++) {
         result1 += i;
      }
      System.out.println("최종 합 : " + result1);
      
      //1부터 100까지 합 구하기(while문 이용)
      //1) 비교대상이 될 변수(초기식), 총합구할 변수
      //2) while(조건식 i <= 100){
      //3)   누적합 총합구할변수 += i
      //4)   증감식   i++; }
      //5) 최종합 출력
      int i = 1, result2 = 0;
      while(i <= 100) {
         result2 += i;
         i++;
      }
      System.out.println("총 합 : " + result2);
      
   }
}
