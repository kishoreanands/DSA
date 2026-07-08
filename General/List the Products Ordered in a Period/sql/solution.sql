1# Write your MySQL query statement below
2
3SELECT p.product_name AS product_name, sum(o.unit) AS unit FROM Products p
4JOIN Orders o USING (product_id)
5WHERE YEAR(o.order_date)='2020' AND MONTH(o.order_date)='02'
6GROUP BY p.product_id
7HAVING SUM(o.unit)>=100