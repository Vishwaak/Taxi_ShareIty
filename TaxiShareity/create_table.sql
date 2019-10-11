create table users(
  username varchar(255) PRIMARY KEY,
  email varchar(255) UNIQUE,
  password varchar(255),
  name varchar(255),
  surname varchar(255),
  contact_no varchar(255) UNIQUE ,
  user_type ENUM('STUDENT','DRIVER') NOT NULL
  ;


);

insert into users(username, email, password,name) values ('espoand','aaa@bbb.com','helloWorld','Andrea');

