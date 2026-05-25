-- Last updated: 5/25/2026, 7:21:14 PM
select
(select distinct Salary 
from Employee order by salary desc 
limit 1 offset 1) 
as SecondHighestSalary;