SHOW DATABASES;
USE sakila;
USE some_database;
SHOW TABLES;
DESCRIBE actor;
SELECT * FROM games;
SELECT * FROM staff;
SELECT * FROM store;
SELECT * FROM FILM_LIST;
SELECT * FROM ACTOR;
SELECT * FROM ACTOR_INFO;
SELECT * FROM RENTAL;
SELECT * FROM INVENTORY;
SELECT * FROM film_category;
SELECT * FROM COUNTRY;
SELECT * FROM LANGUAGE;
DESCRIBE RENTAL;
DESCRIBE INVENTORY;
DESCRIBE games;

SELECT max(category_count) FROM(
 SELECT COUNT(f.category_id) as category_count FROM f.film_category GROUP BY f.category_id) as calc1;
 
 #f film_list +  c film_category
SELECT f.category,COUNT(c.category_id) as catid
FROM film_list f
JOIN film_category c ON f.fid=c.film_id GROUP BY f.category ORDER BY catid DESC LIMIT 2;

describe COUNTRY;


