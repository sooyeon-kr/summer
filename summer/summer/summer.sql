CREATE TABLE room(
  id INT NOT NULL AUTO_INCREMENT,
    type VARCHAR(100) NOT NULL,
    price INT NOT NULL,
    capacity SMALLINT,
    PRIMARY KEY (id)
);