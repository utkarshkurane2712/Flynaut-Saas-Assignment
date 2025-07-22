show databases;
use flynaut;
show tables;
select * from emp;

select distinct job from emp;
select distinct comm from emp;
select count( distinct mgr) as Manager_count from emp;
select distinct sal, comm from emp;
select distinct deptno, job from emp;

select job, sum(sal) as total_salary, avg(sal) as average_salary
from emp
group by job;

select max(sal) as highest_salary_with_commission
from emp
where comm is not null;

select count(*) as employees_above_average_salary
from emp
where sal > (select avg(sal) from emp);

select sum(sal) as total_salary_under_mgr_7839
from emp
where mgr = 7839;

select deptno, min(hiredate) as earliest_hire_date
from emp
group by deptno;


select deptno, job, count(*) as employee_count
from emp
group by deptno, job;

select mgr, sum(sal) as total_salary
from emp
group by mgr;

select deptno, job, avg(sal) as average_salary
from emp
group by deptno, job
having count(*) > 3;

select deptno
from emp
group by deptno
having max(sal) > 2000;

select mgr, sum(sal) as total_salary, count(*) as employee_count
from emp
group by mgr;






