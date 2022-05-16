create schema kruger

create table kruger.profile(
profile_id smallint,
profile_name text
);

INSERT INTO kruger.profile
(profile_id, profile_name)
VALUES(1, 'Admin'),(2,'Employee');

 alter table kruger.profile
 add constraint profile_unique
 unique (profile_id);

create sequence kruger.user_id_sequence 
increment 1
minvalue 1 
maxvalue 10000 
start 1;


create table kruger.users(
user_id integer default nextval('kruger.user_id_sequence') primary key ,
user_name text not null,
user_password text not null,
prof_id smallint not null,
foreign key (prof_id) references kruger.profile (profile_id)
);

create sequence kruger.employee_id_sequence 
increment 1
minvalue 1 
maxvalue 10000 
start 1;

create table kruger.employee (
employee_id integer default nextval('kruger.employee_id_sequence') primary key ,
employee_dni integer not null,
employee_name text not null,
employee_lastname text not null,
employee_email text not null,
employee_birthday date,
employee_address text,
employee_cellphone integer,
employee_vaccine_state boolean,
employee_vaccine_type text,
employee_vaccine_date date,
employee_vaccine_dosis smallint,
user_id integer,
foreign key (user_id) references kruger.users(user_id)
);

INSERT INTO kruger.users
(user_name, user_password, prof_id)
VALUES('Admin1', 'admin1234', 1);

--select u.*, p.profile_name from kruger.users u
--join kruger.profile p 
--on u.prof_id = p.profile_id 



