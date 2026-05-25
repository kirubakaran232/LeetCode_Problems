-- Last updated: 5/25/2026, 7:07:23 PM
# Write your MySQL query statement below
SELECT user_id,email
FROM Users
WHERE email REGEXP '^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$';