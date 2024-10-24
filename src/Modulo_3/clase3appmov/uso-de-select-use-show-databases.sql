-- consulta los datos de una tabla
SELECT * FROM nombre_tabla; -- llamar la tabla completa
SELECT nombre_columna FROM nombre_tabla; -- llamar 1 columna

USE sakila;

SELECT * FROM city;

SELECT * FROM country;

--//---------
USE WORLD;

SELECT * FROM countrylanguage;

-- llamando sakila sin salir de world
SELECT * FROM sakila.film;

-- muestra una lista de todas las bases de datos
SHOW DATABASES;

SELECT Name, CountryCode FROM city;
