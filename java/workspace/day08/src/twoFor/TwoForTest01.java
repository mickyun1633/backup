package twoFor;

//1번 : 이중for문
public class TwoForTest01 {
   public static void main(String[] args) {
//      1   2   3
//      4   5   6

//      int num = 1;                  //5번확인
      for (int i = 0; i < 4; i++) {
//         System.out.println("i : " + i); //1번확인, 2번확인
         for (int j = 0; j < 3; j++) {
//            System.out.println(); //1번확인 
//            System.out.println(j); //2번확인
//            System.out.println(i + " " + j); //3번확인
//            System.out.print(i + " " + j + " \t"); //4번확인
//            System.out.print(num + "\t");   //5번확인
//            num++;                     //5번확인
//            System.out.print((i * 3 + j + 1) + "\t"); // 6번확인
              //4행 3열
              System.out.println(((i * 3 + j + 5) + "\t"));
                          
/* 1    2    3
   4    5    6
   7    8    9
   10   11   12 */

         }
         System.out.println(); // 4번/5번/6번확인
      }
   }
}

/*   	i   j   	계산식           결과
       		행 x 열 개수 + 열번호 + 1
   		0   0   0 * 3 + 0 + 1      1         
   		0   1   0 * 3 + 1 + 1      2
   		0   2   0 * 3 + 2 + 1      3
   		1   0   1 * 3 + 0 + 1      4
   		1   1   1 * 3 + 1 + 1      5
   		1   2   1 * 3 + 2 + 1      6  */


//
//
//1    2   3
//4   5    6
//7   8   9
//10   11   12


