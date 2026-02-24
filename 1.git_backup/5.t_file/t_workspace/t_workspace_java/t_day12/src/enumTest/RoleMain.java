package enumTest;
//12번 : enum사용
public class RoleMain {
	enum Role{
		ADMIN("관리자"),
		USER("일반사용자"),
		SELLER("판매자");
		
		//필드
		String description;

		//생성자
		private Role(String description) {
			this.description = description;
		}
		
		//메소드
		String getDescription() {
			return this.description;
		}
	}
	
	public static void main(String[] args) {
		Role r = Role.ADMIN;
		
		System.out.println(r.getDescription());
	}
}
