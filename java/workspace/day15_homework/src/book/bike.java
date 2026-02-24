package book;

abstract class Bike {
		int wheel;
		
		Bike(int wheel) {
			this.wheel = wheel;
			
		}
		
		void info() {
			System.out.println("이 자건거는" + wheel + "발 자전거 입니다");
			
		}
}
		
class ChildBike extends Bike {
	ChildBike(int wheel) {
		super(wheel);
		abstract int getWheel();
	}
}
class PRACTICE_12_02{
	public static void main(String[] args) {
		
		ChildBike cb = new ChildBike(4);
		cb.info();
	
				
	

	}
}