-- Last updated: 5/25/2026, 7:13:02 PM
# Write your MySQL query statement below
SELECT user_id, MAX(time_stamp) AS last_stamp FROM Logins WHERE 
YEAR(time_stamp) = '2020' GROUP BY user_id;