//한 페이지 당 표시될 게시물 수 5개
const pageSize = 5;
//총 게시물 수 20개
const totalItems = 7;
//전체 페이지 수 Math.ceil 올림함수
const totalPages = Math.ceil(totalItems / pageSize);

//게시물을 표시할 컨테이너와 페이지 네비게이션을 표시할 컨테이너를 DOM에서 가져온다
const contentContainer = document.getElementById("content");
const pagenationContainer = document.getElementById("pagenation-container");
const pagenation = document.getElementById("pagenation");

//게시물 생성 함수 => 게시물 하나를 만들어서 반환하는 함수 <div class="post">게시물 2</div>
function createPost(content){
  const post = document.createElement("div");
  post.classList.add("post");
  post.textContent = content;
  return post;
}

// 페이지 번호 클릭 시 이벤트 핸들러
function onPageClick(event){
  const currentPage = parseInt(event.target.textContent);
    // event.target : 실제로 클릭된 요소
    // <li>
    // textContent : <li> 안에 들어있는 글자
    // <li>1</li> => .textContent   => "1"
    // 숫자를 계산해야하므로 parseInt("1") => 1 숫자


  //해당 페이지에 표시할 게시물 보여지는 함수 호출 => 함수 만들러간다
  showPage(currentPage);
  //페이지 번호 클릭시 active 변경되도록 페이지 네비게이션 업데이트 함수 호출
  updatePagination(currentPage);
}

// 페이지에 해당하는 게시물 표시 함수
function showPage(page){
  contentContainer.innerHTML =""; //현재 표시된 게시물 초기화
  const startIdx = (page - 1) * pageSize; // 현재 페이지의 시작 인덱스 계산
  const endIdx = Math.min(startIdx + pageSize, totalItems); //현재 페이지의 마지막 인덱스 계산

  //시작 인덱스부터 마지막 인덱스까지 반복하면서 게시물 생성 및 추가
  for(let i = startIdx; i < endIdx; i++){
    const post = createPost(`게시물 ${i+1}`); //게시물생성
    contentContainer.appendChild(post); // 게시물 컨테이너 추가
  }
}

// 페이지 네비게이션 업데이트 함수
function updatePagination(currentPage){
  //모든 페이지 번호에서 active 클래스 제거
  pagenationContainer.querySelectorAll("li").forEach(item => {
    item.classList.remove('active');
  });
  //현재 페이지 번호에 active 클래스 추가
  pagenationContainer.querySelector(`li:nth-child(${currentPage})`).classList.add('active');
}

//페이지 번호 생성 및 이벤트 핸들러 추가
for(let i = 1; i <= totalPages; i++){
  const li = document.createElement("li"); // <li>요소 생성
  li.textContent = i; //페이지 번호 생성

  if(i === 1){
    li.classList.add('active'); //첫페이지 active 추가
  }

  li.addEventListener("click", onPageClick); //페이지 번호 클릭 이벤트 핸들러 추가
  pagenation.appendChild(li); //페이지 번호를 <ul> 자식요소로 <li>요소 추가
}

pagenationContainer.appendChild(pagenation);
showPage(1);

// //page = 2
// startIdx = (2-1) * 5 = 5
// endIdx = 5+5+ = 10
// 인덱스 5 ~ 10 게시물이 출력
// => 게시물 6 ~ 11 

// Math.min : 마지막페이지에서 넘치지 않게 하기 위함
// 배열 인덱스는 0부터 시작함, 게시물이 20개라면 실제인덱스와 게시물번호
//번호   1 2 3 4 5 6 7 8 ... 17 18 19 20
//인덱스 0 1 2 3 4 5 6 7 ... 16 17 18 19

//page = 2 일때 startIdx가 5인 이유
// 공식 startIdx = (page - 1) * pageSize
//현재 조건
//  pageSize = 5
//  page = 2
// 따라서 (2-1) * 5 = 1*5 = 5
// 1페이지에 보여져야할 게시물 1 ~ 5번까지의 게시물, 인덱스 번호는 0 ~ 4번까지
// 2페이지에 보여져야할 게시물 6 ~ 10번까지의 게시물, 인덱스 번호는 5 ~ 9번까지
// 2페이지의 시작 인덱스 번호는 5

//endIdx가 10인 이유
// endIdx = startIdx + pageSize
// startIdx = 5, pageSize = 5 따라서 5 + 5 = 10
// for문의 상황
//  i < endIdx => 즉 10은 포함되지 않음

// Math.min이 필요한 이유
// totalItems = 18
// pageSize = 5

// 18 / 5 = 3.6 => 올림처리 4페이지가 필요
//  마지막페이지(4페이지 )
// startIdx = (4 - 1) * 5 = 3 * 5 = 15
// endIdx = 15 + 5 = 20
// 인덱스는 0 ~ 17까지만 존재함(총 게시물이 18개니까)

// 인덱스   15 16 17 18 19
// 실게시물 16 17 18
// Math.min(startIdx + pageSize, totalItems);
// Math.min(20, 18);
// for문 i = 15; i < 18;
//  게시물 15, 16, 17 3개
