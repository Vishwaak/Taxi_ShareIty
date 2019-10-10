create table users(
  username varchar(255) PRIMARY KEY,
  email varchar(255) UNIQUE,
  password varchar(255),
  name varchar(255)

);

insert into users(username, email, password,name) values ('espoand','aaa@bbb.com','helloWorld','Andrea');
