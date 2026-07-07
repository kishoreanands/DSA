# Write your MySQL query statement below
SELECT d.name as Department,e.name as Employee,e.salary as Salary FROM Employee e
left join Department d 
on d.id=e.departmentId  
where e.salary=(select max(salary) from Employee e where e.departmentId=d.id);

