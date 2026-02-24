-- 4번 : 제약조건

-- 테이블 레벨 : FK
-- 컬럼 레벨 : NN

-- 유저테이블(제약조건 없음)
CREATE TABLE TBL_USER (
   USER_ID NUMBER,
   USER_NAME VARCHAR2(30),
   USER_GENDER CHAR(1),
   USER_STATUS CHAR(1),
   USER_JOIN_DATE DATE
);

-- 제약조건없는 TBL_USER 회원 3명 추가
INSERT INTO TBL_USER
--VALUES(1, '짱구', 'M', 'Y', SYSDATE);
--VALUES(2, '철수', 'M', 'X', SYSDATE);
--VALUES(3, '유리', 'W', 'O', SYSDATE);
--VALUES(3, '맹구', 'A', 'N', SYSDATE);
VALUES(3, '맹구', 'M', 'N', SYSDATE);

SELECT * FROM TBL_USER;

-- 유저테이블 제약조건O
-- PK, NN, DEFAULT, CHK
CREATE TABLE TBL_USER1(
   USER1_ID NUMBER,
   USER1_NAME VARCHAR2(30) NOT NULL,
   USER1_GENDER CHAR(1),
   USER1_STATUS CHAR(1) DEFAULT 'Y' CONSTRAINT CHK_USER1_STATUS CHECK (USER1_STATUS IN ('Y', 'N')),
   USER1_JOIN_DATE DATE DEFAULT SYSDATE,
   CONSTRAINTS PK_USER1 PRIMARY KEY(USER1_ID)
);

SELECT * FROM TBL_USER1;


-- 정상데이터
INSERT INTO TBL_USER1
VALUES(1, '짱구', 'M', 'Y', SYSDATE);

-- DEFAULT 테스트(일부 데이터만 넣어도 DEFALUT 설정되어 잘 들어감)
INSERT INTO TBL_USER1(USER1_ID, USER1_NAME, USER1_GENDER)
VALUES(2, '철수', 'M');

INSERT INTO TBL_USER1(USER1_ID, USER1_NAME, USER1_GENDER)
VALUES(3, '유리', 'F');

-- PK 중복 : ORA-00001: unique constraint (KDT.PK_USER1) violated
--INSERT INTO TBL_USER1 
--VALUES(1, '맹구', 'M', 'Y', SYSDATE);
-- 1번은 pk(중복 불가, null 불가)
--VALUES (NULL, '맹구', 'M', 'Y', SYSDATE);
-- PK NULL : ORA-01400: cannot insert NULL into ("KDT"."TBL_USER1"."USER1_ID")

-- CHECK 위반
INSERT INTO TBL_USER1
VALUES(5, '치타', 'F', 'X', SYSDATE);
-- CHECK : ORA-02290: check constraint (KDT.CHK_USER1_STATUS) violated

-- NOT NULL 위반
INSERT INTO TBL_USER1
VALUES(5, NULL, 'F', 'Y', SYSDATE);
-- ORA-01400: cannot insert NULL into ("KDT"."TBL_USER1"."USER1_NAME")

SELECT * FROM TBL_USER1;


[김영선 강사] [오후 5:26] -- 4번 : 제약조건

-- 테이블 레벨 : FK
-- 컬럼 레벨 : NN

-- 유저테이블(제약조건 없음)
CREATE TABLE TBL_USER (
   USER_ID NUMBER,
   USER_NAME VARCHAR2(30),
   USER_GENDER CHAR(1),
   USER_STATUS CHAR(1),
   USER_JOIN_DATE DATE
);

-- 제약조건없는 TBL_USER 회원 3명 추가
INSERT INTO TBL_USER
--VALUES(1, '짱구', 'M', 'Y', SYSDATE);
--VALUES(2, '철수', 'M', 'X', SYSDATE);
--VALUES(3, '유리', 'W', 'O', SYSDATE);
--VALUES(3, '맹구', 'A', 'N', SYSDATE);
VALUES(3, '맹구', 'M', 'N', SYSDATE);

SELECT * FROM TBL_USER;

-- [실습]
--쇼핑몰 회원 테이블 TBL_SHOP_USER를 생성하려고 한다.

--회원번호(USER_ID)는 기본키이다.
--회원이름(USER_NAME)은 필수 입력이다.
--회원이메일(EMAIL)은 중복되면 안 된다.
--성별(GENDER)은 'M' 또는 'F'만 허용한다.
--상태(STATUS)는 'Y','N'만 가능하며 기본값은 'Y'이다.
--가입일(JOIN_DATE)은 기본값으로 현재 날짜를 저장한다.

-- 컬럼레벨 : NN, DEFAULT
-- 테이블레벨 : 나머지 제약조건
-- 사용하는 제약조건 : PRIMARY KEY, NN, UK, CHK, DEFAULT

CREATE TABLE TBL_SHOP_USER (
   USER_ID NUMBER,
   USER_NAME VARCHAR2(30) NOT NULL,
   EMAIL VARCHAR2(30),
   GENDER CHAR(1),
   STATUS CHAR(1) DEFAULT 'Y',
   JOIN_DATE DATE DEFAULT SYSDATE,
   

	CONSTRAINT PK_USER_ID PRIMARY KEY(USER_ID),
	CONSTRAINT UK_EMAIL UNIQUE(EMAIL),
	CONSTRAINT CHK_GENDER CHECK (GENDER IN ('M', 'W')),
	CONSTRAINT CHK_STATUS CHECK (STATUS IN ('Y', 'N'))

);

SELECT * FROM TBL_SHOP_USER;

INSERT INTO TBL_SHOP_USER
VALUES(1, '홍길동', 'hong@test.com', 'M', 'Y', sysdata);




























