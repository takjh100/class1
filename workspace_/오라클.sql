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

--11월 13일 수업

select * from emp
 where sal >= 2000
   and sal < 3000;
--봉급이 2000이상이고 3000미만인 사원 출력

select *from emp
 where sal != 3000;
 
select * from emp
 where sal <> 3000;

--문제1. 부서번호가 20이 아닌 목록 
select * from emp
 where deptno != 20;

--문제2. 부서번호가 20도 아니고 10도 아닌 목록
select * from emp
 where deptno != 20
   and deptno != 10;

--문제3. 부서번호가 30이면서 봉급 2000이하인 목록  
select * from emp
 where deptno = 30
   and sal <= 2000;

select * from emp
where 
  not sal = 3000;

--2000미만 또는 3000 이상 출력
select * from emp
where 
   sal < 2000 or sal >= 3000;

--2000이상 그리고 3000 미만이 아닌 것
select * from emp
 where 
  not (sal >= 2000 and sal < 3000);

select * from emp
where job = 'MANAGER'
   or job = 'SALESMAN'
   or job = 'CLERK';

select * from emp
where 
   job in ('MANAGER','SALESMAN','CLERK');

select * from emp
where 
   job not in ('MANAGER','SALESMAN','CLERK');

select * from emp
where deptno in (10,20);

select * from emp
where deptno not in (10,20);

select * from emp
where sal between 2000 and 3000;
-- sal >= 2000 and sal <= 3000

select * from emp
where sal not between 2000 and 3000;

select * from emp
where ename like 'S%';
--S로 시작하는 사원이름 출력

select * from emp
where ename like '%A%';
--시작, 끝, 중간에 관계없이 A를 포함한 모든 것

select * from emp
where ename like '_L%';
--두번째 글자가 L인 사원이름을 출력
--_(언더스코어,언더바)는 어떤 글자는 한글자

--112p Q 사원 이름에 AM이 포함되어있지 않은 사원 테이터 출력
select * from emp
where ename not like '%AM%';

--113p
select * from some_table
where some_column like 'A\_A%' escape '\';
--위와같이 사용할시 \뒤에오는 한글자는 글자로 인식해서 출력한다 

select * from emp
where comm <= 400;

select * from emp
where comm is null;

select *
from emp
where sal > null;
--null은 아무것도 없는 상태,비교나 연산을 할 수 없다. 

select * from emp
where mgr is null;

select *
from emp
where sal > null
 or comm is null; 

select * from emp
where deptno = 10
union
select * from emp
where deptno = 20;

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 20;


select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal
from emp
where deptno = 20;
--컬럼의 개수가 달라서 에러

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select ename, empno, sal, deptno
from emp
where deptno = 20;
--empno와 ename의 위치를 바꿈
--숫자,문자의 위치가 맞지않을시 에러

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select sal, ename, sal, deptno
from emp
where deptno = 20;
--숫자,문자등 타입이 같다면 출력
--컬럼의 의미는 신경쓰지 않는다

select empno, ename, sal, deptno
from emp
where deptno = 10
union
select empno, ename, sal, deptno
from emp
where deptno = 10;
--한줄의 모든 내용이 중복되는 경우가 있으면 중복을 제거하고 출력

select empno, ename, sal, deptno
from emp
where deptno = 10
union all
select empno, ename, sal, deptno
from emp
where deptno = 10;
--union all 사용시 중복에 관계없이 모든 줄을 표시

--125p 
--Q1
select * from emp
where ename like '%S';
--Q2
select empno, ename, job, sal, deptno
from emp
where deptno = 30 and job = 'SALESMAN';
--Q3
select empno, ename, job, sal, deptno
from emp
 where 
   deptno in (20,30)
  and sal > 2000; 

select empno, ename, job, sal, deptno
from emp
 where 
   deptno = 20 and sal > 2000
 union
select empno, ename, job, sal, deptno
from emp
 where 
   deptno = 30 and sal > 2000; 

--Q4
select * from emp
where not (sal >= 2000 and sal <= 3000);

--Q5
select ename, empno, sal, deptno
from emp
where ename like '%E%'
  and deptno = 30 and not (sal > 1000 and sal < 2000);
  
--Q6  
select * from emp
where comm is null
and mgr is not null
and job in('MANAGER', 'CLERK')
and ename not like '_L%';

select * from dual;

select upper('abcD')
from dual;
--값을 대문자로 출력
select lower('abcD')
from dual;
--값을 소문자로 출력
select lower(ename) from emp;
select upper(ename) from emp;
select upper( lower(ename) ) from emp;

