1# Write your MySQL query statement below
2select p.project_id,round(avg(e.experience_years),2) as  average_years from Project p
3left join Employee e on e.employee_id=p.employee_id
4group by p.project_id;
5