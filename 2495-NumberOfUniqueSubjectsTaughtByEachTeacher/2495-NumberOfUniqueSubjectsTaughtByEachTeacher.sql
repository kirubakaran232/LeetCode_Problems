-- Last updated: 5/25/2026, 7:11:05 PM
# Write your MySQL query statement below
select teacher_id, count(distinct(subject_id)) as cnt
from Teacher
group by teacher_id