select * from emp
where ename like '%A%' or ename like '%a%';
--대소문자 구분없이 검색할 경우

select * from emp
where lower(ename) like '%a%';

select ename, length(ename)
from emp;
--length : 문자 개수 

select length('abc'), length('한글') from dual;

select ename, length(ename) from emp
where length(ename) >= 5;

select length('한'), lengthb('한') from dual;

select '123456', substr ('123456', 3, 2) from dual;

select '123456', substr ('123456', 2, 3) from dual;

select 
   job, 
   substr (job, 1, 2), 
   substr (job, 0, 2),
   substr (job, -1, 3), 
   substr (job, 4),
   substr (job, 4, 100),
   substr (job, 44, 100),
   length (substr (job, 4)),
   substr (job, -3)
   
  from emp;

--135p Q
select substr(ename,3) from emp;

select substr (1234,2) from dual;

select '010-1234-5678' as REPLACE_BEFORE,
  replace('010-1234-5678','-',' ') as replace_1,
  replace('010-1234-5678','-') as replace_2,
  replace('010-1234-5678','-','**') as replace_3
  
 from dual;  
 
select replace (ename,'A','😊')
 from emp;


--문제1. ename에서 앞에 두글자만 출력
select 
   ename,
   substr (ename,1,2)
from emp;

--문제2.ename에서 앞에 두글자만 **로 처리
select 
  ename,
  replace (ename,substr (ename,1,2),'**')
from emp;

--문제3.ename의 반절에 해당하는 길이 출력
select length(ename)/2
from emp;

--문제3-1.ename의 앞에서 반절 모두 **로 처리
select 
  ename,
  replace 
  (ename,
  substr(ename,1,length(ename)/2),
  '*')
from emp;

--문제3-2.ename의 뒤의 반절 모두 *로 처리
select 
ename,
   replace 
  (ename,
   substr(ename,-length(ename)/2),
   '*')
from emp;

select 'oracle',
  lpad('oracle',10,'#'),
  rpad('oracle',10,'*'),
  lpad('oracle',10),
  rpad('oracle',10),
  lpad('oracle',3)
 from dual; 
 
select 
  rpad ('971225-',14,'*'),
  rpad('010-1234-',13,'*')
 from dual; 

select 
   ename,
   rpad (ename,6,'*')
from emp;   
--이름을 6자리로 만들고 빈 공간의 오른쪽을 *로 채운다

select
  ename,
  lpad (ename, length(ename)*2, '*')
from emp;
--이름글자 수의 2배가 되게 만들고 빈 공간의 왼쪽을 *로 채운다

--문제. 전화번호 뒤 4자리를 *로 바꾸자. 단, replace 쓰지 말고
select '010-6237-1809',
rpad ('010-6237-1809',length ('010-6237-1809')+4,'*')
from dual;
--뒤 4자리를 *로 바꾸기위해 rpad를 사용 
--rpad (전화번호,전체자리수에서 4를 뺀 수,'*')

--문제2. 사원의 이름을 앞에 두글자만 보이게하고 나머지 *로 표시,replace 쓰지 말고
select ename,
  length (ename),
substr (ename,1,2),
rpad (substr (ename,1,2),length (ename),'*')
from emp;

--문제3. 사원의 이름의 앞글자 하나만 *로 표시. 단,replace 쓰지 말고
select
ename,
substr (ename,2,length (ename)),
length (ename),
lpad (substr (ename,2,length (ename)),length (ename),'*')
from emp;

--심화문제. job을 대상으로 20자크기의 공간에서 가운데 정렬
select
lpad (job,
((20-length (job))/2)+length (job),
'*'),
rpad (lpad (job,((20-length (job))/2)+length (job),'*'),
20
,'*')
from emp;
--lpad 를 사용해 *******CLERK 를 먼저 추출하려면 job글자를 포함하여 정렬됬을때 앞공백의
--자리수를 구해야한다 전체 자리수의 반인 20/2에서 글자수의 절반을 뺀 후에 job의 글자수를 더하면
--lpad를 사용했을때 필요한 글자수를 알수있다 
--lpad (중간에 정렬하게될 job,20/2-job글자수/2+job글자수)를 
--출력하게되면 *******CLERK가 출력된다
--*******CLERK가 나오는 수식을 rpad를 이용해  20자리가 되게 *******CLERK이후 공백을 만든다
--rpad (lpad (중간에 정렬하게될 job,20/2-job글자수/2+job글자수),총글자수,'*'(변환될 기호))
--사용시 *******CLERK********가 출력된다.

