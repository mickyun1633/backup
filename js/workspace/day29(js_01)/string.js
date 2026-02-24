// 10번 : 문자열 사용하기
// 문자열 표현하는 방법 : "", '', ``

let subject = `자바 스크립트`;
const time = 8;
console.log(subject, typeof subject);
console.log(time, typeof time);
// 자바 스크립트 string
// 8 number

// 지금은 자바스크립트를 공부 중입니다
// 하루 수업은 8교시까지 있습니다 출력
console.log("지금은 " + subject + "공부중입니다\n하루수업은 " + time + "교시까지 있습니다");
//지금은 자바 스크립트공부중입니다
// 하루수업은 8교시까지 있습니다
console.log(`지금은 ${subject}공부중입니다\n하루 수업은 ${time}교시까지 있습니다`);
// 지금은 자바 스크립트공부중입니다
// 하루 수업은 8교시까지 있습니다