-- Last updated: 5/25/2026, 7:21:03 PM
# Write your MySQL query statement below
SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;