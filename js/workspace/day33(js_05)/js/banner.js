let slideBox = document.querySelector(".slide-box");
let slideImg = document.querySelectorAll(".slide-img");
let prevBtn = document.querySelector(".prev");
let nextBtn = document.querySelector(".next");

// 슬라이드 너비, 현재 인덱스, 슬라이드 개수 설정
let slideWidth = 800;
let currentIdx = 0;
let slideCnt = slideImg.length;

// 슬라이드가 처음이나 마지막에 도달했는지 확인하고 이전/다음 버튼을 숨김처리 or 표시처리
function checkEnd(){
  if(currentIdx <= 0){
    prevBtn.style.display = "none";
  }else{
    prevBtn.style.display = "block";
  }

  if(currentIdx >= slideCnt - 1){
    nextBtn.style.display = "none";
  }else{
    nextBtn.style.display = "block";
  }
}
checkEnd();

//다음 버튼 클릭시 발생하는 이벤트
nextBtn.addEventListener("click", function () {
  currentIdx++;
  slideBox.style.left = -(currentIdx * slideWidth) + "px";
  // left = -(현재 인덱스 x 슬라이드 너비)
  slideBox.style.transition = '0.5s ease';
  checkEnd();
});

//이전 버튼 클릭시 발생하는 이벤트
prevBtn.addEventListener("click", function(){
  currentIdx--;
  slideBox.style.left = -(currentIdx * slideWidth) + "px";
    // left = -(현재 Idx x 슬라이드 너비)
    //                - (2 x 800) => 왼쪽으로 1600px 이동
    //    Index 가 줄어들면 left값도 덜 음수가 됨
    //[1][2][3]
  slideBox.style.transition = "0.5s ease";
  checkEnd();
});

// [0] [1] [2]



//상태      left값    보여지는 슬라이드   prev    next
//c_idx=0   0px       1번               x       o
//c_idx=1  -800px     2번               o       o
//c_idx=2 -1600px     3번               o       x