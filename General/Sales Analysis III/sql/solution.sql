1# Write your MySQL query statement below
2select p.product_id,p.product_name from Product p
3left join Sales s on p.product_id=s.product_id
4group by p.product_id,p.product_name
5having min(s.sale_date)>='2019-01-01'
6and max(s.sale_date)<= '2019-03-31';