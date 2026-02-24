// 1번 : 일반함수

// 매개변수 x 리턴값 x
function showHello(){
  console.log(`hello`);
}

// 매개변수 x 리턴값 x => 함수명();
showHello();

// 매개변수 o 리턴값 x 함수 정의
function showGreet(greeting){
  console.log(`인사말 : ${greeting}`);
}

// 매개변수 o  리턴값 x => 함수명(인수);
showGreet("안녕하세요");
showGreet("안녕히계세요");

// 매개변수 x 리턴값 o 함수 정의
function multiply(){
  return 10 * 20;
}

// 매개변수 x 리턴값 o => 출력(함수명());
console.log(multiply());
let result = multiply();
console.log(result);

// 매개변수 o 리턴값 o 함수정의
function multi(num1, num2=3){
  console.log(`num1 : ${num1}, num2 : ${num2}`);
  return num1 * num2;
}


// 매개변수 o 리턴값 o => 출력(함수명(인수, 인수)); or 변수 = 함수명(인수, 인수);
console.log(multi(10, 20));
console.log(multi(5)); 
//num1 : 5, num2 : undefined
//NaN

// 디폴트 매개변수
// 아이디, 비밀번호, 이름을 전달받고 이름의 기본값을 사용자로 설정하기
// 함수명 : introduce 매개변수 o, 리턴값 x
// 출력문 1개만 작성

function introduce(id, pw, name='사용자'){
  console.log(`아이디 : ${id}, 비밀번호 : ${pw}, 이름 : ${name}`);
}

introduce('test', 1234); //아이디 : test, 비밀번호 : 1234, 이름 : 사용자
introduce('test1', 'test1', '짱구'); //아이디 : test, 비밀번호 : test1, 이름 : 짱구
introduce('test2', 123, '철수'); //아이디 : test2, 비밀번호 : 83, 이름 : 철수
// 0123으로 인수를 전달하면 8진수로 해석되어 계산된다
// 0123을 8진수로 변환 => 1 x 8² + 2 x 8¹ + 3 x 8^0 = 0 + 64 + 16 + 3 = 83

// 가변 매개 변수
function printAdd(...numbers){
  console.log(numbers, typeof numbers);
  let sum = 0;
  for(let i = 0; i < numbers.length; i++){
    // console.log(i, typeof(i)); //인덱스
    // console.log(numbers[i], typeof numbers[i]); //배열명[i]
    const value = Number(numbers[i]); //Number() 문자열 숫자도 변환가능하도록 처리
    if(!isNaN(value)){  //isNaN() 숫자가 아닌 값은 덧셈에서 제외
      sum += value;
    }else{
      console.log(`${numbers[i]}는 숫자가 아니라서 제외됨`)
    }

    console.log(`총합 : ${sum}`);
  }
}

printAdd(10, 20, 'a', '30', 40, 50); //[ 10, 20, '30', 40, 50 ] object