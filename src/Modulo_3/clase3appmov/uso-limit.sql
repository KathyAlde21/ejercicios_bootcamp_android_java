-- para recibir una candidad de datos especifica uso  LIMIT
SELECT nombre_columna FROM nombre_tabla LIMIT 10;

-- LIMIT
SELECT *
FROM country
WHERE Continent = 'Europe'
LIMIT 10; -- muestra los 10 primeros - si el número es más grande que los datos no arroja error

SELECT *
FROM country
WHERE Continent = 'Europe'; -- muestra 46 datos

SELECT *
FROM country
WHERE Continent = 'Europe'
ORDER BY LifeExpectancy DESC
LIMIT 10; 
