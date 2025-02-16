select p.firstName,p.lastName,city,state
From Person p left join Address A
on p.personid = A.personid
