-- Last updated: 5/25/2026, 7:07:19 PM
# Write your MySQL query statement below
SELECT product_id, product_name,description
FROM products
WHERE description REGEXP 'SN[0-9]{4}-[0-9]{4}( |$)'
ORDER BY product_id