create database week5;
use week5;

create table cards (
    id int(50) primary key auto_increment,
    card_number varchar(100) not null,
    user_id int(50)
);

create table articles (
    id int(50) primary key auto_increment,
    title varchar(100) not null,
    description varchar(100) not null,
    product_id int(50),
    sub_category_id int(50),
    category_id int(50)
);

create table orders (
    id int(50) primary key auto_increment,
    user_email varchar(100) not null,
    total int(50) not null,
    order_date varchar(100) not null,
    order_product_id int(50),
    card_id int(50)
);

create table products (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    description varchar(100) not null,
    price int(50) not null,
    is_available bit,
    article_id int(50),
    sub_category_id int(50),
    category_id int(50)
);

create table users (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    password varchar(100) not null,
    email varchar(100)  not null,
    card_id int(50)
);

create table sub_categories (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    is_available bit,
    category_id int(50)
);

create table categories (
    id int(50) primary key auto_increment,
    name varchar(100) not null,
    is_available bit,
    sub_category_id int(50)
);

alter table cards
add foreign key (user_id) references users (id);

alter table articles
add foreign key (product_id) references products (id);
alter table articles
add foreign key (sub_category_id) references sub_categories (id);
alter table articles
add foreign key (category_id) references categories (id);

alter table orders
add foreign key (order_product_id) references products (id);
alter table orders
add foreign key (card_id) references cards (id);

alter table products
add foreign key (sub_category_id) references sub_categories (id);
alter table products
add foreign key (category_id) references categories (id);
alter table products
add foreign key (article_id) references articles (id);

alter table users
add foreign key (card_id) references cards (id);

alter table sub_categories
add foreign key (category_id) references categories (id);

alter table categories
add foreign key (sub_category_id) references sub_categories (id);
