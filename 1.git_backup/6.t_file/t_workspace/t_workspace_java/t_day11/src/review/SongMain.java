package review;

class Song {
	// 필드
	String title;
	String artist;
	String album;

	// 메소드
	// 정보 출력 메소드(매개변수 x, 리턴값 x)
	void displayInfo() {
		System.out.println("노래 제목 : " + title);
		System.out.println("가수명 : " + artist);
		System.out.println("앨범발매일 : " + album);
	}

}

public class SongMain {
	public static void main(String[] args) {
		// 객체화(인스턴스화)
		Song song = new Song();
		System.out.println(song); // review.Song@5305068a

		// 객체명.필드명 = 값
		song.title = "Good Goodbye";
		song.artist = "화사";
		song.album = "2025년 10월 15일";

		System.out.println(song.title);
		// 메소드 호출
		// 매개변수 x 리턴값 x => 객체명.메소드명()
		song.displayInfo();

	}
}
