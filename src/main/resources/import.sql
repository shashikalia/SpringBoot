insert into user_login(employee_id, user_name, password) values (1, 'john', 'john@123');
insert into user_login(employee_id, user_name, password) values (2, 'martin', 'martin@123');
insert into user_login(employee_id, user_name, password) values (3, 'usher', 'usher@123');

insert into department(department_name, location, function) values ('Networking', 'D1', 'Network');
insert into department(department_name, location, function) values ('IT', 'D2', 'IT Issues');
insert into department(department_name, location, function) values ('Sales', 'D3', 'Revenue');
insert into employee(department_id, name, designation, contact_number) values (1, 'John', 'Network Specialist', '+3246598434');
insert into employee(department_id, name, designation, contact_number) values (2, 'Martin', 'Product Manager', '+3234324455');
insert into employee(department_id, name, designation, contact_number) values (3, 'Usher', 'BU Head', '+3212345678');
