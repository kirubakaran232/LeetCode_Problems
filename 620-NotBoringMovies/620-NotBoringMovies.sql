-- Last updated: 5/25/2026, 7:18:37 PM
select * from Cinema 
where id %2 =1 
AND 
description != "boring" 
order by rating DESC;