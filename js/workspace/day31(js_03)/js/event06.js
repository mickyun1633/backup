// load 이벤트는 페이지 정보를 모두 읽어왔을 때 발생한다

// window.onload = () => {
//   alert("로드 이벤트 발생");
// };

// window.addEventListener('load', () => {
//   alert("로드이벤트2");
// });

let main = document.querySelector('main');
let color = main.style.backgroundColor;

window.addEventListener("scroll", () => {
  let scrollY = window.scrollY;
  console.log(scrollY);
  console.log(color);
  console.log(main);

  if(scrollY > 400){
    main.style.backgroundColor = 'gold';
  }else if(scrollY > 200){
    main.style.backgroundColor = "blue";
  }else if(scrollY > 100) {
    main.style.backgroundColor = 'green';    
  }else{
    main.style.backgroundColor = color;
  }
});