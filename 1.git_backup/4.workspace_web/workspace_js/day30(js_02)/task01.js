// for문 사용 금지, map/filter 사용해서 해결
const users = [
  {id : 1, name : "짱구", age : 5, score : 80},
  {id : 2, name : "철수", age : 5, score : 90},
  {id : 3, name : "유리", age : 5, score : 70},
  {id : 4, name : "훈이", age : 5, score : 85},
  {id : 5, name : "맹구", age : 5, score : 60}
];

// 1. 모든 사용자 이름만 담은 배열 생성 names 
const names = users.map(function (element) {
  return element.name;
});
console.log(names);

// 강사님 코드
const names = users.map(function(user) {
  return user.name;
});
console.log(names);

//  '짱구', '철수', '유리', '훈이', '맹구' ]


// 2. 모든 사용자 나이만 담은 배열 생성 ages
const ages = users.map(function (element) {
  return element.age;
});
console.log(ages);

// 강사님 코드
const ages = users.map(user => user.age);
console.log(ages);

//[ 5, 5, 5, 5, 5 ]

// 3. 각 사용자를 아래 형태로 변환
//  [결과예시]
// [ {name : "짱구", score : 80}, {name : "철수", score : 90}, ..]
const users1 = [{name : "짱구", score : 80}, {name : "철수", score : 90},
                {name : "유리", score : 70}, {name : "훈이", score : 85},
                {name : "맹구", score : 60}];

console.log(users1, typeof users1);

// 강사님 코드
const newAr1 = users.map(user => ({name:user.name, score : user.score}));
console.log(newAr1);

// [
//   { name: '짱구', score: 80 },
//   { name: '철수', score: 90 },
//   { name: '유리', score: 70 },
//   { name: '훈이', score: 85 },
//   { name: '맹구', score: 60 }
// ] object

// 4. 점수가 75점 이상인 사용자만 추출
// [결과예시]
// 이름, 이름, 이름
const newAr2 = users.filter(user => user.score >= 75).map(user => user.name);
console.log(newAr2);

// [ '짱구', '철수', '훈이' ]


// 5. 점수가 80점 이상인 사용자 이름만 추출
// [결과예시]
// [이름, 이름, 이름]

// 6. 합격 여부 추가-점수가 80점 이상이면 pass :true, 아니면 pass : false3
const newAr3 = users.map(function (user) {
  return {
    name:user.name,
    score:user.score,
    pass:user.score >= 80
  };
});
console.log(newAr3);
// [
//   { name: '짱구', score: 80, pass: true },
//   { name: '철수', score: 90, pass: true },
//   { name: '유리', score: 70, pass: false },
//   { name: '훈이', score: 85, pass: true },
//   { name: '맹구', score: 60, pass: false }
// ]


//7. 최고 점수 사용자의 이름과 점수 추출
// filter + every 사용
// reduce()
// sort()
// Math.max

//reduce() : 배열을 하나의 값으로 압축하는 함수
// 배열의 모든 요소를 하나로 줄이는 함수
// 배열 -> 숫자 하나, 문자열 하나, 객체 하나, 배열 하나
//배열.reduce((누적값, 현재요소, 현재인덱스, 원본배열) => {return 새로운 배열}, 초기값(누적값의 시작값));

const arr = [1, 2, 3, 4];
arr.reduce((acc, cur) => { return acc + cur}, 0);
//회차 acc curr return
//1     0    1    1
//2     1    2    3
//3     3    3    6
//4     6    4    10

const newArr3 = users.reduce((max, user) => user.score > max.score ? user : max);
console.log({name : newArr3.name, score : newArr3.score});
//{ name: '철수', score: 90 }

