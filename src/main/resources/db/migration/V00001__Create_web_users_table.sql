-- ensure that the table with this name is removed before creating a new one.
DROP TABLE IF EXISTS web_users;

-- Create web_users table
CREATE TABLE web_users (
   user_id INT PRIMARY KEY AUTO_INCREMENT,
   name VARCHAR(50),
   login VARCHAR(50),
   email VARCHAR(50)
);