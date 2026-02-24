-- 1번 : 서브쿼리(subquery)

SELECT * FROM tbl_rental;
SELECT * FROM tbl_members;
SELECT * FROM tbl_books;

-- 테이블 데이터 추가
INSERT INTO TBL_BOOKS VALUES (6, '어린왕자', '생텍쥐페리');
INSERT INTO TBL_BOOKS VALUES (7, '죄와벌', '도스토옙스키');
INSERT INTO TBL_BOOKS VALUES (11, '노인과바다', '헤밍웨이');

INSERT INTO TBL_MEMBERS VALUES (6, '수지', '010-1111-2222', 'suj@naver.com');
INSERT INTO TBL_MEMBERS VALUES (7, '민수', '010-3333-4444', 'min@naver.com');

-- 짱구(1) 3번 더 추가
INSERT INTO TBL_RENTAL VALUES (6, 1, 1, DATE '2024-01-05', DATE '2024-01-12');
INSERT INTO TBL_RENTAL VALUES (7, 1, 2, DATE '2024-02-01', DATE '2024-02-08');
INSERT INTO TBL_RENTAL VALUES (8, 1, 3, DATE '2024-03-01', DATE '2024-03-10');

-- 철수(3) 3번 더 추가
INSERT INTO TBL_RENTAL VALUES (9, 3, 1, DATE '2024-01-15', DATE '2024-01-25');
INSERT INTO TBL_RENTAL VALUES (10,3, 2, DATE '2024-02-15', DATE '2024-02-22');
INSERT INTO TBL_RENTAL VALUES (11,3, 4, DATE '2024-03-15', DATE '2024-03-30');
INSERT INTO TBL_RENTAL VALUES (12,3, 1, DATE '2024-04-01', DATE '2024-04-05');

-- 훈이의 MEM_ID 확인
SELECT * FROM TBL_MEMBERS 
WHERE MEM_NAME = '훈이';

-- 훈이의 대여기록 삭제
DELETE FROM TBL_RENTAL
WHERE MEM_ID = 4;

-- 삭제 여부 확인
SELECT * 
FROM TBL_RENTAL
WHERE MEM_ID = 4;	-- 없으면 삭제 성공(대여 정보만)

DELETE FROM TBL_RENTAL
WHERE MEM_ID = (SELECT MEM_ID FROM TBL_MEMBERS WHERE MEM_NAME = '훈이');

-- 1) FROM 절 : 인라인 뷰
-- 서브쿼리를 임시 테이블처럼 사용

-- 대여 정보와 회원 이름
SELECT * 
FROM (SELECT R.REN_ID, M.MEM_NAME, R.BOOKS_ID 
   FROM TBL_RENTAL R JOIN TBL_MEMBERS M ON R.MEM_ID = M.MEM_ID);

-- 대여한 회원만 추출
SELECT * 
FROM (SELECT MEM_ID, COUNT(*) CNT
   FROM TBL_RENTAL
   GROUP BY MEM_ID
   )
WHERE CNT >= 1;

-- 2) SELECT 절 : Scalar Subquery
-- column 1개, 행 1개 
-- JOIN만 쓰고 정보 붙일 때

-- 대여 정보 + 책 제목
SELECT REN_ID, (SELECT BOOKS_TITLE FROM TBL_BOOKS WHERE BOOKS_ID = R.BOOKS_ID)
FROM TBL_RENTAL R;

-- 3) WHERE 절 : 일반 Subquery
-- 조건값을 subquery로 구함

-- 가장 늦게 빌린날
SELECT * 
FROM TBL_RENTAL
WHERE REN_RENTAL_DATE = (SELECT MAX(REN_RENTAL_DATE) FROM TBL_RENTAL);
-- MAX 먼저 구하고 비교

-- 4) 비연관 sudquery : 혼자 실행 가능
SELECT *
FROM TBL_BOOKS
WHERE BOOKS_ID IN (SELECT BOOKS_ID FROM TBL_RENTAL);

SELECT BOOKS_ID FROM TBL_RENTAL;

-- 5) 연관 sudquery : 바깥 column 사용
SELECT *
FROM TBL_MEMBERS M
WHERE EXISTS (SELECT 1 FROM TBL_RENTAL R WHERE R.MEM_ID = M.MEM_ID);
-- EXISTS의 역활 : sudquery의 결과가 한 건이라도 있으면 TRUE 없으면 FALSE => 이 조건을 만족하는 data가 존재하니? 
-- SELECT 절의 1은 아무 의미 없는 상수값, 결과값 자체가 중요하지 않고 행이 있냐 없냐만 체크하는 용도로 사용
-- (존재여부만 확인하겠다는 의도 표현)

-- 6) 단일행
SELECT *
FROM TBL_RENTAL
WHERE REN_ID =(SELECT MAX(REN_ID) FROM TBL_RENTAL);

-- 7) 다중행 : IN, EXISTS, ANY, ALL
-- IN
SELECT * 
FROM TBL_BOOKS
WHERE BOOKS_ID IN (SELECT BOOKS_ID FROM TBL_RENTAL);

-- EXISTS
SELECT *
FROM TBL_MEMBERS M
WHERE EXISTS (SELECT 1 FROM TBL_RENTAL R WHERE R.MEM_ID = M.MEM_ID);

-- 회원 1명 선택
-- 그 회원이 TBL_RENTAL에 있는지 확인
-- 있으면 출력, 없으면 제외

-- ALL
-- column 연산자 ALL(Subquery)
SELECT *
FROM TBL_BOOKS
WHERE BOOKS_ID > ALL (SELECT BOOKS_ID FROM TBL_RENTAL WHERE MEM_ID = 1);
-- 회원1 빌린 책 번호 조회
--SELECT BOOKS_ID FROM TBL_RENTAL WHERE MEM_ID = 1;	--(1, 2, 3)
-- BOOKS_ID > 3

-- > ALL	최대값보다 큼
-- < ALL 	최소값보다 작음

-- ANY / SOME
-- column 연산자 ANY (subquery)
SELECT * FROM TBL_BOOKS
WHERE BOOKS_ID > ANY (SELECT BOOKS_ID FROM TBL_RENTAL WHERE MEM_ID = 1);
-- 회원1이 빌린책 : 1, 2, 3
-- ANY 하나라도 만족하면 BOOKS_ID > 1

-- > ANY	최소값보다 큼
-- < ANY	최대값보다 작음





