/*또다른 예시 job문자를 반으로 나눈후 왼쪽,오른쪽을 출력
select
rpad(lpad (substr(job, 0, length(job)/2), 10, '*')
, 20,
rpad(substr(job, length(job)/2+1), 10, '*'))
from emp;*/

select empno,ename, 
concat(empno,ename)
from emp;

select empno|| ' : ' || ename
from emp;

select 
   '   a  b  cd     ',
   trim('   a  b  cd     ')   
 from emp;
-- trim 앞뒤 공백문자 제거, 단 ,글씨 사이의 공백은 제거하지 않음

--내볼까했던 문제.ename에 두번째 글자만 *처리

select round(1234.5678) as ROUND, /*round에 두번째 자리를 비울경우 소수점자리부터*/
       round(1234.5678,2) as ROUND_1,/*소수점 두번째까지 반올림하여출력*/
       round(1234.5678,-2) as ROUND_MINUS2/*정수 두번째까지 반올림하여 출력*/
   from dual;    
   
select trunc (1234.5678),
       trunc (1234.5678,2), 
       trunc (1234.5678,-2),
       trunc (-1234.5678)
    from dual;   

select ceil(3.14), /*올림-3.14보다 작은 정수 중 가장 큰 정수*/
       floor(3.14),/*내림-3.14보다 큰 정수 중 가장 작은 정수*/
       ceil(-3.14),
       floor(-3.14)
   from dual;    
   
select 
    mod(15,6)/*첫번째에 두번째수를 나눈 후 나머지를 출력*/
 /*값은 나눈수를 넘지 못한다*/
  from dual;
  
select 
    sysdate,
    sysdate+1,
    sysdate-1
  from dual;
 
select empno, ename, hiredate,
  add_months(hiredate,120)
  from emp;
  
select 
   empno,
   empno+ '500'
from emp;
--컬럼에 +를 적으면 모두 숫자로 변경해서 적용

select to_char(sysdate, 'mon yyyy/mm/dd hh24;mi;ss'),
to_char(sysdate, 'yyyy"년"mm"월"dd"일" hh24"시"mi"분"ss"초"')
from emp;

select to_char (
      to_date('2024/11/15','yyyy/mm/dd'), 'yyyy/mm/dd')
from dual;

select 
  to_date('2024/11/15','yyyy/mm/dd') - to_date('1996/12/13','yyyy/mm/dd')
from dual;  

select * 
  from emp
  where hiredate > to_date('1981-06-01','yyyy-mm-dd');
  
select comm, sal, comm + sal,
    nvl(comm,0),
    nvl(comm,0) +sal
from emp;

select comm, sal,
  nvl2 (comm, '0','x')
  from emp;

select job, sal,
    decode (job,
        'MANAGER', sal*1.1,
        'SALESMAN', sal*1.05,
        'ANALYST',sal,
        'CLERK',sal*1.2,
        sal*1.03) as UPSAL
from emp;   

--이름,봉급,추가수당,봉급+추가수당(decode로)
select ename, sal, comm,
   sal+ decode (comm,
               null,0,
               comm)
from emp;   

select empno,ename,job,sal,
case job
    when 'MANAGER' then sal*1.1
    when 'SALESMAN'then sal*1.05
    when 'ANALYST' then sal
    else sal*1.03
end UPSAL
from emp;

select empno, ename, comm,
   case
   when comm is null then '해당사항 없음'
   when comm = 0 then 'N/A'
   when comm > 0 then '수당:'|| comm
   end as comm_text
   from emp;

select empno, ename, comm,
   case 
   when comm is null then 'N/A'
   else ''||comm
 end
from emp;

--174p Q1  
select empno,
   replace(empno,substr(empno,3),'**') as MASKING_EMPNO, 
   ename,
   rpad (substr(ename,1,1), length(ename), '*') as MASKING_EMAVE
from emp;
/*empno에서 substr를 사용하여 앞 2자리를 제외한 3자리부터 끝까지를 지정해서
replace에 두번째 자리에 넣은후 '**'으로 변경한다*/
/*ename의 첫번째 자리의 글짜를 sudstr을 사용하여 출력한후 length로 전체글자수를
rpad의 두번쨰 자리에 넣고 ename의 나머지글자를 '*'로 츨력*/

--174p Q2
select empno, ename,sal,
    trunc(sal/21.5,2) as DAY_PAY,
    round((sal/21.5)/8, 1) as TIME_PAY
