create table students (
    id          bigserial primary key,
    name       varchar(255),
    age       int
);

insert into students (name, age) values
('Student1', 18),
('Student2', 19)
('Student3', 20)
('Student4', 21)