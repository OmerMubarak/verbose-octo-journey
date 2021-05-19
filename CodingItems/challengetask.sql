#1 USING COUNT, GET NUMBER OF CITIES IN USA
SELECT count(ID) FROM CITY WHERE COUNTRYCODE="USA";

#2 Find out pop and life expectancy of Argentina
SELECT population, lifeexpectancy FROM country WHERE NAME = "Argentina";

#3 Using is not null, order by and limit, which country has highest life exp.
SELECT name, lifeexpectancy FROM country WHERE lifeexpectancy IS NOT NULL ORDER BY lifeexpectancy DESC LIMIT 4;

#4 using join ... on, find capital city of spain
SELECT i.name, o.name, o.capital, i.id
FROM city i 
JOIN country o ON o.capital=i.id WHERE o.name="Spain";

#5 using join ... on, list all languages spoken in south east asia region
SELECT c.name, l.language, c.region
FROM country c
JOIN countrylanguage l ON l.countrycode=c.code WHERE c.region = "Southeast Asia";

#6 Using a single query, list 25 cities around the world that start with F.
SELECT NAME FROM CITY WHERE NAME LIKE "F%" ORDER BY NAME LIMIT 25;

#7 Using COUNT and JOIN ... ON, get the number of cities in China.
SELECT count(i.id), c.name
FROM country c
JOIN city i ON i.countrycode=c.code WHERE c.name="China";

#8 Using IS NOT NULL, ORDER BY, and LIMIT, which country has the lowest population? Discard non-zero populations.
SELECT code,region,name, population FROM country WHERE population != "0" ORDER BY population ASC LIMIT 10;

#9 Using aggregate functions, return the number of countries the database contains.
SELECT count(code) FROM Country;

#10 What are the top ten largest countries by area?
SELECT name, surfacearea FROM Country ORDER BY SURFACEAREA DESC LIMIT 10;

#11 List the five largest cities by population in Japan.
SELECT * FROM city WHERE countrycode = "JPN" ORDER BY population DESC LIMIT 5;

#12 List the names and country codes of every country with Elizabeth II as its Head of State. You will need to fix the mistake first!
UPDATE COUNTRY 
SET headofstate="Elizabeth II"
WHERE headofstate="Elisabeth II";

SELECT code, name, headofstate FROM COUNTRY WHERE headofstate="Elizabeth II";

#13 List the top ten countries with the smallest population-to-area ratio. Discard any countries with a ratio of 0.
SELECT name, population, (population/surfacearea) as Ratio FROM COUNTRY WHERE population is not null and population !=0 ORDER BY Ratio ASC LIMIT 10;

#14 List every unique world language.
SELECT DISTINCT language FROM countrylanguage;

#15 List the names and GNP of the world's top 10 richest countries
SELECT GNP, NAME FROM COUNTRY ORDER BY GNP DESC LIMIT 10;

#16 List the names of, and number of languages spoken by, the top ten most multilingual countries.
SELECT DISTINCT LANGUAGE, count(language) as Frequency FROM countrylanguage GROUP BY language ORDER BY Frequency DESC limit 10;

#17 List every country where over 50% of its population can speak German.
SELECT co.name, l.language, l.percentage
FROM country co
JOIN countrylanguage l ON co.name="Germany" AND l.percentage>'50';

#18 Which country has the worst life expectancy? Discard zero or null values.
SELECT name, lifeexpectancy FROM country WHERE lifeexpectancy IS NOT NULL ORDER BY lifeexpectancy ASC Limit 1;

#19 List the top three most common government forms.
SELECT governmentform FROM country GROUP BY governmentform ORDER BY count(governmentform) limit 3;

#20 How many countries have gained independence since records began?
SELECT COUNT(INDEPYEAR) FROM COUNTRY WHERE INDEPYEAR IS NOT NULL;