from emp;

--175p Q3
select empno,ename,hiredate,
    next_day (add_months(hiredate,3),'월요일')as R_JOB,
    case
    when comm is null then 'N/A'
    else ''||comm
    end as COMM
from emp;

--175p Q4
select empno, ename,mgr,
 case
   when mgr is null then '0000'
   when mgr like '75%' then '5555'
   when mgr like '76%' then '6666'
   when mgr like '77%' then '7777'
   when substr(mgr,1,2)= '78' then '8888'
   else ''||mgr
 end as chg_mgr,
/*in을 사용하여 간단하게 코딩*/
/*두번째 MGR이 5,6,7,8일때 처리*/
  case
    when mgr is null then '0000'
      when substr(mgr,2,1) in ('5','6','7','8')
 then lpad(substr(mgr,2,1), length(mgr),substr(mgr,2,1))
 else ''||mgr
 end cng_mge2   
from emp; 

select sum(comm) from emp;
select sum(sal) from emp;
select sum(sal+nvl(comm,0)) from emp;

--count도 sum처럼 null을 제외함
--count에는 *를 많이씀
select count(*), count(sal),count(comm) 
from emp;

--다중행 함수는 다중행 함수끼리만 출력해야한다
select count(*),sum(sal)/*, sal*/ from emp;

select count(*) from emp
where deptno =30
and comm is not null;

select max (sal), max(ename), min(sal), min(hiredate), min(comm) 
from emp;

select count(*) 
from emp
where ename like '%A%';

select max(sal) from emp;

--where에는 다중행 함수(집계함수)를 사용할 수 없음
/*select * from emp
where max(sal);*/

select avg(sal) from emp;
--AVG는 평균값을 출력

select '10',sum(sal),avg(sal) from emp where deptno=10
union all
select '20',sum(sal),avg(sal) from emp where deptno=20
union all
select '30',sum(sal),avg(sal) from emp where deptno=30;

select deptno,avg(sal),sum(sal),count(*)
from emp
group by deptno;

select deptno, job,avg(sal),sum(sal),count(*)
from emp
group by deptno, job
order by deptno, job;

-- 순서
/* 5 */ select job, count(*) as cnt
/* 1 */ from emp
/* 2 */ where sal > 1000 /*and cnt > 3*/
/* 3 */ group by job
/* 4 */ having count(*) >= 3
/* 6 */ order by cnt desc;

--194p Q
select deptno, job, avg(sal)
from emp
group by deptno, job
having avg(sal) >= 500
order by deptno, job;

--212p
--Q1
select deptno, floor(avg(sal)) avg_sal, max(sal)max_sal,min(sal)min_sal,count(*) as cut
from emp
group by deptno;

--Q2
select job, count(*)
from emp
group by job
having count(*) >= 3;

/*추가문제1 
   1981년에 입사한 사원 중에서
   급여가 가장 낮은 사원의 급여를 조회하세요
*/
select min(sal) from emp
where 
   hiredate >= to_date('1981-01-01', 'yyyy-mm-dd')
   and hiredate >= to_date('1981-12-31', 'yyyy-mm-dd')
   
   or to_char(hiredate,'yyyy')= '1981';
   
   
/*추가문제2
   각 부서별로 급여가
   가장 높은 사원과 가장 낮은 사원의 급여차이를 조회하세요*/
   
select deptno, max(sal)- min(sal)
from emp
group by deptno;

select *
from emp, dept
order by empno;

select *
from emp, dept
where emp.deptno = dept.deptno
order by empno;

select *
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select ename, e.deptno
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select ename, e.deptno, e.*, d.*
from emp e, dept d
where e.deptno = d.deptno
order by empno;

select * 
from salgrade;

select e.ename, e.sal, s.grade 
from emp e , salgrade s
 where e.sal >= s.losal 
  and e.sal <= s.hisal;

select e1.ename, e1.mgr, e2.ename, e2.empno,e2.mgr
from emp e1,emp e2
where e1.mgr =e2.empno;
  
select e1.ename, e1.mgr, e2.ename, e2.empno,e2.mgr, e3.ename, e3.empno
from emp e1,emp e2,emp e3
where e1.mgr =e2.empno
and e2.mgr = e3.empno;

select e1.ename, e1.mgr, e2.ename, e2.empno
from emp e1,emp e2
where e1.mgr =e2.empno(+);

