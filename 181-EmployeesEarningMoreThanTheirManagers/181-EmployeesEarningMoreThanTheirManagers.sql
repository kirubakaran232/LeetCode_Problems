-- Last updated: 5/25/2026, 7:21:11 PM
-- Write your MySQL query statement below
SELECT e.name AS Employee
FROM Employee e, Employee a
WHERE e.managerId = a.id
  AND e.salary > a.salary;