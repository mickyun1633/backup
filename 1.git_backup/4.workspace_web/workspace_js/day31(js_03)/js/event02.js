// 12번 : DOM을 활용한 이벤트 처리
const boxClick = document.querySelector("#click");
const boxOver = document.querySelector("#over");
const boxOut = document.querySelector("#out");
const boxOverOut = document.querySelector("#over-out");
const boxClick2 = document.querySelector("#click2");

console.log(boxClick);
console.log(boxOver);
console.log(boxOut);
console.log(boxOverOut);

function changeBgGreen(){
  this.setAttribute("style", "background-color:green");
  console.log(this);
  //this는 현재 이벤트가 걸린 자기 자신을 의미한다
}

boxClick.addEventListener("click", changeBgGreen);

boxOver.addEventListener("mouseover", changeBgGreen);

boxOver.addEventListener("mouseover", function(){
  boxOver.setAttribute("style", "background-color:lightblue");
});

function changeBgPink(){
  this.setAttribute("style", "background-color:pink");
  console.log(this);
}

boxOut.addEventListener("mouseout", changeBgPink);

boxOverOut.addEventListener("mouseover", changeBgGreen);
boxOverOut.addEventListener("mouseout", changeBgPink);

// click : 마우스 왼쪽버튼 클릭
// dblclick : 더블클릭
// contextmenu : 오른쪽 클릭
// mousedown : 버튼 누르는 순간
// mouseup : 버튼 떼는 순간
// mouseover : 요소 안으로 들어갈 때(버블링 o)
// mouseout : 요소 밖으로 나갈 때(버블링 o)
// mouseenter : 들어갈 때 (버블링 x)
// mouseleave : 나갈 때 (버블링 x)
//mouseover는 자식 요소위에 올라가도 계속 발생
//mouseenter는 해당 요소에 처음 들어갈 때만 발생(버블링 없음)
//hover 효과는 보통 mouseenter, mouseleave에서 사용함
// mousemove : 마우스가 움직일 때 발생

boxClick2.addEventListener("mousemove", function(e){
  console.log(e.clientX, e.clientY);
});

// ★★★★★

// 이벤트 객체에서 자주 쓰는 값
// e.clientX : 브라우저 기준 X좌표
// e.clientY : 브라우저 기준 Y좌표
// e.target : 실제 이벤트 발생 요소
// e.currentTarget : 이벤트가 등록된 요소
