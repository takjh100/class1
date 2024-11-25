select * from emp;
desc emp;

select * from dept;
desc dept;

select * from salgrade;
desc salgrade;

select empno, ename, deptno
from emp;

select empno, ename, sal
  from emp;

select deptno
  from emp;
  
select distinct deptno
  from emp;
  
select job
 from emp;
 
select 
    distinct/*중복 제거*/ job
 from emp;

/*[범위주석]
아무거나 
심지어 여러줄*/  

-- 한줄 전체 주석

--단축키 [Ctel + /]

select 
    distinct job, deptno
from emp;

select ename, sal, sal*12+comm, comm
from emp;

select ename, sal, sal*12+comm as 연봉, comm
from emp;
--as는 생략가능

select ename, sal, sal*12+comm "올해 연봉", comm
from emp;

select * from emp
order by sal asc;
--asc는 생략가능

select * from emp
order by sal desc;

select * from emp
order by ename asc;

select * from emp
order by job;

select * from emp
order by job asc, sal asc;

select * from emp
order by sal asc, job asc;

--92p Q2
select 
   distinct job 
from emp;

--Q3
select * 
from emp
order by deptno desc, ename asc;

select empno EMPLOYEE_NO, ename employee_name, mgr manager,
sal salary, comm commission, deptno department_no  
from emp
order by deptno desc, ename asc;

select * from emp
where deptno = 30;

--95p Q
select * from emp
where empno = 7782;

select * from emp
where 
   deptno = 30 and job = 'SALESMAN';

select * from emp
where 
   deptno = 30 or job = 'CLERK';
   
select * from emp
where 
   empno = 7499 and deptno = 30;

select * from emp
where 
   deptno = 20 or job = 'SALESMAN';

select * from emp
where
   ename = 'WARD' or (job = 'CLERK' and deptno = 20);
--and 와 or 동시에 사용할 경우 and 앞뒤로 붙어있는 조건부터 사용됨   

select * from emp
where sal * 12 = 36000;

select * from emp
where 36000/12 = sal;

select * from emp
where sal > 3000;

select * from emp
where sal <= 2000
order by sal;

--102p Q
select * from emp
where sal >= 2500 and job = 'ANALYST';


select *
from emp
where sal > null;
 
select *
from emp
where sal > null
 or comm is null; 



