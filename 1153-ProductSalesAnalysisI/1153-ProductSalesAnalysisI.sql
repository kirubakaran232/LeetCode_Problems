-- Last updated: 5/25/2026, 7:16:44 PM
# Write your MySQL query statement below
SELECT p.product_name, s.year, s.price
FROM Sales AS s
LEFT JOIN Product AS p
ON s.product_id = p.product_id;