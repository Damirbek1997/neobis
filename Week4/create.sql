create database week4;
use week4;

create table cards (
    id int(50) primary key not null,
    cardNumber varchar(100) not null,
    id_user int(50)
);

create table articles (
    id int(50) primary key not null,
    title varchar(100) not null,
    description varchar(100) not null,
    id_product int(50),
    id_subCategory int(50),
    id_category int(50)
);

create table orders (
	id int(50) primary key not null,
	userEmail varchar(100) not null,
	total int(50) not null,
	orderDate varchar(100) not null,
	id_orderProduct int(50),
	id_card int(50)
);

create table products (
	id int(50) primary key not null,
	name varchar(100) not null,
	description varchar(100) not null,
	price int(50) not null,
	isAvailable bit,
	id_article int(50),
	id_subCategory int(50),
	id_category int(50)
);

create table users (
	id int(50) primary key not null,
	name varchar(100) not null,
	password varchar(100) not null,
	email varchar(100)  not null,
	id_card int(50)
);

create table subCategories (
	id int(50) primary key not null,
	name varchar(100) not null,
	isAvailable bit,
	id_category int(50)
);

create table categories (
	id int(50) primary key not null,
	name varchar(100) not null,
	isAvailable bit,
	id_subCategory int(50)
);

alter table cards
add foreign key (id_user) references users (id);

alter table articles
add foreign key (id_product) references products (id);
alter table articles
add foreign key (id_subCategory) references subCategories (id);
alter table articles
add foreign key (id_category) references categories (id);

alter table orders
add foreign key (id_orderProduct) references products (id);
alter table orders
add foreign key (id_card) references cards (id);

alter table products
add foreign key (id_subCategory) references subCategories (id);
alter table products
add foreign key (id_category) references categories (id);
alter table products
add foreign key (id_article) references articles (id);

alter table users
add foreign key (id_card) references cards (id);

alter table subCategories
add foreign key (id_category) references categories (id);

alter table categories
add foreign key (id_subCategory) references subCategories (id);