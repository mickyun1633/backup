package threadMethod;

// 8번 : 동기화 main 메소드
public class TestMain {
	public static void main(String[] args) {
		SynchronizedTest s = new SynchronizedTest();

		Thread t1 = new Thread(s, "쓰테드-1");
		Thread t2 = new Thread(s, "쓰테드-2");
	}
}
