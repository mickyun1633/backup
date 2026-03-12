package oper;
// 4번 : 비트 연산자를 이용한 암호화와 복호화
public class BitEncryption {
	public static void main(String[] args) {
	
		//XOR 연산으로 진행된다
		// ^
		int originalMsg = 42;
		int key = 99; //비트마스크(암호화, 복호화에 사용)
		System.out.println("원본 메시지 : " + originalMsg);
		
		int encryptMsg = originalMsg ^ key;
		System.out.println("암호화된 메시지 : " + encryptMsg);
		
		int decryptMsg = encryptMsg ^ key;
		System.out.println("복호화된 메시지 : " +decryptMsg);
		
	}
}