select e1.ename, e1.mgr, e2.ename, e2.empno
from emp e1,emp e2
where e1.mgr(+) =e2.empno;

select deptno, emp.ename
from emp join dept using (deptno);
--using은 둘다 같은 컬럼명을 사용하는 경우에만 사용할 수 있다.

select *
from emp e join dept d on (e.deptno=d.deptno)
where sal <= 3000;
--테이블 조인 조건을 on으로 분리시킨다

select *
from emp e1 join emp e2 on (e1.mgr = e2.empno);
--on은 컬럼명이 다른경우에도 사용이 가능하다

select *
from emp e1 left outer join emp e2 on (e1.mgr = e2.empno);

select *
from emp e1 
left outer join emp e2 on (e1.mgr = e2.empno)
left outer join emp e3 on (e2.mgr = e3.empno);

--Q1
select e.deptno, d.dname, e.empno, e.ename, e.sal 
from emp e,dept d
where e.deptno = d.deptno
and sal > 2000
order by deptno;

--Q2
select e.deptno, dname, floor(avg(sal)), max(sal), min(sal),count(*)
from emp e left outer join dept d on (e.deptno = d.deptno)
group by e.deptno, dname;

--Q3
select d.deptno, dname, empno, ename, job, sal
from emp e right outer join dept d on (e.deptno = d.deptno)
order by d.deptno, dname, ename;


--추가문제1
--사원번호,이름,부서명,급여등급 출력 :14줄
select empno, ename, d.dname, s.grade
from  emp e
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.deptno = d.deptno)
where e.sal >= s.losal 
  and e.sal <= s.hisal;
  

--추가문제2
--상사보다 월급이 높은 사원의 이름,급여,상사이름,상사급여
select e1.ename, e1.sal, e2.ename, e2.sal
from emp e1 left outer join emp e2 on (e1.mgr= e2.empno)
where e1.sal > e2.sal;

select e1.ename,e1.mgr, e1.sal, e2.ename,e2.empno, e2.sal
from emp e1 left outer join emp e2 on (e1.mgr= e2.empno) ;


select ename, sal
from emp
where sal > (select sal
             from emp 
             where ename= 'JONES');
             
--BLAKE보다 높은 연봉을 받는 사람목록 출력             
select sal 
             from emp
             where ename like 'BLAKE';
             
select *
from emp 
where sal > (select sal 
             from emp
             where ename like 'BLAKE');

--JONES랑 같은 job을 가진 사람들
select *
from emp 
where job = (select job 
             from emp
             where ename like 'JONES');

select job 
             from emp
             where ename like 'JONES';

select * 
from (
      select empno, deptno, ename from emp
      where deptno = 10
);             

select *
from (select rownum as rnum, emp.* 
from emp)
where rnum = 3;

select rownum as rnum, a.*
from(
    select *
    from emp
    order by ename 
    ) a
where rnum = 3;   
    

select job, count(*) from emp
group by job
having count(*) >= 3;

select *
from(
select job, count(*) as cnt from emp
group by job
)
where cnt >= 3;

with e10 as (
   select * from emp where deptno = 10
)
select * from e10;

--262p Q1
select job 
from emp
where ename= 'ALLEN';

select e.job, e.empno, e.ename, e.sal, e.deptno, d.dname
from emp e, dept d
where job = (
select job 
from emp
where ename= 'ALLEN'
)
and e.deptno = d.deptno
order by e.sal desc, ename asc;

--Q2
select avg(sal)
from emp; 


select *
from emp
where sal > (select avg(sal)
from emp);

select e.empno, e.ename, d.dname, e.hiredate, d.loc, e.sal, s.grade
from emp e 
left outer join dept d on (e.deptno = d.deptno)
left outer join salgrade s on (e.sal >= losal and e.sal <= hisal)
where sal > (select avg(sal) from emp)
order by sal desc,empno;

--Q3

select *
from emp
where deptno = 10;

select *
from emp
where deptno = 30;

with
e10 as (select * from emp where deptno = 10),
e30 as (select * from emp where deptno = 30);

select empno, ename, job, d.deptno, dname, loc
from emp e
left outer join dept d on (e.deptno = d.deptno)
where e.deptno = 10
and e.job not in (select job from emp where deptno = 30);

--문항1
select ename,replace(empno,substr(empno,3),'**')
from emp 
order by empno desc;


select ename,rpad(substr(empno,1,2),length(empno),'*')
from emp
order by empno desc;

--문항2
select empno, ename, dname, loc
from emp join dept using(deptno)
order by dname desc;






