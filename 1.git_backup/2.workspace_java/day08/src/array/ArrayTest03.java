package array;
//5번 : 배열 사용(저장공간과 값)
public class ArrayTest03 {
   public static void main(String[] args) {
//      int arr = {1, 2, 3, 4};
      //변수는 하나의 자료형과 하나의 값만 저장가능하므로 배열처럼 사용 불가
      
      int[] arData1 = {2, 6, 1, 9};
      System.out.println(arData1); //참조값(배열의 시작 주소값)
      System.out.println("배열의 길이 : " + arData1.length);
      
      System.out.print("[ " + arData1[0] + " ]");
      System.out.print("[ " + arData1[1] + " ]");
      System.out.print("[ " + arData1[2] + " ]");
      System.out.print("[ " + arData1[3] + " ]");
      System.out.println();
      
      for(int i = 0; i < arData1.length; i++) {
         System.out.print("[ " + arData1[i] + " ]");
      }
      System.out.println();
      
      //값 대입 반복문
      int[] arData2 = new int[10];
      System.out.println(arData2);
      //1, 2, 3, 4, 5, 6, 7, 8, 9, 10의 값을 대입
      for(int i = 0; i < arData2.length; i++) {
//         System.out.print(arData2[i] + " ");
         arData2[i] = i + 1;
      }
      //출력 반복문
      for(int i = 0; i < arData2.length; i++) {
         System.out.print(arData2[i] + " ");
      }
      
   }

}