package setTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicTask03 {

   public static void main(String[] args) {

      // =====================================
      // Stream API 실습 - 미니 로또
      // =====================================

      // [문제 1]
      // Random 객체를 생성하시오.
      // 힌트 : new Random()
      Random r = new Random();
      Scanner sc = new Scanner(System.in);


      // -------------------------------------

      // [문제 2]
      // Stream을 이용해서
      // 1~45 사이의 숫자 6개를
      // 중복 없이 생성하여
      // List<Integer> lotto에 저장하시오.
      //
      // 힌트
      // - IntStream.generate()
      // - distinct()
      // - limit()
      // - boxed()
      // - collect()
      List<Integer> lotto = IntStream.generate(() -> r.nextInt(45) + 1)
               .distinct()
               .limit(6)
               .boxed().collect(Collectors.toList());
      System.out.println(lotto);



      // -------------------------------------

      // [문제 3]
      // Scanner를 이용해서
      // 사용자로부터 1~45 사이 숫자 6개를 입력받아
      // List<Integer> user에 저장하시오.
      //
      // 조건
      // 1) 범위를 벗어나면 다시 입력
      // 2) 중복되면 다시 입력
      //
      // 힌트
      // - while문 사용 가능
      // - contains()
      ArrayList<Integer> user = new ArrayList<>();
      System.out.println("1 ~ 45사이의 숫자 6개 입력 : ");

      while (user.size() < 6) {
         int num = sc.nextInt();

         if (num < 1 || num > 45) {
            System.out.println("범위 초과! 다시 입력");
            continue;
         }
         if (user.contains(num)) {
            System.out.println("중복! 다시 입력!!");
            continue;
         }
         user.add(num);

      }


      // -------------------------------------

      // [문제 4]
      // Stream을 이용해서
      // lotto와 user의 일치 개수를 구하시오.
      //
      // 결과를 long count 변수에 저장하시오.
      //
      // 힌트
      // - stream()
      // - filter()
      // - count()
      long count = user.stream().filter(lotto::contains).count();

      // -------------------------------------

      // [문제 5]
      // Stream을 이용해서
      // lotto 리스트를 오름차순 정렬하여
      // sortedLotto에 저장하시오.
      //
      // 힌트
      // - sorted()
      // - collect()
      List<Integer> lotto1 = lotto.stream().sorted().collect(Collectors.toList());


      // -------------------------------------

      // [문제 6]
      // user 리스트도 오름차순으로 정렬하여
      // sortedUser에 저장하시오.



      // -------------------------------------

      // [문제 7]
      // 아래 형식에 맞게 결과를 출력하시오.
      //
      // 출력 예시
      // 로또 번호 : [1, 5, 12, 23, 34, 41]
      // 내 번호 : [3, 5, 12, 20, 30, 41]
      // 일치 개수 : 3개
      //
      // 힌트
      // - System.out.println()

   }
}
