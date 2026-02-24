package forTest;

public class ForTask00 {
   public static void main(String[] args) {
      // 정수 num이 있을 때 아래 규칙을 적용하여 최종 합(sum)을 출력하기
      //
      // - for문 1번만 사용
      // - 숫자 처리 규칙(순서 있음)
      // 7의 배수이면 아무 처리도 하지 않고 다음 반복으로 넘어간다(기타제어문 사용필요)
      // i가 짝수면 i * 3을 합에 더한다
      // i가 홀수면 i를 합에 더한다
      // 합이 150 이상 되는 순간 현재 값을 더한 뒤 반복을 즉시 종료한다(기타제어문 사용필요)
      //   현재 i에 대한 계산을 먼저 하고 그 다음 sum이 150이상인지 검사 -> 그 후 조건 만족시 즉시 반복종료
      // num은 50

      // 변수선언
      int num = 50, sum = 0;

      // for문
      // 초기식 int i = 1
      // 조건식 i <= num
      // 증감식 i++
      for (int i = 1; i <= num; i++) {
         // 7의 배수면 다음 반복으로 넘어감
         if (i % 7 == 0) {
            continue;
         }
         // 짝수/홀수 처리
         if (i % 2 == 0) {
            sum += i * 3;
         } else {
            sum += i;
         }
//         System.out.println(i);
         // 합이 150이상 즉시종료
         if (sum >= 150) {
//            System.out.println(i);
            break;
         }
      }
      System.out.println("최종 합 : " + sum);
   }
}

