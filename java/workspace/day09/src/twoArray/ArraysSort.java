package twoArray;

import java.util.Arrays;

//6번 : Arrays.sort()
public class ArraysSort {
   public static void main(String[] args) {
      // 1차원배열
      int[] number = { 5, 2, 6, 3, 1, 8 };

      System.out.println(number);
      System.out.println("1차원 배열의 값 출력 : " + Arrays.toString(number));

      // 2차원배열
      int[][] number2 = { { 5, 2, 6 }, { 3, 1, 8 } };
      System.out.println(number2);
      System.out.println("2차원 배열의 행의 주소값 출력 : " + Arrays.toString(number2));
      System.out.println("2차원 배열의 값 출력 : " + Arrays.deepToString(number2));

      // .sort()
      System.out.println("정렬전 number : " + Arrays.toString(number));
      Arrays.sort(number); // number 배열 오름차순 정렬
      System.out.println("정렬후 number : " + Arrays.toString(number));

      System.out.println("정렬전 number2 : " + Arrays.deepToString(number2));
//      Arrays.sort(number2); 2차원 배열은 정렬되지 않고 오류 발생함
//      2차원 배열의 내부 요소 정렬은 for문이나 수동 정렬이 필요하다
//      for(int i = 0; i < number2.length; i++) {
//         Arrays.sort(number2[i]);
//      }
      for (int[] row : number2) {
         Arrays.sort(row);
      }
      System.out.println("정렬후 number2 : " + Arrays.deepToString(number2));

   }
}
