# Write your MySQL query statement below
select (select DISTINCT salary as SecondHighestSalary
from Employee 
ORDER BY salary DESC
limit 1 offset 1
) as SecondHighestSalary ;