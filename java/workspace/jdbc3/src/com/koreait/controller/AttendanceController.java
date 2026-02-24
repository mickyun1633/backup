package com.koreait.controller;

import java.util.List;

import com.koreait.dao.AttendanceDAO;
import com.koreait.dao.StudentDAO;
import com.koreait.dto.AttendanceDTO;
import com.koreait.dto.StudentDTO;
import com.koreait.view.AttendanceView;

/*
 * Controller 역활
 * 
 * - 프로그램 흐름(메뉴 반복)담당
 * - view 에서 입력받고 DAO 호출해서 DB 처리
 * - 결과를 다시 view 로 출력
 * 
 */
public class AttendanceController {

	private AttendanceView view = new AttendanceView();
	private StudentDAO stuDAO = new StudentDAO();
	private AttendanceDAO attDAO = new AttendanceDAO();

	// 프로그램 시작 메소드
	public void run() {

		while (true) {
			int menu = view.menu();

			switch (menu) {
			case 1:
				insertStudent();
				break;
			case 2:
				selectStudent();
				break;
			case 3:
				insertAttendance();
				break;
			case 4:
				selectJoin();
				break;
			case 0:
				view.msg("프로그램 종료");
				break;
			default:
				view.msg("잘못입력했습니다");
				break;
			}
		}

	}

	// 학생등록
	private void insertStudent() {
		StudentDTO dto = view.inputStu();
		boolean result = stuDAO.stuInsert(dto);
		if (result) {
			view.msg("학생 등록 성공");
		} else {
			view.msg("학생 등록 실패");
		}

	}

	// 학생조회
	private void selectStudent() {
		List<StudentDTO> list = stuDAO.selectAll();
		view.printStuInfo(list);
	}

	// 출결등록
	private void insertAttendance() {
		AttendanceDTO dto = view.inputAtt();
		// FK 체크
		if (stuDAO.stuExists(dto.getAttNumber())) {
			view.msg("없는 학번입니다");
			return;
		}
		boolean result = attDAO.atInsert(dto);
		if (result) {
			view.msg("출결 등록 성공");
		} else {
			view.msg("출결 등록 실패");
		}

	}

	// 출결 조회
	private void selectJoin() {
		List<String> list = attDAO.selectJoin();
		view.printJoin(list);

	}

}
