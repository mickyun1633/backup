const bigImg = document.querySelector(".big-img");
const lightbox = document.querySelector("#lightbox");
const lightboxImg = document.querySelector("#lightbox-img");
const closeBtn = document.querySelector("#close");

//열기
bigImg.addEventListener("click", function (){
  const bigSrc = this.dataset.big;
  lightboxImg.src = bigSrc;

  lightbox.style.display="flex";
  // 배경스크롤 막기
  //documenet.body.style.overflow = "hidden";
});

//close 함수
function closeLightbox(){
  lightbox.style.display="none";
  // document.body.style.overflow = "auto";
}

//x버튼 클릭
lightbox.addEventListener("click", closeLightbox);

//ESC키로 닫기
document.addEventListener("keydown", function(e) {
  if(e.key === "Escape"){
    closeLightbox();
  }
});