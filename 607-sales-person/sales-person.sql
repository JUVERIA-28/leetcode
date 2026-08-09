# Write your MySQL query statement below
select name from SalesPerson where sales_id not in (select od.sales_id from Orders od join Company c on od.com_id = c.com_id where c.name='Red'); 
