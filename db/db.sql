create database test;
use test;
create table roles
(
	id int primary key auto_increment,
    `name` varchar(150)
);

create table users
(
	id int primary key auto_increment,
    `name` nvarchar(150),
    username varchar(150),
    `password` varchar(150),
    enabled bit
);

create table users_roles
(
	user_id int,
    role_id int,
    foreign key (user_id) references users(id),
    foreign key (role_id) references roles(id),
    primary key(user_id, role_id)
);

insert into roles(name) values('ROLE_USER'), ('ROLE_ADMIN')