let box1 = document.querySelector(".box1");
console.log(box1, typeof box1);

let $box2 = $('.box2');
console.log($box2);
//jquery 객체로 만들어진다

let $boxes = $('.div-box');
console.log($boxes);

// $boxes.css('background-color', 'red');

// console.log($box2.parent()); 
// console.log($box2.parents());
// console.log($box2.prev());
// console.log($box2.children()); 
// 자식요소는 없기 때문에 jquery 객체의 길이가 0으로 나온다


// li 태그 전체 가져오기
let $allLi = $('li');
console.log($allLi);

// 클래스 이름이 product인 태그 전체 가져오기
let $product = $('.product');
console.log($product);

// 자식 태그중 첫번째 자식 가져오기 
// 변수명 $firstChild
let $firstChild = $('.product li').fisrt();

// ul 태그의 부모 태그 가져오기
// 변수명 $ulParent
let $ulParent = $('ul').parent();


// ul 태그 자식 중 0번째 인덱스 가져오기
// 변수명 $ulFirstChild
let $ulFirstChild = $('ul').children.eq(0);

// ul 태그 자식 중 2번째 인덱스 가져오기
// 변수명 $ulThirdChild
let $ulThirdChild = $('ul').children.eq(2);




