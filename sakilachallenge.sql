# 1 List all actors.
SELECT * FROM ACTOR;

# 2 Find the surname of the actor with the forename 'John'.
SELECT * FROM actor WHERE first_name="John";

# 3 Find all actors with surname 'Neeson'.
SELECT * FROM actor WHERE LAST_NAME = "Neeson";

# 4 Find all actors with ID numbers divisible by 10.
SELECT * FROM actor WHERE (actor_id % 10) = 0;

# 5 What is the description of the movie with an ID of 100?
SELECT description FROM film WHERE film_id = 100;

# 6 Find every R-rated movie.
SELECT TITLE, RATING FROM FILM WHERE RATING = "R";

# 7 Find every non-R-rated movie.
SELECT TITLE, RATING FROM FILM WHERE RATING != "R";

# 8 Find the ten shortest movies.
SELECT title, length FROM FILM ORDER BY LENGTH ASC LIMIT 10;

# 9 Find the movies with the longest runtime, without using LIMIT.
SELECT title 
FROM film 
WHERE length=(
	SELECT max(length) 
	FROM FILM 
    WHERE length>="185"
    );

# 10 Find all movies that have deleted scenes.
SELECT title FROM film WHERE special_features="Deleted Scenes";

# 11 Using HAVING, reverse-alphabetically list the last names that are not repeated.
SELECT LAST_name FROM actor GROUP BY last_name HAVING count(last_name) = 1 ORDER BY last_name DESC;

# 12 Using HAVING, list the last names that appear more than once, from highest to lowest frequency.
SELECT LAST_name, count(last_name) as NumberOfOccurence FROM actor GROUP BY last_name HAVING count(last_name) > 1 ORDER BY count(last_name) DESC;

# 13 Which actor has appeared in the most films?
SELECT FIRST_NAME, MAX(FILM_INFO) FROM ACTOR_INFO; 

#SELECT f.actor_id, a.first_name, a.last_name, COUNT(f.actor_id)
#FROM film_actor f
#JOIN actor a ON f.actor_id=a.actor_id
#GROUP BY f.actor_id
#ORDER BY COUNT(f.actor_id) DESC
#LIMIT 1;

# 14 When is 'Academy Dinosaur' due?
SELECT DATE_ADD(r.rental_date, INTERVAL f.rental_duration DAY) FROM RENTAL r JOIN FILM f ON f.film_id=r.rental_id where r.rental_id =1;

# 15 What is the average runtime of all films?
SELECT AVG(LENGTH) FROM FILM;

# 16 List the average runtime for every film category.
SELECT CATEGORY,AVG(LENGTH) FROM FILM_LIST GROUP BY CATEGORY;

# 17 List all movies featuring a robot.
SELECT title FROM film WHERE description LIKE '%Robot%';

# 18 How many movies were released in 2010?
SELECT title, release_year FROM film WHERE release_year = "2010";

# 19 Find the titles of all the horror movies.
SELECT title, category FROM film_list WHERE category = "Horror";

# 20 List the full name of the staff member with the ID of 2.
SELECT first_name,last_name FROM staff WHERE staff_id = 2;

# 21 List all the movies that Fred Costner has appeared in.
SELECT first_name, last_name, film_info FROM actor_info WHERE first_name = "Fred" AND last_name = "Costner";

# 22 SELECT DISTINCT count(country) FROM country;
SELECT DISTINCT count(country) FROM country;

# 23 List the name of every language in reverse-alphabetical order.
SELECT name FROM language ORDER BY name DESC;

# 24 List the full names of every actor whose surname ends with '-son' in alphabetical order by their forename.
SELECT first_name, last_name FROM actor WHERE last_name LIKE "%son" ORDER BY first_name ASC;

# 25 Which category contains the most films?
SELECT category,COUNT(CATEGORY) FROM FILM_LIST GROUP BY CATEGORY ORDER BY COUNT(CATEGORY) DESC LIMIT 2;

# 25 2ND solution using join 
SELECT f.category,COUNT(c.category_id) as catid
FROM film_list f
JOIN film_category c ON f.fid=c.film_id GROUP BY f.category ORDER BY catid DESC LIMIT 2;