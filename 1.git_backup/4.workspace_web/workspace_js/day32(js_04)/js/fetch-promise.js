// 7번 : fetch - .then() 체이닝 활용

fetch("https://jsonplaceholder.typicode.com/users") //반환값  : Promise<Response>객체
.then((response) => {
  console.log(response.ok); //true : http 상태코드가 200 ~ 299면 true, 아니면 false
  console.log(response.status); //상태코드
  if(!response.ok){
    throw new Error(`response : ${response}`);
  }
  return response.json();
}).then((post) => {
  if(!post){
    throw new Error("결과없음");
  }
  return post.map((user) => ({
    id : user.id,
    name : user.name,
    email:user.email,
  }));
}).then(console.log)
.catch((error) => {
  console.log(`요청 실패 : `, error.message);
})

//실행흐름
//fetch()로 서버 http 요청 전송
//첫번째 .then() 응답상태 확인 + JSON 파싱(response.json())
//두번째 .then()에서 데이터 가공 map() 필요한 필드만 추출
//세번째 .then()에서 최종 데이터를 콘솔에 출력
//에러발생시 .catch()에서 에러메시지 출력