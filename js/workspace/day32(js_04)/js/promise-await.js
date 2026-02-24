// 6번 : async / await

//async 함수는 내부에서 return 한 값을
//자동으로 Promise.reolve(value)로 변환함

async function getName() {
  return "짱구"; //자동으로 Promise로 감싸짐
}

// function getName(){
//   return Promise.resolve("짱구");
// }

async function printName(){
  const name = await getName();
  console.log(name);
}

printName();
//1) printName() -> async 함수니까 Promise 반환
//2) const name = await getName();
// -getName() 실행
// -Promise.resolve("짱구")반환
// -await는 Promise가 이행될 때까지 이행
//3) Promise가 바로 resolve되므로 마이크로태스크 큐에
//이어서 실행할 코드로 등록이 됨
//4) 현재 콜스택이 비면 마이크로태스크 실행
// console.log(name);

// function printName(){
//   return getName().then(name => {console.log(name); });
// }


async function test() {
  console.log("1");
  await getName();
  console.log("2"); // 마이크로태스크
}

console.log("0");
test();
console.log("3");