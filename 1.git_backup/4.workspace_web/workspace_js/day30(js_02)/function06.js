//6번 : 콜백지옥(Callback hell)
// 비동기 확인 setTimeout 비동기 함수
// console.log("시작");
// setTimeout(() => { console.log("1초후 실행") }, 1000);
// console.log("끝");
// 시작
// 끝
// 1초후 실행
// js는 기다리지 않는다 => 비동기

function run(callback){
  console.log("작업중");
  callback();
}

run(() => {
  console.log("작업끝");
});

//함수에 함수를 전달한다 
//언제 실행할지는 run이 결정한다
//실행내용은 사용자가 전달

// 비동기 + 콜백
function getData(callback){
  setTimeout(() => {
    console.log("데이터 가져오기 완료");
    callback("데이터");
  }, 1000);
}

getData((data) => {
  console.log("받은 값 : ", data);
});
// 비동기 작업이 끝난 후 그 결과를 콜백으로 전달, 동기처럼 return은 못 씀
