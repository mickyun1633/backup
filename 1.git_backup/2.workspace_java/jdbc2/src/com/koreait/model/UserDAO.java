package com.koreait.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//사용자 데이터를 메모리에 저장하고 조회하는 기능
//List<UserDTO>를 사용하여 정보를 저장

//UserDAO 클래스는 메모리에 사용자 정보를 저장하고 회원가입/로그인 시 조회
public class UserDAO {
	// ArrayList 객체 userList 생성
	private List<UserDTO> userList = new ArrayList<>();
	private Scanner sc = new Scanner(System.in);

	// 회원가입 메소드
	public List<UserDTO> join(UserDTO userDTO) {
		System.out.println("아이디입력 : ");
		userDTO.setId(sc.nextLine());
		for (UserDTO u : userList) {
			if (u.getId().equals(userDTO.getId())) {
				return userList; // 리스트에 저장된 아이디와 지금 회원가입하려는 아이디가 같다 => 중복된 아이디를 의미
			}
		}
		System.out.println("비밀번호 입력 : ");
		userDTO.setPw(sc.nextLine());
		System.out.println("이름 입력 : ");
		userDTO.setName(sc.nextLine());
		System.out.println("나이 입력 : ");
		userDTO.setAge(sc.nextInt());
		sc.nextLine();
		userList.add(userDTO);
		return userList; // 성공
	}

	// ========== 로그인 메소드 ==========
		// login() 메소드 
//		public UserDTO login() {
//			// 아이디 입력 메시지 출력 
//			System.out.println("아이디 입력 : ");
//			// String id nextLine로 입력받기 
//			String id = sc.nextLine();
//			// 비밀번호 입력 메시지 출력 
//			System.out.println("비밀번호 입력 : ");
//			// String pw nextLine로 입력받기 
//			String pw = sc.nextLine();
//			// userList 회원들 조회 
//			for(UserDTO u : userList) {
//				// 문자열 비교 => equals(), && => 둘 다 true 실행 
//				if (u.getId().equals(id) && u.getPw().equals(pw)) {
//					// 로그인 성공 메시지 출력 
//					System.out.println("로그인 성공!!!");
//					// 리턴값 u 
//					return u;
//					
//				}
//			}
//			// 아이디, 비밀번호 틀렸을시 메시지 출력 
//			System.out.println("아이디, 비밀번호가 틀렸습니다.");
//			// 리턴값 null 
//			return null;	
//		}
	// ========== 로그인 메소드(수업 코드) ==========
	public boolean login(String id, String pw) {
		for(UserDTO u : userList) {
			if(u.getClass().equals(id) && u.getPw().equals(pw)) {
				return true;
			}
		}
		return false;
	}
	
	   public boolean loginStream(String id, String pw) {
		      return userList.stream().anyMatch(u -> u.getId().equals(id) && u.getPw().equals(pw));
		      //stream() : 리스트를 스트림으로 변환
		      //anyMatch() : 조건 만족하는게 하나라도 있으면 true
		   }
	

		// ========== 아이디 중복확인 메소드 ==========
//		// idCheck (String id) 메소드 
//		// boolean => 아이디 존재여부에 따라 true, false 
//		public boolean idCheck (String id) {
//			// userList 회원들 조회 
//			for (UserDTO u : userList) {
//				// 문자열 비교 => equals() 
//				if (u.getId().equals(id)) {
//					// 같은 아이디 있을시 true 
//					return true;
//				}
//			}
//			// 같은 아이디 없을시 false 
//			return false;
		
		// ========== 아이디 중복확인 메소드(수업코드) ==========
	   public boolean checkIdStream(String id) {
		      return userList.stream().anyMatch(u -> u.getId().equals(id));
		   }
	   
	   
	   
