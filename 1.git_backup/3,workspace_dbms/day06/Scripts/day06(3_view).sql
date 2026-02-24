-- 3번 : VIEW

SELECT * FROM TBL_RENTAL tr;
SELECT * FROM TBL_BOOKS;
SELECT * FROM TBL_MEMBER;

SELECT r.ren_id, m.mem_name, b.books_title, r.ren_rental_date, r.ren_return_date
FROM tbl_rental r JOIN tbl_members m ON r.MEM_ID = m.MEM_ID 
   JOIN tbl_books b ON r.BOOKS_ID = b.BOOKS_ID
ORDER BY ren_id;

-- SELECT query문을  view로 저장
CREATE VIEW vw_rental_info AS 
SELECT r.ren_id, m.mem_name, b.books_title, r.ren_rental_date, r.ren_return_date
FROM tbl_rental r JOIN tbl_members m ON r.MEM_ID = m.MEM_ID 
   JOIN tbl_books b ON r.BOOKS_ID = b.BOOKS_ID
ORDER BY ren_id asc;

-- sys 계정으로 권한부여(cmd에서 진행)
--GRANT create VIEW to kdt;
-- view 생성 권한을 kdt계정에 부여하겠다는 의미

SELECT * FROM vw_rental_info;

--DROP VIEW vw_rental_info;

-- 이 정보를 이용해서 mem_id 같이 조회해야한다
SELECT m.mem_id, v.*
FROM vw_rental_info v JOIN tbl_members m
ON v.mem_name = m.MEM_NAME
ORDER BY m.mem_id;

-- 내가 받은 권한
SELECT * FROM user_tab_privs_recd;

-- 4. TCL 연습
CREATE TABLE TBL_TCL_TEST(
		ID NUMBER PRIMARY KEY,
		NAME VARCHAR2(100),
		BALANCE NUMBER
);

SELECT * FROM TBL_TCL_TEST;

INSERT INTO TBL_TCL_TEST
VALUES(1, '철수', 10000);
COMMIT;
INSERT INTO TBL_TCL_TEST
--VALUES(2, '유리', 50000);
VALUES(3, '짱구', 15000);
ROLLBACK;
COMMIT;	-- 확정되면 숫자가 더이상 증가하지 않고 None으로 나온다

-- 기존 금액
-- 철수 10000
-- 유리 50000
-- 짱구 15000

-- 유리 -> 철수 20000
UPDATE TBL_TCL_TEST
SET BALANCE = BALANCE - 10000
WHERE NAME ='유리';

UPDATE TBL_TCL_TEST
SET BALANCE = BALANCE + 20000
WHERE NAME = '철수';

COMMIT;

SELECT * FROM TBL_TCL_TEST;
ROLLBACK;




