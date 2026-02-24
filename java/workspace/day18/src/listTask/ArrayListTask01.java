package listTask;	//01.23

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTask01 {
   public static void main(String[] args) {
      // 1. String타입의 ArrayList al1 생성
	  // ctrl + shift + o - import
	  ArrayList<String> al1 = new ArrayList();
	  // java, python, c, c++ 추가
	  al1.add("java");
	  al1.add("python");
	  al1.add("c");
	  al1.add("c++");
	  
      // 전체 출력
	  System.out.println("전체 출력 : " + al1);
	  
      // 몇개의 요소가 있는지 출력
	  // .size()
	  System.out.println("요소 개수 : " + al1.size());
	  
      // python 삭제
	  // .remove(index)
	  // python은 index 1번째임
//	  System.out.println("index 1번쨰의 값 " + all.remove(1) + "을 삭제했습니다.");
	  al1.remove("python");
	  System.out.println(al1);
	  
	  // dbms를 추가
	  al1.add("dbms");
	  System.out.println(al1);
	  
      // c를 html으로 수정
//	  all.set(1, "html"); 	// "c를" index 변경 x
	  al1.set(al1.indexOf("c"), "html");
	  System.out.println(al1);
	  
      // c++를 css로 수정
//	  all.set(2, "css");	// "c를" index 변경 x
	  System.out.println(al1.set(al1.indexOf("c++"), "css"));
	  System.out.println(al1);	  
	  
      // javascript 추가
	  System.out.println(al1.add("javacript"));
	  System.out.println(al1);
	  
      // 전체 요소를 순회하며 출력
	  for(String s : al1) {
		  System.out.println(s);
	  }
	  
      // 2. 정수형 리스트 [3, 7, 10, 15, 20, 25] al2생성(ArrayList로 생성)
//    <Integer> List<Integer> java.util.Arrays.asList(Integer... a)
    ArrayList<Integer> al2 = new ArrayList<>(Arrays.asList(3, 7, 10, 15, 20, 25));
    System.out.println(al2);
    // 스트림api를 이용해 짝수만 출력
//    Stream.of(al2).
    al2.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    // al2.stream() : al2 전체를 하나의 객체로 스트림에 넣은 것
    // Stream<ArrayList<Integer>> 이걸로 되는 형태임

    // Stream<Integer> 이렇게 사용하려면 [[3, 7, 10, 15, 20, 25] ]
    // ↑ 이 []가 ArrayList 하나를 의미 그렇기 때문에 filter를 못씀
    // n이 Integer가 아니게 됨
    // 이 형태를 사용하기 위해서는
//    Stream.of(al2.toArray(new Integer[0])) //배열방식
//    Stream.of(3, 7, 10, 15, 20, 25)   //배열방식

    // 10이상만 출력
//    al2.stream().filter(n -> n >= 10).forEach(System.out::println);
    // 20이상의 첫번째 값 찾기
//    System.out.println(al2.stream().filter(n -> n >= 30).findFirst().get() + "나옴");
    al2.stream().filter(n -> n >= 30).findFirst().ifPresent(System.out::println);
    // ifPresent() 값이 있을때만 출력, 값이 없을 때는 출력되지 않음
    // orElse() 기본값 주기
    System.out.println(al2.stream().filter(n -> n >= 30).findFirst().orElse(0) + "기본값");

    // 3. al1을 이용해 진행(스트림으로 생성)
    // 모든 문자열의 길이 출력
    // 길이가 4이상인 것만 list로 만들기
    al1.stream().filter(s -> s.length() >= 4).forEach(System.out::println); // 값으로나옴
    System.out.println(al1.stream().filter(s -> s.length() >= 4).toList()); // 값으로나옴
//    al1.stream().map(String::length).forEach(System.out::println); //길이 수

 }
}

