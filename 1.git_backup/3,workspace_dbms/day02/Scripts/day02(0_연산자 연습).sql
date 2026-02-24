-- SQL 연산자 / 조건절 연습문제
-- 테이블 : EMPLOYEES

-- 힌트
-- 총 보상 : NVL, NVL2, COALESCE 함수 사용
-- 급여컬럼명 * 12 + (급여컬럼 * commission_pct * 12)

SELECT * FROM EMPLOYEES;

-- 1번: 모든 직원의 이름(이름+성), 급여, 커미션, 커미션 포함 연봉을 총보상으로 출력 (NULL은 0 처리)
SELECT first_name || ' ' || last_name AS 직원이름, salary AS 급여, NVL(commission_pct, 0) AS 커미션,
salary * 12 + (salary * NVL(commission_pct, 0) * 12) AS 총보상
FROM EMPLOYEES;

SELECT * FROM EMPLOYEES;

-- 2번: 직원번호와 이메일을 연결해 직원번호_이메일로 출력 (직원번호, 이메일, 급여 조회)
SELECT employee_id || '_' || email AS 직원번호_이메일, salary AS 급여, employee_id AS 직원번호
FROM EMPLOYEES;

SELECT * FROM EMPLOYEES;

-- 3번: 급여가 7000 초과인 직원의 직원번호, 이름, 급여, 입사일 조회
SELECT employee_id AS 직원번호, first_name AS 이름, salary AS 급여, hire_date 입사일
FROM EMPLOYEES
WHERE salary > 7000
ORDER BY 급여;

SELECT * FROM EMPLOYEES;

-- 4번: 부서번호가 50번 또는 80번이 아닌 직원의 직원번호, 이름, 급여, 입사일 조회
SELECT department_id 부서번호, employee_id 직원번호, first_name 이름, salary 급여, hire_date 입사일
FROM EMPLOYEES
WHERE department_id NOT IN (50, 80);

SELECT * FROM EMPLOYEES;

-- 5번: 급여가 4000 이상 7500 이하인 직원의 직원번호, 이름, 급여, 입사일 조회
SELECT employee_id 직원번호, first_name 이름, salary 급여, hire_date 입사일
FROM EMPLOYEES
WHERE salary BETWEEN 4000 AND 7500
ORDER BY 직원번호;

SELECT * FROM EMPLOYEES;

-- 6번: 직무ID가 IT_PROG, SA_REP, SA_MAN인 직원의 직원번호, 이름, 급여, 입사일, 직무ID 조회
SELECT employee_id 직원번호, first_name 이름, salary 급여, hire_date 입사일, job_id 직무ID
FROM EMPLOYEES
WHERE job_id IN ('IT_PROG', 'SA_REP', 'SA_MAN')
ORDER BY 직무ID;

SELECT * FROM EMPLOYEES;

-- 7번: 커미션을 받는 직원(commission_pct NOT NULL)의 직원번호, 이름, 급여, 입사일 조회
SELECT employee_id 직원번호, first_name 이름, salary 급여, hire_date 입사일
FROM EMPLOYEES
WHERE commission_pct IS NOT NULL;

SELECT * FROM EMPLOYEES;

-- 8번: 이름에 D와 e가 모두 포함된 직원의 이름, 급여 조회
SELECT first_name 이름, salary 급여
FROM EMPLOYEES
--WHERE first_name LIKE '%D%' AND first_name LIKE '%e%';
WHERE first_name LIKE '%D%e%';

SELECT * FROM EMPLOYEES;

-- 9번: 직무ID가 IT_PROG가 아닌 직원의 직원번호, 이름, 급여, 입사일 조회
SELECT employee_id 직원번호, first_name 이름, salary 급여, hire_date 입사일
FROM EMPLOYEES
WHERE job_id != 'IT_PROG';

SELECT * FROM EMPLOYEES;

-- 10번: 급여가 5000 이상인 직원의 모든 정보 조회
SELECT *
FROM EMPLOYEES
WHERE salary >= 5000;

SELECT * FROM EMPLOYEES;

-- 11번: 부서번호가 30번인 직원의 이름과 입사일 조회
SELECT department_id 부서번호, first_name 이름, hire_date 입사일
FROM EMPLOYEES
WHERE department_id = 30;

SELECT * FROM EMPLOYEES;

-- 12번: 성이 Smith인 직원의 이름과 급여 조회
SELECT first_name 이름, salary 급여
FROM EMPLOYEES
WHERE last_name = 'Smith';

SELECT * FROM EMPLOYEES;

-- 13번: 급여가 3000 미만이거나 10000 이상인 직원의 이름과 급여 조회
SELECT first_name 이름, salary 급여
FROM EMPLOYEES
WHERE salary > 3000 OR salary <= 10000;

SELECT * FROM EMPLOYEES;

-- 14번: 이름이 A로 시작하는 직원의 이름+성을 직원명, 이메일+koreait.com을 이메일로 출력
SELECT first_name || ' ' || last_name 직원명, email || '@' || 'koreait.com' 이메일
FROM EMPLOYEES
WHERE first_name LIKE 'A%';

SELECT * FROM EMPLOYEES;

-- 15번: 성에 o 포함 + 이름 4글자인 직원의 이름, 성, 부서번호 조회
SELECT first_name 이름, last_name 성, department_id 부서번호
FROM EMPLOYEES
WHERE last_name LIKE '%o%' AND LENGTH(first_name) = 4;

SELECT * FROM EMPLOYEES;

-- 16번: 이름이 J로 시작하고 성이 n으로 끝나는 직원의 이름, 성 조회성
SELECT first_name 이름, last_name 성
FROM EMPLOYEES
WHERE first_name LIKE 'J%' AND last_name LIKE '%n';



