show databases;
use flynaut;
show tables;
select * from emp;

select empno, ename, sal from emp;  
select ename, sal from emp where job = "SALESMAN";
select ename, job, sal from emp where deptno = 30;
select ename, job from emp where job = "MANAGER" or job = "CLERK";
select ename, comm from emp where comm is not null;
select ename, job from emp where job = "MANAGER";
select ename, sal from emp where sal > 1500;
select ename, hiredate from emp where hiredate between "1981-04-01" and "1981-05-01";
select ename, sal from emp where comm is not null;
select ename from emp where ename like "s%";
select ename, sal from emp where sal != 5000; 
select ename, hiredate from emp where hiredate >= "1981-12-01";
select ename, sal from emp where sal between 1000 and 3000;
select ename, job, sal from emp where job = "SALESMAN" and sal > 1200;





