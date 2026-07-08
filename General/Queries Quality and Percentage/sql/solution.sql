1# Write your MySQL query statement below
2select query_name, 
3round(avg(rating/position),2)quality,
4round((sum(case when rating<3 then 1 else 0 end) / count(*)) * 100,2)  poor_query_percentage from Queries 
5group by query_name
6;