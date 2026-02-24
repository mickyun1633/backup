// 5번 : 화살표 함수(Arrow Function) ★★★★★
// ES6에서 도입된 간결한 함수작성 방식

//익명함수
const add1 = function (num1, num2){
  return num1 + num2;
};

//화살표함수
const add2 = (num1, num2) => num1 + num2;
console.log(add2(100, 200));

// 이름과 나이를 매개변수로 받아 출력하는 화살표 함수
// 함수명 : printInfo
// 매개변수 : 2개, 리턴값 : x

//익명함수
const printInfo = function (name, age){
  console.log(`제 이름은 ${name}이고 나이는 ${age}입니다.`);
};

//화살표함수
const printInfo2 = (name, age) => console.log(`제 이름은 ${name}이고 나이는 ${age}입니다.`);

printInfo('짱구', 5);
printInfo2('철수', 5);

// 매개변수 0개인경우 빈 소괄호 사용
const greet = () => 'hello!! 2026!!';
console.log(greet()); //hello!! 2026!!

// 매개변수 1개인 경우 소괄호 생략 가능
const square = x => console.log(x * x);
square(10); //100

// 여러줄의 코드가 필요한 경우 중괄호 사용
const sumArray = (arr) => {
  let sum = 0;
  for(let num of arr){
    // console.log(num);
    sum += num;
  }
  return sum;
};
console.log(sumArray([10, 20, 30]));


// for ... of와 for ... in의 차이
//(1) for ... of
// 값을 꺼낸다 배열, 문자열, Map, Set에 주로 사용

//(2) for .. in 
// 키와 인덱스를 꺼낸다 객체(Object)에 주로 사용