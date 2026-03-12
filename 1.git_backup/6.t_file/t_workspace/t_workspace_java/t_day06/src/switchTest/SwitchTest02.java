package switchTest;

//10번 : switch문에서 사용 가능한 타입
public class SwitchTest02 {
	public static void main(String[] args) {
		// 정수형 (byte, short, int, char) 가능
		// 정수형 long 불가능
		// 실수형 (double, float) 불가능
		// 논리형 boolean 불가능
		// 문자열 String 가능(java 7이상)

		byte bNum = 10;
		short sNum = 20;
		int iNum = 30;
		char cNum = 65;
		double dNum = 5.1;
		float fNum = 5.2f;
//		Cannot switch on a value of type float. 
//		Only convertible int values, strings or enum variables are permitted
		long lNum = 40l; 
		//Cannot switch on a value of type long. switch문은 long타입 값 사용 불가
		//Only convertible int values, strings or enum variables are permitted
		boolean bool = true;
		//Cannot switch on a value of type boolean. 
		//Only convertible int values, strings or enum variables are permitted
		String data = "겨울";

		switch ("봄") {
//		case 10:
//			System.out.println("byte 타입 가능");
//			break;
//		case 20:
//			System.out.println("short 타입 가능");
//			break;
//		case 30:
//			System.out.println("int 타입 가능");
//			break;
//		case 40:
//			System.out.println("long 타입 가능");
//			break;
//		case 65:
//			System.out.println(cNum);
//			System.out.println("char 타입 가능");
//			break;
//		case 5.1:
//			System.out.println("double 타입 가능");
//			break;
//		case 5.2f:
//			System.out.println("float 타입 가능");
//			break;
//		case true:
//			System.out.println("boolean 타입 가능");
//			break;
		case "봄":
			System.out.println("String  타입 가능");
			break;
		case "겨울":
			System.out.println("String 타입 가능2");
			break;
		default:
			System.out.println("위에 case에 맞는 값이 없음");
			break;
		}

	}

}
