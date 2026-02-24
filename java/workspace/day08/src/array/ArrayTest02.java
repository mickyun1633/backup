package array;

//4번 : 배열 index
public class ArrayTest02 {
   public static void main(String[] args) {
      // 어떤값을 넣을지 알 때
      int[] ar1 = { 1, 2, 3, 4, 5 };
      System.out.println(ar1);
      // ar1 => stack 메모리에 있는 참조변수(heap메모리에 저장된 배열의 시작주소 => 참조값)

      System.out.println(ar1[0]);
      System.out.println(ar1[1]);
      System.out.println(ar1[2]);
      System.out.println(ar1[3]);
      System.out.println(ar1[4]);
//      System.out.println(ar1[5]); //인덱스 범위를 벗어나기 때문에 오류 발생

      ar1[0] = ar1[0] + 1;
      System.out.println(ar1[0]);
      // 몇 칸 만들지 알 때
      int[] ar2 = new int[10];
      System.out.println(ar2);

//      System.out.println(ar2[0]);
//      System.out.println(ar2[1]);
//      System.out.println(ar2[2]);
//      System.out.println(ar2[3]);
//      System.out.println(ar2[4]);
//      System.out.println(ar2[5]);
//      System.out.println(ar2[6]);
//      System.out.println(ar2[7]);
//      System.out.println(ar2[8]);
//      System.out.println(ar2[9]);

      ar2[0] = 1;
      ar2[1] = 2;
      ar2[2] = 3;
      ar2[3] = 4;
      ar2[4] = 5;
      ar2[5] = 6;
      ar2[6] = 7;
      ar2[7] = 8;
      ar2[8] = 9;
      ar2[9] = 10;

      for (int i = 0; i < 10; i++) {
//         System.out.println(i); //i가 0 ~ 9로 출력되므로 인덱스로 활용한다
         //값대입
         ar2[i] = i + 1;
         //출력
         System.out.print(ar2[i] + "\t");
      }

   }
}
