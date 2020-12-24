use week10;

insert into articles (description, title)
     values ('its good pen', 'pen');
insert into articles (description, title)
     values ('its good car', 'car');
insert into articles (description, title)
     values ('its good chair', 'chair');
insert into articles (description, title)
     values ('its good telephone', 'telephone');
insert into articles (description, title)
     values ('its good laptop', 'laptop');

insert into categories (is_available, name)
     values (1, 'school');
insert into categories (is_available, name)
     values (1, 'clothes');
insert into categories (is_available, name)
     values (1, 'transports');
insert into categories (is_available, name)
     values (1, 'furniture');
insert into categories (is_available, name)
     values (0, 'gadgets');

insert into roles (authority)
     values ('ROLE_ADMIN');
insert into roles (authority)
     values ('ROLE_USER');

insert into users (username, password, role)
     values ('admin', 'admin', 'ROLE_ADMIN');
insert into users (username, password, role)
     values ('user', 'user', 'ROLE_USER');

insert into sub_categories (name, is_available, category_id)
     values ('books', 0, 1);
insert into sub_categories (name, is_available, category_id)
     values ('chancellery', 1, 1);
insert into sub_categories (name, is_available, category_id)
     values ('coat', 0, 2);
insert into sub_categories (name, is_available, category_id)
     values ('jacket', 1, 2);
insert into sub_categories (name, is_available, category_id)
     values ('car', 1, 3);
insert into sub_categories (name, is_available, category_id)
     values ('bicycle', 0, 3);
insert into sub_categories (name, is_available, category_id)
     values ('kitchen', 1, 4);
insert into sub_categories (name, is_available, category_id)
     values ('restaraunt', 0, 4);
insert into sub_categories (name, is_available, category_id)
     values ('laptop', 1, 5);
insert into sub_categories (name, is_available, category_id)
     values ('telephone', 0, 5);

