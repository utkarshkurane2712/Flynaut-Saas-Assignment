show databases;
use flynaut;
select * from emp;

select * from emp
where hiredate between "1982-01-01" and "1983-12-31"
and sal between 1000 and 3000;

select ename, job, sal from emp
where hiredate between "1981-02-01" and "1981-03-01"
order by hiredate;

select * from emp
where mgr between 7698 and 7839
and sal between 1000 and 2000;

select * from emp
where hiredate between "1981-12-01" and "1982-01-31"
and comm between 0 and 500;

select * from emp
where deptno = 20
and hiredate between '1981-01-01' and '1981-12-31'
and sal between 1000 and 3000;

select * from emp
where job in ("CLERK", "MANAGER", "SALESMAN")
and sal > 1000;

select * from emp
where deptno in (10,20,30)
and comm is not null; 

select * from emp
where mgr in ("7839","7698","7788")
and job in ("CLERK","ANALYST");

select ename, job, sal from emp
where hiredate in ("1981-09-08", "1981-02-20","1981-12-03");

select * from emp
where sal in (1250, 3000, 1600, 1100)
and job = "SALESMAN";

select * from emp
where comm is null
and sal > 1000;

select ename, job, sal from emp
where mgr is null
and comm is null;

select * from emp
where sal is null
order by hiredate;

select * from emp
where comm is null
and hiredate > "1982-01-01";

select * from emp
where sal is null
and sal between 1000 and 3000;

