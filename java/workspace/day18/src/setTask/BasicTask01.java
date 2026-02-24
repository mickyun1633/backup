package setTask;	//01.23

import java.util.Random;

public class BasicTask01 {
   public static void main(String[] args) {

      // 아래 조건을 만족하는 프로그램을 작성하기
      // 1) Random 클래스 이용
      Random r = new Random();
      // 2) 1~45 사이의 숫자 1개 출력
      int num = r.nextInt(45) + 1;
      System.out.println(num);

      // 3) 6개의 숫자를 중복되지 않는 숫자로 배열에 저장(컬렉션 프레임워크 사용 금지)
      int[] numbers = new int[6];
      // 현재 저장된 개수
      int count = 0;
      // 6개가 채워질동안 반복
      while (count < 6) {
         // 난수 생성
         int temp = r.nextInt(45) + 1;
         // 중복 여부 플래그 변수
         boolean isDuplicate = false;

         // 기존 값들과 비교해서 중복검사
         for (int i = 0; i < count; i++) {
            // 이미 들어있는 값이면 중복
            if (numbers[i] == temp) {
               isDuplicate = true;
               break;
            }
         }

         // 중복이 아닐 때만 저장
         if (!isDuplicate) {
            numbers[count] = temp;
            count++;
         }
      }
      for (int i : numbers) {
         System.out.print(i + " ");
      }

      // 4) 버블정렬 오름차순 정렬
      for (int i = 0; i < numbers.length - 1; i++) {
         for (int j = 0; j < numbers.length - 1 - i; j++) {
//            System.out.println("i : " + i + ", j : " + j);
            // 앞 숫자가 더 크면 자리 교환
            if (numbers[j] > numbers[j + 1]) {
               int temp2 = numbers[j];
               numbers[j] = numbers[j + 1];
               numbers[j + 1] = temp2;
            }
         }
      }

   }
}
