package enumTest;

//11번 : 필드와 생성자를 가진 enum(상태코드)
public class StatusMain {
	enum Status {
		SUCCESS(200), FAIL(500);

		// 필드
		int code;

		// 생성자
		private Status(int code) {
			this.code = code;
		}

		// 메소드
		int getCode() {
			return this.code;
		}

	}

	public static void main(String[] args) {
		Status status = Status.SUCCESS;

		System.out.println(status);
		System.out.println(status.getCode());
	}
}
