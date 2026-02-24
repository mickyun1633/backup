package com.koreait.view;

import java.util.List;
import java.util.Scanner;

import com.koreait.dto.AttendanceDTO;
import com.koreait.dto.StudentDTO;

/*
 * view 역할
 * 사용자 입력 / 화면 출력
 * 
 * - View 는 절대 SQL을 몰라야한다
 * - View 는 DBConnector, DAO를 직접 쓰지 않는다
 * - View 는 오로지 입력/출력만 담당한다
 * 
 * */

public class AttendanceView {

   private Scanner sc = new Scanner(System.in);

   // 메뉴출력 메소드
   // 1. 학생등록
   // 2. 학생조회
   // 3. 출력등록
   // 4. 출결조회
   // 0. 종료
   public int menu() {
      System.out.println("----출결관리----");
      System.out.println("1. 학생등록");
      System.out.println("2. 학생조회");
      System.out.println("3. 출력등록");
      System.out.println("4. 출력조회");
      System.out.println("0. 종료");
      System.out.println("선택 : ");
      int choice = sc.nextInt();
      sc.nextLine();
      return choice;
   }

   // 학생 등록 입력받는 메소드
   // 이름, 전공 입력받고
   // 반환타입 StudentDTO
   // DTO에 담아서 Controller로 반환
   public StudentDTO inputStu() {
      StudentDTO stuDTO = new StudentDTO();

      System.out.println("이름입력 : ");
      stuDTO.setStuName(sc.nextLine());

      System.out.println("전공입력 : ");
      stuDTO.setStuMajor(sc.nextLine());

      return stuDTO;
   }

   // 출결 등록 입력받는 메소드
   // 학번은 숫자, 날짜는 YYYY-MM-DD 형태로 입력
   // 학번, 날짜, 상태 입력받고
   // 반환타입 AttendanceDTO
   public AttendanceDTO inputAtt() {
      AttendanceDTO attDTO = new AttendanceDTO();
      System.out.println("학번 입력 : ");
      attDTO.setStuNumber(sc.nextInt());
      sc.nextLine();

      System.out.println("날짜(YYYY-MM-DD) 입력 : ");
      attDTO.setAttAdate(sc.nextLine());

      System.out.println("상태입력 : ");
      attDTO.setAttStatus(sc.nextLine());
      return attDTO;
   }

   // 학생리스트 출력
   // 학번, 이름, 전공
   // 반환타입 void
   public void printStuInfo(List<StudentDTO> list) {
      if (list.isEmpty()) {
         System.out.println("학생 데이터 없음");
         return; // 메소드 종료
      }
      for (StudentDTO s : list) {
         System.out.println(s.getStuNumber() + " , " + s.getStuName() + " , " + s.getStuMajor());
      }
   }

   // join 결과 출력
   // DAO에서 List<String>으로 받아온 데이터 그대로 출력
   public void printJoin(List<String> list) {
      if (list.isEmpty()) {
         System.out.println("출결 데이터 없음");
         return;
      }

      for (String row : list) {
         System.out.println(row);
      }
   }

   // 메시지 출력 메소드
   public void msg(String msg) {
      System.out.println(msg);
   }

}
