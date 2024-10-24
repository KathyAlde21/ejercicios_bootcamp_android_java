-- FILTRADO:
-- MAX(column) = retorna número máximo dentro de la columna
-- MIN(column) = retorna número mínimo dentro de la columna
-- COUNT(column) = cuenta cantidad de datos almacenados en una columna
-- SUM(column) = suma de todos los datos almacenados en una columna
-- AVG(column) = promedio de todos los datos almacenados en una columna

-- //-----------------
-- MAX(column)
SELECT MAX(LifeExpectancy)
FROM country; -- elige el máximo entre toda la tabla / 83.5

-- MIN(column)


-- COUNT(column)
SELECT COUNT(*)
FROM country; -- 239 datos

SELECT COUNT(*)
FROM sakila.film; -- 1000 datos

-- SUM(column)
SELECT SUM(Population)
FROM country; -- 6078749450

-- AVG(column)
SELECT AVG(Population)
FROM country; -- 26201506.2500

-- // -----------------------------------------------------------------------------
-- con AS le doy un alias // se puede anotar de 4 formas diferentes:
-- 1)
SELECT AVG(Population) AS 'Promedio'
FROM country;

-- 2)
SELECT AVG(Population) AS Promedio
FROM country;

-- 3)
SELECT AVG(Population) Promedio
FROM country;

-- 4)
SELECT AVG(Population) 'Promedio Total'
FROM country;
