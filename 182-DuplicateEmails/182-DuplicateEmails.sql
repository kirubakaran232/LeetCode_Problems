-- Last updated: 5/25/2026, 7:21:09 PM
SELECT email FROM Person
GROUP BY email
HAVING COUNT(email) > 1;