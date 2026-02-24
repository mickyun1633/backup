  /*  [요구사항]
  할 일을 입력하고 추가 버튼을 누르면 목록에 추가한다
  삭제 버튼 클릭 시 해당 항목 제거한다
  현재 todo 배열을 JSON 문자열로 화면에 출력한다
  완료 체크 시 스타일 변경한다

  [구현 조건] 
  todos 배열 사용
  render() 함수 따로 만들 것
  map() 사용해서 화면 출력
  filter() 사용해서 삭제 처리
  JSON.stringify(todos) 출력 */

// 1. 할 일을 입력하고 추가 버튼을 누르면 목록에 추가한다

  //  1) 할 일을 입력할 배열, todos 배열 사용
  let todos = [];

  //  2) 버튼 가져오기
  const btn = document.getElementById("addbtn");

  //  3) 추가 버튼 클릭 이벤트
  addBtn.addEventListener("click", function () {

    var input = document.getElementById("todoInput");
    var text = input.value;

    if(text == "") {
      alert("할 일을 입력하세요!");
      return;
    }


  })


