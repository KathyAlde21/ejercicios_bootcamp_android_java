-- DISTINCT
-- junto a un select DISTINCT busca los datos distintos, elimina en el llamado los repetidos
SELECT DISTINCT nombre_columna FROM nombre_tabla; -- asi se escribe

USE world;

SELECT DISTINCT CountryCode FROM city; -- devuelve 232 datos

SELECT CountryCode FROM city; -- devuelve 4079 datos

SELECT * FROM city;


-- WHERE
-- para buscar en base a un criterio uso WHERE
SELECT nombre_columna FROM nombre_tabla WHERE criterio;

SELECT * FROM city WHERE CountryCode = 'CHL'; -- llamando solo datos de Chile devuelve 29 datos

-- se pueden separar hacia abajo para dar más orden, por ej:
SELECT Name 
FROM country
WHERE Continent = 'South America'; -- devuelve 14 datos

-- ahora aplico tres filtros pero solo para países sudamericanos
SELECT Code, Name, IndepYear 
FROM country
WHERE Continent = 'South America'; -- devuelve 14 datos
