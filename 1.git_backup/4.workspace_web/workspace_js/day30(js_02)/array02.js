// 13번 : 배열 메소드 (반드시!!! 필히!! 꼭!!!! 확인할 것!!!!)

let numbers = [10, 5, 3, 2, 7, 9];
console.log(numbers, typeof numbers);

// .push() : 가장 마지막 값 추가
numbers.push(100);
numbers.push(900);
console.log(numbers);
// [
//   10, 5,   3,   2,
//    7, 9, 100, 900
// ]

// .join() : 전달된 값으로 구분한 뒤 문자열 리턴
console.log([1, 2, 3, 4, 5], typeof [1, 2, 3, 4, 5]);
console.log([1, 2, 3, 4, 5].join(" "), typeof [1, 2, 3, 4, 5].join(" "));
// [ 1, 2, 3, 4, 5 ] object
// 1 2 3 4 5 string

// .slice(시작, 끝) : 원하는 부분을 추출하기 위해서 시작 인덱스와 마지막 인덱스를 전달한다
// 마지막인덱스는 포함되지 않는다
let numbers2 = [1, 2, 3, 4, 5, 6, 7, 8];
console.log(numbers2, typeof numbers2);
// [
//   1, 2, 3, 4,
//   5, 6, 7, 8
// ] object

// 인덱싱 : 배열명[인덱스번호] 하나의 값만 추출할 때 사용
console.log(numbers2[0]); //1
// 슬라이싱 : 여러개의 값을 추출할 때 사용
console.log(numbers2.slice(0, 1), typeof numbers2.slice(0, 1)); //[ 1 ] object
console.log(numbers2.slice(2, 8)) // [ 3, 4, 5, 6, 7, 8 ]

// .pop() : 마지막 요소를 삭제하는 값을 반환
console.log(numbers2);
console.log(numbers2.pop());
console.log(numbers2);

// .shift() : 첫번째 요소를 삭제하는 값을 반환
console.log(numbers2.shift()) //1
console.log(numbers2); //[ 2, 3, 4, 5, 6, 7 ]

// .splice(인덱스 번호, 개수) : 인덱스 번호 삭제(무조건 2개 매개변수로 작성)
console.log(numbers2.splice(2, 3));
console.log(numbers2); //[ 2, 3, 7 ]

numbers2 = [1, 2, 3, 4, 5, 6, 7, 8];
// .splice(개수) : 매개변수에 1개만 전달하면 0번째 인덱스부터의 개수로 인식하여 삭제된다
// console.log(numbers2.splice(4));
console.log(numbers2); 
// [
//   1, 2, 3, 4,
//   5, 6, 7, 8
// ]
console.log(numbers2.splice(7));
//[ 8 ] 삭제되는 값을 반환한다
console.log(numbers2);
// [
//   1, 2, 3, 4,
//   5, 6, 7
// ]

// .indexOf(값) : 값을 array(기존배열)에서 찾은 뒤 인덱스 번호를 반환, 값을 못찾으면 -1 반환
const numbers3 = [1, 1, 1, 2, 3];
console.log(numbers3); //[ 1, 1, 1, 2, 3 ]
console.log(numbers3.indexOf(1)); //0
console.log(numbers3.indexOf(10)); //-1

// .fill(값) : 배열의 모든 요소를 해당 값으로 채우기
// .fill(값, 시작인덱스, 종료인덱스) : 시작인덱스 ~ 종료인덱스 -1까지 해당 값으로 채운다
const numbers4 = new Array(5).fill(10, 2, 4);
console.log(numbers4);
// [ <2 empty items>, 10, 10, <1 empty item> ]

// 반복문 : forEach(callback)
numbers3.forEach(function (element, index, array) {
  // console.log(element); //요소 값 출력
  // console.log(index); // 인덱스 출력
  console.log(array); //원본배열 출력
});



