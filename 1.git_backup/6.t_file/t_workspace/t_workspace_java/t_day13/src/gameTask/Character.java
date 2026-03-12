//package gameTask;
//4번 : 상속구조 실습
//public class Character {
//	// 필드
//	String name;
//	int hp, mp;
//	int maxHp, maxMp;
//	int nomalDmg, skillDmg, specialDmg;
//
//	// 생성자
//	public Character(String name, int maxHp, int maxMp, int nomalDmg, int skillDmg, int specialDmg) {
//		this.name = name;
//		this.maxHp = maxHp;
//		this.maxMp = maxMp;
//		this.hp = maxHp;
//		this.mp = maxMp;
//		this.nomalDmg = nomalDmg;
//		this.skillDmg = skillDmg;
//		this.specialDmg = specialDmg;
//		showStatus();
//	}
//
//	// 메소드
//	// 현재 캐릭터의 HP와 MP 상태를 출력하는 메소드
//	public void showStatus() {
//		System.out.println("--- 현재 상태 ---");
//		System.out.println("Hp : " + hp + "/" + maxHp);
//		System.out.println("Mp : " + mp + "/" + maxMp);
//	}
//
//	// 기본 공격을 수행하는 메소드
//	// 피해량은 nomalDmg 만큼이며, 마나는 소모되지 않음
//	public void normalAttack() {
//		
//	}
//
//	// 스킬 공격을 수행하는 메소드
//	// 피해량은 skillDmg이며, mp를 10 소모
//	public void skillAttack() {
//
//	}
//
//	// 특수 공격을 수행하는 메소드 (기본 클래스에는 동작 없음)
//	// 자식 클래스에서 오버라이딩해서 각각의 특수공격을 정의해야 함
//	public void specialAttack() {
//
//	}
//
//	// 마나(mp)가 필요한 만큼 충분한지 확인하는 메소드
//	// mp가 필요량 이상이면 true, 부족하면 false 반환
//	public boolean checkMp(int needMp) {
//
//	}
//
//	// 체력이 0 이하가 되면 자동으로 부활시키는 메소드
//	// hp와 mp를 최대값으로 회복하고 상태 출력
//	public void revive() {
//		// 추가코드작성
//		showStatus();
//
//	}
//}
