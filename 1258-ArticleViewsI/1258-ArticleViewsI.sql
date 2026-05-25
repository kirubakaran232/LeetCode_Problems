-- Last updated: 5/25/2026, 7:16:23 PM
# Write your MySQL query statement below

select distinct author_id as id from Views
where author_id = viewer_id 
order by id;