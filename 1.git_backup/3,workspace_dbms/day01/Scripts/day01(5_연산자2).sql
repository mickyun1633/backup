- 5번 : 연산자

-- (3) 관계 연산자(비교 연산자) (>, <, >=, <=, =, !=, <>)

/*
 * SELECT [DISTINCT] 컬럼명 [AS 별칭]
 * FROM 테이블명
 * WHERE 조건식 -- 관계연산자/논리연산자(행을 필터링)
 * ORDER BY 정렬할기준컬럼명 [ASC | DESC];
 * 
 * 실행순서 : FROM -> WHERE -> SELECT -> ORDER BY
 * 작성순서 : SELECT -> FROM -> WHERE -> ORDER BY
 * 
 * */

-- 직원의 이름, 성, 급여 조회하기
SELECT first_name 이름, last_name 성, SALARY 급여
FROM employees
WHERE salary >= 10000
ORDER BY 급여;

-- 이름이 David인 사람의 이름과 급여만 조회하기
selEct first_name, salary
FROM employees
WHERE first_name = 'David';
-- SQL은 기본적으로 대소문자를 구분하지 않지만 값(데이터)으로 들어갈 때는 대소문자를 구분한다!!!

-- (4) 논리 연산자(AND, OR, NOT)
-- 피 연산자 자리에 조건이 온다
-- 여러개의 조건을 연결할 때 사용한다

-- employees 테이블에서 부서(department_id)번호가 영업부서(80)이면서 급여가 10000이상인 직원들의
-- 이름, 성, 급여, 부서ID를 급여 오름차순으로 조회
SELECT first_name 이름, last_name 성, salary 급여, department_id 부서ID
FROM EMPLOYEES 
WHERE salary >= 10000 AND department_id = 80
ORDER BY 급여;


-- 1. 급여가 5000이상이고 직무ID가 SA_MAN인 직원 조회
--   직원의 이름과 성은 이름이라는 별칭으로 연결해서 출력하되 급여 기준으로 오름차순 정렬되도록
-- 조건1 : 급여(salary) >= 5000
-- 조건2 : 직무ID(job_id) = 'SA_MAN'
-- AND 연산자 사용

-- 실행순서 FROM -> WHERE -> SELECT -> ORDER BY

SELECT first_name || ' ' || last_name 이름, salary 급여, job_id 직무ID
FROM employees
WHERE salary >= 5000 AND job_id = 'SA_MAN'
ORDER BY 급여;


-- 2. 부서ID가 60이거나 급여가 4000이하인 직원 조회
--   직원의 이름, 전화번호, 입사일을 출력하되 입사일 기준으로 내림차순 정렬되도록
--   부서ID : department_id
--   입사일 : hire_date
--   전화번호 : phone_number

-- 조건1 : department_id = 60
-- 조건2 : salary <= 4000
-- OR 연산자

SELECT first_name 이름, phone_number 전화번호, hire_date 입사일, department_id, salary
FROM employees
WHERE department_id = 60 OR salary <= 4000
ORDER BY hire_date DESC;

-- 3. MANAGER_ID가 존재하지 않는 직원들을 조회
--   직원의 이름과 성은 직원명이라는 별칭으로 연결하여 출력

SELECT first_name || ' ' || last_name 직원명
FROM employees
WHERE MANAGER_ID = NULL;

SELECT * FROM employees;

-- NULL : 값이 없음을 나타내는 값
-- NULL은 관계 연산자로 연산이 불가능하다
-- NULL 연산자를 사용해야한다 IS NULL, IS NOT NULL
SELECT first_name || ' ' || last_name 직원명
FROM employees
WHERE MANAGER_ID IS NULL;















