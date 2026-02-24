package threadBasic;
// 2번 : Thread 상속받은 MyThread 객체 생성할 클래스
public class MyThreadTest {
	public static void main(String[] args) {
		// 객체 2개 생성 t1 #, t2 *
		MyThread t1 = new MyThread("#");
		MyThread t2 = new MyThread("*");
		
		// run() 그냥 method 호출, main thread가 실행
		t1.run();
		t2.run();
		
		// start() 새로운 thread 생성, 독립 thread 실행
		// 반드시 start() 호출해야 multi thread		
		t1.start();
		t2.start();
		
		  for (int i = 0; i < 10; i++) {
		         System.out.println(Thread.currentThread().getName());
		         try {
		            Thread.sleep(500);
		         } catch (InterruptedException e) {
		            // TODO Auto-generated catch block
		            e.printStackTrace();
		         }
		      }

		   }
		}
