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

select * from emp
where ename like "%a%"
order by hiredate;

select * from emp
where ename like "m%"
and job = "SALESMAN";

select ename, sal from emp
where ename like "%r"
and job in("SALESMAN", "MANAGER");

select ename, job, sal from  emp
where ename like "______";

select ename, job, hiredate from emp
where ename like "_m%";

select * from emp
order by hiredate asc, sal desc;

select * from emp
order by comm desc, job desc;

select * from emp
where deptno = 30
order by job asc, sal desc;

select * from emp
where sal between 1000 and 3000
order by hiredate, ename asc;

select * from emp
where job = "SALESMAN"
order by comm desc
limit 5;

select * from emp
where deptno = 30
order by hiredate asc
limit 3;

select ename, job, sal from emp
order by sal asc
limit 5;

select * from emp   
where deptno = 20
order by sal asc
limit 3;

select * from emp
where deptno in (10, 20)
order by sal asc
limit 3;
