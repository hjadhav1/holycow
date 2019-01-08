create table bookInfo
(
Id varchar2(50) primary key,
Name varchar2(50),
link varchar2(50),
description varchar2(4000)
);

insert into bookInfo values (1,'The Lion','https://thelion.com','its all about lion');
insert into bookInfo values (2,'The Lion king','https://thelion.com','its all about lion');
insert into bookInfo values (3,'The tiger','https://thelion.com','its all about lion');
insert into bookInfo values (4,'The sasla','https://thelion.com','its all about lion');
insert into bookInfo values (5,'The giraffe','https://thelion.com','its all about lion');
commit;