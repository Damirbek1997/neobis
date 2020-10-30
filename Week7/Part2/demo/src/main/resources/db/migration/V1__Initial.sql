create table users (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    password varchar(100) not null,
    email varchar(100)  not null
);
insert into users (id, name, password, email) values (1, 'damir', 'damir', 'damir@mail.ru');
insert into users (id, name, password, email) values (2, 'rapkat', 'rapkat', 'rapkat@mail.ru');