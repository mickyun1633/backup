package com.koreait.model;

public class UserDTO {
	//객체 지향적으로 사용자 정보를 하나로 묶기 위함
	//UserDTO는 데이터만 가지고 있는 역할
	//계층간 전달을 위해(Controller -> DAO 등)
	
	//필드 : 이름, 나이, 아이디, 비밀번호 데이터만 보관
	private String name;
	private int age;
	private String id;
	private String pw;
	
	//게터세터 단축키 : alt + shift + s , r
	//전체 선택 : alt + a, generate : alt + r
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	//toString 오버라이딩
	//alt + shift + s , s 
	//선택 : alt + g
	@Override
	public String toString() {
		return "UserDTO [name=" + name + ", age=" + age + ", id=" + id + ", pw=" + pw + "]";
	}

}

