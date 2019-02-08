DROP SCHEMA IF EXISTS example;
CREATE SCHEMA example;

CREATE TABLE example.situation (
  name  VARCHAR(30) NOT NULL PRIMARY KEY
);

CREATE TABLE example.attraction (
  attraction_id INTEGER PRIMARY KEY,
  situation  VARCHAR(30) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
  FOREIGN KEY (situation) REFERENCES example.situation(name)
);
CREATE SEQUENCE example.attraction_id;