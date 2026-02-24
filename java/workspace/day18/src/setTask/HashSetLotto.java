package setTask;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class HashSetLotto {
   public static void main(String[] args) {

      HashSet<Integer> lottoSet = new HashSet<>();
      Random r = new Random();
      Scanner sc = new Scanner(System.in);

      while (lottoSet.size() < 6) {
         int num = r.nextInt(45) + 1;
         lottoSet.add(num);
      }

      ArrayList<Integer> lotto = new ArrayList<>(lottoSet);

      HashSet<Integer> userSet = new HashSet<>();
      System.out.println("1~45 사이의 숫자 6개 입력하세요 : ");
      while (userSet.size() < 6) {
         int num = sc.nextInt();

         if (num < 1 || num > 45) {
            System.out.println("범위를 초과했습니다 다시 확인하고 입력하세요");
            continue;
         }

         if (!userSet.add(num)) {
            System.out.println("중복값입니다 다시 입력하세요");
         }
      }

      System.out.println("로또 번호 : " + lotto);
      System.out.println("내가 입력한 번호 : " + userSet);
//      System.out.println();

   }
}
