package wrapperTest;

public class WrapperTest02 {

		public static void main(String[] args) {
		
			
			int num = 20;
			printObj(20);	//Object obj 매개변수에 들어갈 때 20이라는 값이 자동 boxing
			printObj(num);
//			Object obj = Integer.valueOf(20);
			
			
			
			
		}
		static void printObj(Object obj) {
			System.out.println(obj.toString());
			System.out.println(obj.toString() + 10);
			System.out.println(obj);
		}





}
