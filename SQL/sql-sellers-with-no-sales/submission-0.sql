-- Write your query below
select s.seller_name
from seller s

where s.seller_id not in(
    select o.seller_id
    from orders o
    where extract (year from o.sale_date)=2020
) 
order by s.seller_name;