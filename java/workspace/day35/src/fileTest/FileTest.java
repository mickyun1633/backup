package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
   public static void main(String[] args) {
      //상대경로를 사용
      //현재 작업 디렉터리에 test.txt 생성
      File f = new File("test.txt");
      
      try {
         // 파일에 데이터 쓰기
         // 파일이 없으면 생성, 파일이 이미 존재하면 덮어씀
         FileOutputStream fos = new FileOutputStream(f, true);
         
         // 문자 a를 파일에 기록
         // write(int)는 1바이트만 기록
         fos.write('a'); //내부적으로 숫자 97을 1바이트로 기록
         fos.write("abc".getBytes());
         // 스트림 닫기(버퍼 flush + 자원해제)
         fos.close();
         System.out.println("test.txt 파일생성");
         
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
      
      
   }
}















