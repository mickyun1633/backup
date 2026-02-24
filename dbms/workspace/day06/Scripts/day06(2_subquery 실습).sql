-- 2번 : subquer 실습
-- table : TBL_BOOKS / TBL_MEMBERS / TBL_RENTAL 기준

SELECT * FROM TBL_BOOKS;
SELECT * FROM TBL_MEMBERS;
SELECT * FROM TBL_RENTAL;

-- SQL을 한 번에 쓰지말고 먼저 무엇을 찾을지를 작은 쿼리문으로 확인
-- 그 결과를 메인 쿼리에 붙이기
-- 서브 쿼리 작성 위치, 연관/비연관, 단일/다중 생각해서 작성

-- 1) 3번 책을 빌린 회원 조회
-- TBL_MEMEBERS
-- MEM_ID 
-- IN 
SELECT MEM_ID
FROM TBL_RENTAL
WHERE BOOKS_ID = 3; 


SELECT * 
FROM TBL_MEMBERS M
WHERE M.MEM_ID IN (SELECT R.MEM_ID FROM TBL_RENTAL R WHERE R.BOOKS_ID = 3);




-- 2) 가장 최근 대여일 조회
-- TBL_RENTAL
-- REN_RENTAL_DATE
-- MAX 
SELECT *
FROM TBL_RENTAL R
WHERE R.REN_RENTAL_DATE  = (SELECT MAX(REN_RENTAL_DATE) FROM TBL_RENTAL);

-- 3)  대여한 적이 없는 회원 조회
-- TBL_MEMEBERS
-- MEM_ID
-- NOT IN 

SELECT * FROM TBL_MEMBERS;	-- 7명

-- 대여한 회원 목록 확인
SELECT DISTINCT MEM_ID
FROM TBL_RENTAL;	-- 4명(1, 2, 3, 4)

-- 대여하지 않는 회원 확인
SELECT *
FROM TBL_MEMBERS M
WHERE NOT EXISTS (SELECT 1 FROM TBL_RENTAL R WHERE R.MEM_ID = M.MEM_ID);
-- (4, 6, 7)
-- WHERE절 , 연관, EXIST 계열(0행 / 1행 이상 존재여부)

--SELECT *
--FROM TBL_MEMBERS M
--WHERE M.MEM_ID NOT IN (SELECT R.MEM_ID FROM TBL_RENTAL R);

-- 4) 가장 마지막에 등록된 회원 조회
SELECT * 
FROM TBL_MEMBERS M
WHERE

-- 5) 빌려간 적이 없는 책 조회
-- 빌려간 책 ID 확인
SELECT DISTINCT BOOKS_ID
FROM TBL_RENTAL;	-- (1, 2, 3, 4, 5)

-- 전체 책 조회
SELECT * FROM TBL_BOOKS;	-- 10DNJS(1, 2, 3, 4, 5, 6, 7, 8, 10, 11)

-- NOT EXTSIS로 없는 책 조회
SELECT *
FROM TBL_BOOKS B
WHERE NOT EXISTS (SELECT 1 FROM TBL_RENTAL R WHERE R.BOOKS_ID = B.BOOKS_ID );
-- WHERE절, 연관, EXISTS 계열



-- 6) 회원 별 대여 횟수 조회

-- 7) 가장 많이 빌린 회원 조회
-- 회원별 대여 횟수 확인
SELECT MEM_ID, COUNT(*) CNT
FROM TBL_RENTAL tr 
GROUP BY MEM_ID;

-- 이 결과에서 최대값 뽑기
SELECT MAX(CNT)
FROM (SELECT MEM_ID, COUNT(*) CNT
FROM TBL_RENTAL tr 
GROUP BY MEM_ID);

-- 최대값을 가진 MEM_ID 조회
SELECT MEM_ID
FROM TBL_RENTAL
GROUP BY MEM_ID
HAVING COUNT(*) IN
         (SELECT MAX(CNT)
            FROM (SELECT COUNT(*) CNT
                  	FROM TBL_RENTAL
                  	GROUP BY MEM_ID)
         );

-- WHERE / HAVING 절, 비연관, 다중행 IN 

-- 8) 상위 3개 대여 기록 조회

-- 9) 가장 인기 많은 책 정보 조회