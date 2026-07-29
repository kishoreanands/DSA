1# Write your MySQL query statement below
2SELECT Department,Employee,Salary from(
3    select d.name as Department,e.name as Employee,e.salary as Salary,dense_rank() over(partition by e.departmentId order by e.salary desc) as rnk from employee e JOIN department d on e.departmentID=d.id
4)t where rnk<=3 order by Salary desc,employee;