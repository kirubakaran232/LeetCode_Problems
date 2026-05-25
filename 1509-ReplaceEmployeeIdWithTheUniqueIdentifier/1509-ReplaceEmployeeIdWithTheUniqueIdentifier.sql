-- Last updated: 5/25/2026, 7:15:21 PM
# Write your MySQL query statement below
select 
eu.unique_id as unique_id, e.name as name
from Employees e left join EmployeeUNI eu on e.id = eu.id