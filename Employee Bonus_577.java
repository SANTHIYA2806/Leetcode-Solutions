# Write your MySQL query statement below
select name,bonus
from employee e left join bonus b
on e.empid = b.empid
where ifnull(bonus,0)<1000;
