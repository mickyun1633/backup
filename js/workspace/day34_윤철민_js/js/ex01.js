/*  [요구사항]
이름과 나이를 입력하는 폼을 만든다
버튼을 누르면 JS 객체로 만든다
그 객체를 JSON 문자열로 변환해서 화면에 출력한다
다시 JSON.parse()로 복원해서 카드 형태로 화면에 출력한다 
 
[구현조건]
addEventListener 사용
객체 생성
JSON.stringify()
JSON.parse()
innerHTML 사용 */


// 1. 버튼을 누르면 JS 객체로 만든다

  //  1) 버튼 가져오기
  const btn = document.getElementById("btn");

  //  2) 버튼 클릭 이벤트, addEventListener 사용
  btn.addEventListener("click", function () {
  //  3) 입력값
  const name = document.getElementById("name").value;
  const age = document.getElementById("age").value;

  //  4) 객체 생성
  const person = {
    name: name,
    age: age
  };
  
// 2. 그 객체를 JSON 문자열로 변환해서 화면에 출력

  //  1) JSON.stringify(), 객체 -> JSON 문자열 변환
  const jsonString = JSON.stringify(person);

  //  2) innerHTML 사용
  document.getElementById("json").innerHTML = jsonString;

  //  3) JSON.parse(), JSON 문자열 -> 객체로 변환
  const parsedPerson = JSON.parse(jsonString);

  //  4) 카드 형태로 화면에 출력
  // console.log(
  //   "이름 : " + parsedPerson.name + "\n" +
  //   "나이 : " + parsedPerson.age
  // );

  document.getElementById("card").innerHTML =
    "<p>이름: " + parsedPerson.name + "</p>" +
    "<p>나이: " + parsedPerson.age + "</p>"
});
