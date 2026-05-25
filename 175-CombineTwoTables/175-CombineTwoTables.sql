-- Last updated: 5/25/2026, 7:21:16 PM
# Write your MySQL query statement below
SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM Person
LEFT JOIN Address ON Person.personId=Address.personId;