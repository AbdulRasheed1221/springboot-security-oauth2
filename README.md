# springboot-security-oauth2

URL: http://localhost:8080/oauth/token
basic authentication :
username : abdul-client
password : abdul-secret

http://localhost:8080/users/user?access_token=562dd9d1-eab1-4ac5-8c0e-b35f2df5eeed



CREATE TABLE tbl_user (
  id bigint(20) NOT NULL,
  username varchar(25) NOT NULL,
  password varchar(75) NOT NULL,
  salary bigint(10) NOT NULL,
  age int(2) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO tbl_user (id, username, password, salary, age) VALUES (1, 'abdul', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 3456, 33);
INSERT INTO tbl_user (id, username, password, salary, age) VALUES (2, 'rasheed', '$2a$04$PCIX2hYrve38M7eOcqAbCO9UqjYg7gfFNpKsinAxh99nms9e.8HwK', 7823, 23);
INSERT INTO tbl_user (id, username, password, salary, age) VALUES (3, 'shaik', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4234, 45);
INSERT INTO tbl_user (id, username, password, salary, age) VALUES (4, 'user1', '$2a$04$I9Q2sDc4QGGg5WNTLmsz0.fvGv3OjoZyj81PrSFyGOqMphqfS2qKu', 4234, 40);


