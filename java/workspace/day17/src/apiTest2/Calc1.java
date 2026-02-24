package apiTest2;
/**
 * @author    koreait-G
 * @since    jdk17
 * <br>
 * <p> Calc1 클래스는 나눗셈 계산을 할 수 있는 클래스입니다</p>
 */
public class Calc1 {
   
   /**
    * 
    * @param num1 : 나눠지는 정수
    * @param num2 : 나누는 정수
    * @return 나눗셈 결과 정수(몫)
    * @throws ArithmeticException
    * @see   보통 부모클래스를 사용한다
    * @see Math
    * <br>
    * <p> 두 정수를 나눗셈 후 몫을 반환한다 </p>
    * 
    */
   public int divide(int num1, int num2) throws ArithmeticException {
      return num1 / num2;
   }
   
}
