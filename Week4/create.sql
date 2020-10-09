create database week4;
use week4;

create table orders (
	id int(50) primary key not null,
	userEmail varchar(100) not null,
	total int(50) not null,
	orderDate varchar(100) not null,
	orderProduct int(50)
);

create table product (
	id int(50) primary key not null,
	name varchar(100) not null,
	description varchar(100) not null,
	price int(50) not null,
	isAvailable bit,
	id_subCategory int(50),
	id_Category int(50)
);

create table subCategory (
	id int(50) primary key not null,
	name varchar(100) not null,
	isAvailable bit,
	id_category int(50)
);

create table users (
	id int(50) primary key not null,
	name varchar(100) not null,
	password varchar(100) not null,
	email varchar(100)  not null
);

create table category (
	id int(50) primary key not null,
	name varchar(100) not null,
	isAvailable bit,
	id_subCategory int(50)
);

alter table orders
add foreign key (orderProduct) references product (id);

alter table product
add foreign key (id_subCategory) references subCategory (id);
alter table product
add foreign key (id_Category) references subCategory (id);

alter table category
add foreign key (id_subCategory) references subCategory (id);

alter table subCategory
add foreign key (id_category) references category (id);