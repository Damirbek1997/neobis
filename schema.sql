create database week10;
use week10;

create table articles (
    id int(50) primary key auto_increment,
    title varchar(100) not null,
    description varchar(100) not null
);

create table orders (
    id int(50) primary key auto_increment,
    username varchar(100) not null,
    total int(50) not null,
    order_date varchar(100) not null,
    product_id int(50)
);

create table products (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    price int(50) not null,
    is_available BIT not null default 0,
    article_id int(50),
    sub_category_id int(50),
    category_id int(50)
);

create table users (
    id int(50) primary key auto_increment,
    username varchar(100) not null,
    password varchar(100) not null,
    role varchar(100) default 'ROLE_USER'
);

create table sub_categories (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    is_available BIT not null default 0,
    category_id int(50) not null
);

create table categories (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    is_available BIT not null default 0
);

create table roles (
    id int(50) primary key auto_increment,
    authority varchar(100) not null,
    CONSTRAINT UQ_Roles UNIQUE (authority)
);

alter table orders
        add FOREIGN KEY (product_id) REFERENCES products (id);

alter table products
        add FOREIGN KEY (article_id) REFERENCES orders (id);
alter table products
        add FOREIGN KEY (sub_category_id) REFERENCES sub_categories (id);
alter table products
        add FOREIGN KEY (category_id) REFERENCES categories (id);

alter table users
        add FOREIGN KEY (role) REFERENCES roles (authority);

alter table sub_categories
        add FOREIGN KEY (category_id) REFERENCES categories (id);

