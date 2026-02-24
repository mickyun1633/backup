// 3번 : const 상수(var.js, let.js랑 같이 보기)

const data1 = 10;
const data2 = '10';

console.log(data1, typeof data1);
console.log(data2, typeof data2);

// data2 = '100'; //TypeError: Assignment to constant variable.
// console.log(data2);

// console.log(age1);
const age1 = 20;
console.log(age1, typeof age1);
console.log(age1 + 1);