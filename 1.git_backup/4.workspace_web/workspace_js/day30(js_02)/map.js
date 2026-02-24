// 14번 : map()

// let newArray = 배열명.map(callback(element [, index [, array]][, thisArgs]));

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
console.log(arr);

// 배열의 각 요소에 2를 곱한 값을 새로운 배열로 반환
const newArr1 = arr.map(function (element){
  return element * 2;
})
console.log(newArr1);
// [
//    2,  4,  6,  8, 10,
//   12, 14, 16, 18, 20
// ]

// 배열의 각 요소(문자열)를 문자열의 길이만 담은 새로운 배열로 반환
const arr2 = ['java', 'javascript', 'git', 'dbms', '설날'];
console.log(arr2, arr2.length); //[ 'java', 'javascript', 'git', 'dbms', '설날' ] 5

const newArr2 = arr2.map(function (element){
  return element.length;
});
console.log(newArr2); //[ 4, 10, 3, 4, 2 ]

//배열의 각 객체 특정 프로퍼티 값을 새로운 배열로 반환
const user1 = [{ name : "짱구", age : 5}, {name : "철수", age : 5}, {name:"훈이", age : 5}];
console.log(user1, typeof user1);
// [
//   { name: '짱구', age: 5 },
//   { name: '철수', age: 5 },
//   { name: '훈이', age: 5 }
// ] object

const names = user1.map(function (element){
  return element.name;
});
console.log(names); //[ '짱구', '철수', '훈이' ]

//thisArgs는 콜백함수 내에서 this 키워드를 사용할 때 참조할 객체를 지정할 수 있다
const mul = {multi:2};
const number = [1, 2, 3, 4, 5];
const numberIdx = number.map(function(element, index, array){
  return{
    element : element * this.multi, 
    //뒤에 온 mul이(두번째 인자)가 this가 참조할 객체, 콜백안에서 this.multi 사용가능, 화살표함수에서는 thisArgs 사용 불가
    index : index,
    array : array
  }
}, mul);
console.log(numberIdx);
// [
//   { element: 2, index: 0, array: [ 1, 2, 3, 4, 5 ] },
//   { element: 4, index: 1, array: [ 1, 2, 3, 4, 5 ] },
//   { element: 6, index: 2, array: [ 1, 2, 3, 4, 5 ] },
//   { element: 8, index: 3, array: [ 1, 2, 3, 4, 5 ] },
//   { element: 10, index: 4, array: [ 1, 2, 3, 4, 5 ] }
// ]
// [
//   { element: NaN, index: 0, array: [ 1, 2, 3, 4, 5 ] },
//   { element: NaN, index: 1, array: [ 1, 2, 3, 4, 5 ] },
//   { element: NaN, index: 2, array: [ 1, 2, 3, 4, 5 ] },
//   { element: NaN, index: 3, array: [ 1, 2, 3, 4, 5 ] },
//   { element: NaN, index: 4, array: [ 1, 2, 3, 4, 5 ] }
// ]