		// ========== 비밀번호 찾기 메소드(기존비밀번호 일치 시에만 새로운 비밀번호로 변경되도록) ========== 
//		// chasngPassWor() 메소드 
//		public void changPassWord() {
//			// 아이디 입력 메시지 출력 
//			System.out.println("아이디 입력 : ");
//			// String id nextLine로 입력받기
//			String id = sc.nextLine();
//			// 현재 비밀번호 입력 메시지 출력 
//			System.out.println("현재 비밀번호 입력 : ");
//			// String pw nextLine로 입력받기 
//			String pw = sc.nextLine();
//			// userList 회원들 조회 
//			for (UserDTO u : userList) {
//				// 문자열 비교 => equals(), && => 둘 다 true 실행  
//				if (u.getId().equals(id) && u.getPw().equals(pw)) {
//					// 변경할 비밀번호 입력 메시지 출력 
//					System.out.println("변경할 비밀번호 입력 : ");
//					// 변경할 비밀번호 입력 받기 
//					u.setPw(sc.nextLine());
//					// 새로운 비밀번호 변경 메시지 출력 
//					System.out.println("새로운 비밀번호 변경 완료!!!");
//					// 메소드 종료 
//					return;
//				}
//			}
//			// 아이디, 비밀번호 일치하지 않는 메시지 출력 
//			System.out.println("아이디, 비밀번호가 일치하지 않습니다.");
//		
//		}
		// ========== 비밀번호 찾기 메소드 ((수업코드)(기존비밀번호 일치 시에만 새로운 비밀번호로 변경되도록)) ========== 
		public boolean changePwStream(String id, String oriPw, String newPw) {
			return userList.stream()
					.filter(u -> u.getId().equals(id) && u.getPw().equals(oriPw))
					.findFirst()	// 조건에 맞는 첫번째 유저 찾기
					.map(u -> {		// 있으면 비밀번호 변경하고 true 반환
						u.setPw(newPw);
						return true;
					})
					.orElse(false);	// 없으면 false 반환
		}
		
		
		
		// ========== 회원 1명 조회 메소드 ========== 
//		// viewOne() 메소드 
//		public UserDTO viewOne() {
//			// 조회할 아이디 입력 메시지 출력 
//			System.out.println("조회할 아이디 입력 : ");
//			// String id nextLine로 입력받기
//			String id = sc.nextLine();
//			// userList 회원들 조회
//			for (UserDTO u : userList) {
//				// 문자열 비교 => equals()
//				if (u.getId().equals(id)) {
//					// 리턴값 u 		
//					return u;
//				}
//			}
//			// 존재하지 않는 회원 메시지 출력 
//			System.out.println("존재하지 않는 회원입니다.");
//			// 조회 실패시 null 
//			return null;
//		}
		// ========== 회원 1명 조회 메소드(수업코드) ========== 
		public UserDTO findUserStream(String id) {
			   return userList.stream().filter(u -> u.getId().equals(id)).findFirst().orElse(null);
			   }
		
		
		
		// ========== 모든 회원 조회 메소드 ========== 
		// viewAll() 메소드 
//		public List<UserDTO> viewAll() {
//			// 리턴값 userList
//			return userList;
//		}
		// ========== 모든 회원 조회 메소드 (수업코드) ========== 
		public List<UserDTO> findAll() {
			 	return userList;
			   }
		
		
		
		// ========== 회원 탈퇴 메소드((수업코드)(아이디, 비밀번호, 이름 일치시에만 삭제 되도록)) ========== 
		  public boolean deleteUser(String id, String pw, String name) {
		      for (int i = 0; i < userList.size(); i++) {
		         UserDTO u = userList.get(i);
		         if (u.getId().equals(id) && u.getPw().equals(pw) && u.getName().equals(name)) {
		            userList.remove(i);
		            return true;
		         }
		      }
		      return false;
		   }

		   public boolean deleteUserStream(String id, String pw, String name) {
		      return userList.removeIf(u -> u.getId().equals(id) && u.getPw().equals(pw) && u.getName().equals(name));
		      // removeIf : 조건에 맞는 회원이 있으면 삭제하고 true, 없으면 false 리턴

		   }

		}


	

