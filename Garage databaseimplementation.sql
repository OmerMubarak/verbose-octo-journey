CREATE DATABASE Garage;

SHOW DATABASES;

USE GARAGE;
SHOW TABLES;

DESCRIBE BIKES;
DESCRIBE CARS;

DROP TABLE BIKES;
DROP TABLE CARS;

SELECT * FROM BIKES;
SELECT * FROM CARS;


CREATE TABLE Cars (
    brand varchar(100) NOT NULL,
    colour varchar(100) NOT NULL,
    ranges int NOT NULL,
    wheels smallint NOT NULL,
    power int NOT NULL
    );
CREATE TABLE Bikes (
    brand varchar(100) NOT NULL,
    colour varchar(100) NOT NULL,
    ranges int NOT NULL,
    cc int NOT NULL,
    sideCar boolean NOT NULL
    );
