// 10번 : 객체1

//객체는 보통 const로 선언하며 객체로 사용시 const라도 값 변경이 가능하다
const user = {
  name : "윤철민",
  age : 20,
  address : "서울시 서초구",
  introduce : () =>{
    console.log("안녕하세요");
  },
};

console.log(user, typeof user);
console.log(user.introduce); //[Function: introduce]
user.introduce(); //안녕하세요
console.log(user.address); //서울시 서초구  . 직접 접근할 수 있다
console.log(user['address']); //서울시 서초구 //key값의 규칙성이 필요하다면 ['']문법을 사용하여 접근할 수 있다

// phone 키와 '010-1234-1234' 값을 추가
user.phone = '010-1234-1234';
console.log(user);
// {
//   name: '윤철민',
//   age: 20,
//   address: '서울시 서초구',
//   introduce: [Function: introduce],
//   phone: '010-1234-1234'
// }

// address 삭제
delete user.address;
console.log(user);
// {
//   name: '윤철민',
//   age: 20,
//   introduce: [Function: introduce],
//   phone: '010-1234-1234'
// }


// for ... in
// 객체의 키(프로퍼티 이름)을 순환한다
// 일반 객체나 배열에서 모두 사용 가능하다

// for ... of
// 이터러블(interable) 객체에서만 사용가능 => 배열, 문자열, Map, Set 등
// 순환시 객체의 값(value)를 반환한다
// 일반객체는 이터러블 객체 아니므로 사용 불가하다
// [Symbol.iterator] 메소드를 가진 객체를 이터러블 객체라고 한다

// 일반 객체를 for ... 로 순회하려면 배열로 변환하면 된다
// Object.keys(), Object.values(), Object.entries()를 사용한다
// Object.entries() : [key, value] 쌍의 배열로 변환하는 메소드

// 1. prog 객체 생성
//프로퍼티 키는 pro1 ~ pro4까지
//프로퍼티 값은 java, dbms, html/css, javascript
const prog = {
  pro1 : "java",
  pro2 : "dbms", 
  pro3 : "html/css",
  pro4 : "javascript"
}

// 2. 객체, 타입 출력
console.log(prog, typeof prog); //{ pro1: 'java', pro2: 'dbms', pro3: 'html/css', pro4: 'javascript' } object

// 3. javascript만 출력하기 방법2가지, 출력 타입까지
console.log(prog.pro4, typeof prog.pro4);
console.log(prog['pro4'], typeof prog['pro4']);

// 4. pro1의 값을 자바로 변경
prog.pro1 ="자바";
console.log(prog);

// 5. pro5 객체 추가
// 프로퍼티 값은 git
prog.pro5 = "git";
console.log(prog);

// 6. 객체의 전체 값 하나씩 출력(for ... in 사용)
for(let i in prog){
  // console.log(i);
  console.log(prog[i]);
}
// i 출력시
// pro1
// pro2
// pro3
// pro4
// pro5

// prog[i] 출력시
// 자바
// dbms
// html/css
// javascript
// git

// for(let i of prog){ //TypeError: prog is not iterable
//   console.log(i); 
// }

// 일반 객체를 for ... 로 순회하려면 배열로 변환하면 된다
// Object.keys(), Object.values(), Object.entries()를 사용한다
// Object.entries() : [key, value] 쌍의 배열로 반환하는 메소드
for(let key of Object.keys(prog)){
  console.log(key);
}
// pro1
// pro2
// pro3
// pro4
// pro5

for(let value of Object.values(prog)){
  console.log(value);
}
// 자바
// dbms
// html/css
// javascript
// git

for(let [key, value] of Object.entries(prog)){
  console.log(`${key}의 값 : ${value}`)
}

// pro1의 값 : 자바
// pro2의 값 : dbms
// pro3의 값 : html/css
// pro4의 값 : javascript
// pro5의 값 : git


// Symbol.iterator 직접 추가
const program = {
  lang1: "java",
  lang2 : "dbms",
  lang3 : "html/css",
  lang4 : "javascript",
  [Symbol.iterator] : function* (){
    // [Symbol.iterator] 이 객체를 반복 가능한 객체로 만들어주겠다는 의미
    // function* 제너레이터함수(이 객체를 어떻게 순회할지 내가 직접 정의하겠다는 의미)
    // 제너레이터 함수 : 호출 즉시 실행되지 않음, .next()가 호출될 때마다 실행->멈춤->재개
    for(let key in this){
      if(this.hasOwnProperty(key)){ // 안전한 객체 순회를 위한 필수 방어 코드
        yield this[key];  // yield 값을 하나씩 반환
      }
    }
  },
};


