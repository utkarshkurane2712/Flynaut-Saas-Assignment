show databases;
use flynaut;
show tables;
select * from emp;

select upper(ename) as employee_name, job
from emp;

select ename, round(sal, 1) as rounded_salary
from emp;

select ename, sqrt(sal) as salary_sqrt
from emp
where sal > 1000;

select ename, format(sal, 2) as formatted_salary
from emp;

select substr(ename, 1, 3) as short_name
from emp;

select rtrim(ltrim(ename)) || '.' as formatted_name
from emp;

select ename, length(ename) as name_length
from emp;

select ename, sal
from emp
where sal > 1500 and sal <= 3000;

create table department (
    deptno int primary key,
    dname varchar(50),
    location varchar(50)
);

alter table emp
add age int;

alter table emp
modify sal decimal(10,2);

drop table department;

truncate table emp;





