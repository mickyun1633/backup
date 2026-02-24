// 5번 : promise 비동기 처리

// 사용자 등록 함수 실행
// saveDB(user) : DB 저장(3초)
// sendEmail(user) : email 전송(5초)
// getResult(user) : 메시지 생성(0.5초)

//DB 빈 배열 생성
const DB = [];

//saveDB : 사용자 정보를 db배열에 저장(resolve, reject 처리)
function saveDB(user){
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      const beforeLength = DB.length;
      const afterLength = DB.push(user);

      if ( beforeLength < afterLength){
        resolve(user);  // promise 이행
        console.log(`${user.name}의 정보가 저장되었습니다`);
      }else{
        reject(new Error("정보가 저장되지 않았습니다"));
      }
    }, 3000);
  });
}

//sendEmail(user) : 이메일 주소를 받아서 전송메시지 출력
function sendEmail(user){
  //사용자 정보를 Promise 이행하고 사용자 정보를 resolve에 전달
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(user);  // promise 이행
      console.log(`이메일 : ${user.email}`);
    }, 5000);
  });
}

//getResult(user) : 사용자 이름 기반으로 msg
function getResult(user){
  return new Promise((resolve) => {
    setTimeout(() => {
      resolve(`방문자 : ${user.name}`);
    }, 500);
  });
}

// register(user) : 위 함수 3개를 Promise.all()로 묶어 실행
function register(user){
  const resultAsync = Promise.all([
    saveDB(user), sendEmail(user), getResult(user),
  ]);
  resultAsync.then(console.log);
}

register({
  name : "신짱구",
  email:"gu@test.com"
});

register({
  name:"신형만",
  email:""
});

// 신짱구의 정보가 저장되었습니다
// 이메일 : gu@test.com
// [
//   { name: '신짱구', email: 'gu@test.com' },
//   { name: '신짱구', email: 'gu@test.com' },
//   '방문자 : 신짱구'
// ]
