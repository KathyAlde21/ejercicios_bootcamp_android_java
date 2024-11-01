USE world;
-- Utilizando la BBDD world
-- 1)	crea la consulta que permita obtener una lista con todos los países de Sudamérica y sus respectivas ciudades
SELECT co.Name AS 'pais', Continent AS 'continente', c.Name AS 'ciudad'
FROM country co
INNER JOIN city c
ON co.code = c.countryCode
WHERE Continent = 'South America';

-- 2)	crea una consulta que retorne el nombre de cada País y el idioma oficial que lo representa.
SELECT co.Name AS 'pais', cl.Language AS 'idioma_oficial'
FROM country co
INNER JOIN countrylanguage cl
ON co.code = cl.countryCode
WHERE IsOfficial = 'T';

-- // ----------------------------------------------------------------------------------------------------------------
USE sakila;
-- Utilizando la BBDD sakila
-- 3)	crea una tabla que muestre el nombre de todas las películas, el idioma y la categoría a la que pertenece.

SELECT f.title AS 'nombre_pelicula', l.name AS 'idioma_pelicula', c.name AS 'categoria_pelicula'
FROM film f
JOIN language l -- 1
ON f.language_id = l.language_id
JOIN film_category fc -- 2
ON f.film_id = fc.film_id
JOIN category c -- 3
ON fc.category_id = c.category_id;

-- 4)	crea una consulta que nos muestre el nombre y el apellido del actor en una sola columna, además, todas
-- las películas en las que ha participado y la duración de cada una de ellas. Ordena los actores alfabéticamente.

SELECT CONCAT(a.first_name, ' ', a.last_name) AS 'nombre_actor',
	f.title AS 'pelicula',
    f.length AS 'duracion'
FROM actor a
JOIN film_actor fa
ON fa.actor_id = a.actor_id
JOIN film f
ON fa.film_id = f.film_id
ORDER BY a.first_name ASC;

-- 5)	modifica la consulta anterior y muestra una pequeña tabla de dos columnas. 
	-- A)	La primera va a mantener el nombre y apellido del actor
    -- B)	la segunda ahora debe mostrar la cantidad de películas en las que participó.
	-- C)	La tabla debe mostrar primero al actor que ha participado en la mayor cantidad de películas
    
SELECT CONCAT(a.first_name, ' ', a.last_name) AS 'nombre_actor',
	   COUNT(fa.film_id) AS 'cantidad_actuaciones_peliculas'
FROM actor a
JOIN film_actor fa
ON fa.actor_id = a.actor_id
GROUP BY a.actor_id
ORDER BY COUNT(fa.film_id) DESC;
