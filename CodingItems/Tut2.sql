SHOW databases;

USE world;
USE sakila;
SHOW tables;
Describe Payment;
DESCRIBE film;
Describe Actor_info;
SELECT * FROM Actor_info;
SELECT * FROM payment;
SELECT MAX(amount) FROM payment WHERE customer_id ORDER BY MAX(amount) DESC; 
SELECT AVG(length) FROM film WHERE title LIKE 'ana%'; 
SELECT title,MAX(LENGTH) FROM film GROUP BY title ORDER BY MAX(LENGTH) DESC; #MAX LENGTH
SELECT AVG(LENGTH) FROM film; #AVG LENGTH

SELECT film_id, title, description, release_year
FROM FILM
WHERE film_id=MAX(length);


USE world;
SELECT name,MIN(population) FROM city; #city with lowest population
SELECT name,MAX(population) FROM city; #MAX POP
SELECT COUNT(ID) FROM CITY; #COUNT ALL CITIES
DESCRIBE city;
DESCRIBE COUNTRY;
SELECT * FROM city WHERE population > 110000 ORDER BY population DESC;
SELECT * FROM city WHERE District LIKE'EA%';

SELECT COUNT(id) from city;

SELECT * 
FROM city
WHERE population=(
	SELECT MAX(population)
    FROM city
    );
    
SELECT name, population
FROM COUNTRY	
WHERE population=(
	SELECT min(population)
    FROM country
    );
    
SELECT name, lifeexpectancy
FROM COUNTRY
WHERE lifeEXpectancy=(
	SELECT MIN(lifeexpectancy)
    FROM country
    );
    
SELECT NAME, surfacearea
FROM country
WHERE SurfaceArea=(
	SELECT MAX(surfacearea)
    FROM country
    );
    
SELECT *
FROM country
WHERE surfacearea=(
	SELECT MIN(surfacearea)
    FROM country
    );
    
    


SELECT Name, CountryCode FROM city;

SELECT customer_lastname FROM customer;