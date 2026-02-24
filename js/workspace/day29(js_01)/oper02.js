//9번 : 연산자
// 논리연산자

// 논리합 or(||) : 두 값 중 하나라도 Truthy면 결과는 true
// 단축평가 : 앞의 값이 truthy면 뒤의 값은 평가되지 않고 앞의 값을 반환한다(주로 기본값 설정에 사용됨)
let data1 = undefined || "기본값"; //앞의 조건식 false면 뒤에 값을 반환
let data2 = "값있음" || "기본값"; //앞의 조건식 true면 앞의 값을 반환
console.log(data1);
console.log(data2);

let data = 10;
console.log(data, typeof data);
data = data || 1; //data는 10, truthy한 값이므로 기존값 유지
console.log(undefined || 1);
console.log(data >= 10 || 0); //true, 앞의 조건식 결과가 truthy이므로 오른쪽 값은 보지 않는다

// && : 선행 조건식이 false면 뒤로 넘어가지 않고 선행조건식이 true일 때만 뒤의 값으로 대체된다
let data3 = true && "실행됨";
console.log(data3, typeof data3); //실행됨 string

console.log(1 && undefined); // undefined
console.log(null && undefined); //null

// ! : 논리부정연산자
console.log(!null); //true
console.log(!true); //false

// 병합연산자 ?? : 왼쪽값이 null 또는 undefined인 경우에만 오른쪽 값을 반환한다
let user = null;
let value = "default value";
console.log(user, typeof user, value, typeof value);
          //null     object  default value    string

console.log(null ?? value);  //default value
console.log(undefined ?? null); //null
console.log(value ?? null); //default value

// 옵셔널 체이닝 ?.
let users = {
  profile : {name : null, age : 5},
};

console.log(users, typeof users); //{ profile: { name: null, age: 5 } } object
let userName = users.profile.name;
console.log(userName); //null

let userName1 = users?.profile?.name;
console.log(userName1); //null

let users1 = {};
// let userName2 = users1.profile.name;
// console.log(userName2);
//TypeError: Cannot read properties of undefined (reading 'name')

let userName3 = users1?.profile?.name;
console.log(userName3); //undefined
// ?. 에러 방지용 값이 null => 그대로 null반환, 객체가 없으면 undefined 반환
// 옵셔널 체이닝 사용 : API 응답, 서버 데이터, 로그인 정보, 중첩 객체 접근할 때

// 삼항연산자 ? :
let age = 20;
let isAdult = age >= 19 ? "성인" : "미성년자";

console.log(isAdult); //성인