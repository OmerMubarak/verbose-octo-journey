SHOW databases;
USE world;
SHOW TABLES;
SELECT * FROM city;
DESCRIBE CITY;
SELECT * FROM country;
DESCRIbE COUNTRY;
SELECT * FROM Countrylanguage;
DESCRIBE countrylanguage;

SELECT name, lifeexpectancy FROM country WHERE lifeexpectancy IS NOT NULL ORDER BY lifeexpectancy ASC Limit 1;

SELECT COUNT(INDEPYEAR) FROM COUNTRY WHERE INDEPYEAR IS NOT NULL;
SELECT (count)IndepYear FROM Country;



SELECT c.name, l.countrycode
FROM countrylanguage l
JOIN country c ON l.countrycode=c.code=(
	SELECT COUNT(*)
    FROM COUNTRYLANGUAGE group by language order by count(*)
    LIMIT 10
    );

SELECT  countrycode, Language, count(*) FROM countrylanguage group by language ORDER BY count(*) DESC Limit 10;

SELECT DISTINCT LANGUAGE, count(language) as Frequency FROM countrylanguage GROUP BY language ORDER BY Frequency DESC limit 10;