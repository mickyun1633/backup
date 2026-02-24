package streamApiTest;

import java.util.stream.Stream;

//3번 : 스트림 API
public class StreamTest01 {
   public static void main(String[] args) {
      // 기존 방식(for문)
      int[] numbers = { 1, 2, 3, 4, 5 };

//      for (int i : numbers) {
//         if (i % 2 == 0) {
//            System.out.println(i * 2);
//         }
//      }

      // 스트림 방식(선언적)
//      Stream.of(1, 2, 3, 4, 5).filter(i -> i % 2 == 0).map(i -> i * 2).forEach(System.out::println);
      // 결과 => 4 8
      // 원본 데이터 : 1, 2, 3, 4, 5
      // filter : 짝수만 남기 -> 2, 4
      // map : 2배로 변환 -> 4, 8
      // forEach : 하나씩 출력 -> 4
//                        8
      
      //진짜 하나의 요소씩 처리되는지 확인
      Stream.of(1, 2, 3, 4, 5)
         .filter(n -> { System.out.println("filter : " + n);
                     return n % 2 == 0; })
         .map(n -> { System.out.println("map : " + n );
                     return n * 2;   })
         .forEach(n -> System.out.println("forEach : " + n));
      //1) Stream.of(1, 2, 3, 4, 5)
      //   스트림 생성(데이터 소스), 처리 파이프라인의 시작점
      //   Stream<Integer>
      //2) .filter(n -> n % 2 == 0)
      //   중간연산(Intermedidate) : 조건을 만족하는 요소만 통과
      //   n -> n % 2 == 0 조건함수(Predicate)
      //   n : 입력, true/false : 출력
      //3) .map(Intermediate)
      //   중간연산 : 통과한 요소를 다른 값으로 변환
      //   n -> n * 2      변환함수(Function)
      // n : 입력, n * 2 : 출력
      //4) .forEach(System.out::println)
      //   최종연산(Terminal)
      //   각 스트림의 요소를 소비해서 결과를 만든다
      //   결과를 저장하지 않고 바로 출력
      //   System.out::println   메소드 참조
      //   n -> System.out.println(n)
      
      
   }
}