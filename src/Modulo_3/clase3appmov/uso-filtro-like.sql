-- LIKE
-- va junto al WHERE y busca elementos especificos según patrón
SELECT nombre_columna FROM nombre_tabla WHERE condicion LIKE '%patron';

SELECT Name, Continent, LifeExpectancy
FROM country
WHERE Continent LIKE '%America'
ORDER BY LifeExpectancy DESC; -- retorna 51 datos

SELECT Name, Region, LifeExpectancy
FROM country
WHERE Region LIKE '%and'
ORDER BY LifeExpectancy DESC; -- llama todo lo que tiene escrito ands en el nombre sin importar donde

SELECT Name, Region, LifeExpectancy
FROM country
WHERE Region LIKE '% and %'
ORDER BY LifeExpectancy DESC; -- busca los ands pero con espacio antes y después

