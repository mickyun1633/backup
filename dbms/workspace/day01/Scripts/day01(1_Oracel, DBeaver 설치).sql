-- 1번 : 주석과 employees 테이블
-- 한줄 주석 : 컴퓨터가 해석하지 않는다
-- 실행시키지 않고 설명을 작성할 때 사용한다

/* employees 테이블
 * 107개의 행과 11개의 컬럼으로 이루어져있다
 * 107명의 직원 데이터를 저장해 놓은 연습용 테이블
 * 
 * 11개의 컬럼
 * EMPLOYEE_ID   직원ID
 * FIRST_NAME   이름
 * LAST_NAME   성
 * EMAIL      이메일
 * PHONE_NUMBER   전화번호
 * HIRE_DATE   입사일
 * JOB_ID      직무ID
 * SALARY      급여
 * COMMISSION_PCT 커미션 비율
 * MENAGER_ID   상사직원의 ID
 * DEPARTMENT_ID 부서ID
 * 
 */

-- SELECT 컬럼명 FROM 테이블명;
-- 해당 테이블에서 특정 컬럼을 선택해서 조회하겠다는 의미
-- 컬럼명 자리에 *를 쓰면 모든 컬럼을 의미
SELECT *       -- 2) 모든 컬럼을 조회하겠다
FROM EMPLOYEES; -- 1) EMPLOYEES 테이블에서

-- HR.테이블명으로 작성하는 이유는 여러 계정의 같은 이름의 테이블이름이 존재할 수 있기 때문이다
-- 지금 로그인한 계정의 테이블의 우선순위가 높기 때문에 일반적으로 계정명은 생략이 가능하다
SELECT first_name FROM employees;
SELECT first_name FROM hr.employees;

-- 아래 2개의 결과는 다르다
-- SELECT 뒤에 작성된 컬럼명 대로 Result 테이블에 표시된다
-- 컬럼 조회시 순서가 중요하다
SELECT first_name, LAST_NAME
FROM employees;

SELECT LAST_NAME, FIRST_NAME -- 2) LAST_NAME, FIRST_NAME 컬럼을 조회하겠다
FROM EMPLOYEES; --1) employees 테이블에서















