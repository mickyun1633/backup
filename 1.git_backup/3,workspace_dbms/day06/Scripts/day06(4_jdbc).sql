-- 4번 : jdbc에서 사용할 테이블

SELECT * FROM tbl_user;
DROP TABLE tbl_user;
SELECT seq_user.nextval
FROM dual;

CREATE TABLE TBL_USER(
   USER_NUMBER NUMBER,
   USER_ID VARCHAR2(100),
   USER_PW VARCHAR2(100),
   USER_NAME VARCHAR2(100),
   USER_AGE NUMBER,
   USER_GENDER CHAR(1) DEFAULT 'M' NOT NULL,
   USER_BIRTH DATE,
   CONSTRAINT PK_USER PRIMARY KEY(USER_NUMBER)
);

SELECT * FROM TBL_USER;

CREATE SEQUENCE SEQ_USER NOCACHE NOCYCLE;

INSERT INTO TBL_USER(USER_NUMBER, USER_ID, USER_PW, USER_NAME, USER_AGE, USER_BIRTH)
VALUES(SEQ_USER.NEXTVAL, 'test', '1234', '유리', 5, to_date('2026-01-10', 'yyyy-mm-dd'));

SELECT * FROM tbl_user;

SELECT user_number FROM TBL_USER WHERE USER_ID = 'test';

SELECT user_name FROM tbl_user WHERE user_id = 'test' AND user_pw = '1234';

-- 아이디 찾기 쿼리문(이름, 생일)
SELECT user_id FROM tbl_user WHERE user_name = ? AND user_birth = ?;
-- user_birth가 "YYYY-MM-DD" 형식인 경우
-- SQL문에서 TO_DATE(?, 'YYYY-MM-DD') 형식으로 작성한다
-- JAVA 코드에서는 java.sql.Date.valueOf(userBirth) 형식으로 작성한다

SELECT * FROM tbl_user;

INSERT INTO tbl_user
--values(seq_user.nextval, 'test1', 'qwer', '철수', 5, 'M', sysdate);
--values(seq_user.nextval, 'test2', 'abc', '철수', 5, 'M', sysdate);
values(seq_user.nextval, 'test3', '1234', '짱구', 5, 'M', to_date('2000-01-01', 'yyyy-mm-dd'));







