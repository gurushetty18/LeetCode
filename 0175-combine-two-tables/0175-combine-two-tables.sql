/* Write your PL/SQL query statement below */
select 
p.firstName , 
p.lastName , 
a.city ,
a.state 
From 
Person p ,
Address a 
where p.personId = a.personId(+);