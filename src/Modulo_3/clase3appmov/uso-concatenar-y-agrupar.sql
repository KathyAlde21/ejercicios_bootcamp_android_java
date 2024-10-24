-- CONCATENAR COLUMNAS	
-- CONCAT = muestra dos o más datos en una misma columna
SELECT CONCAT(columna1, columna2, ...) AS alias FROM nombre_tabla;

SELECT CONCAT(first_name, last_name) AS 'Nombre Completo'
FROM actor; -- retorna 200 datos pegados

SELECT CONCAT(first_name, ' ', last_name) AS 'Nombre Completo'
FROM actor; -- los concatena con espacio entre datos

-- // --------------------------------------------------
-- AGRUPAR DATOS
-- GROUP BY = permite agrupar datos para hacer consultas complejas
SELECT nombre_columna, COUNT(nombre_columna) FROM nombre_tabla GROUP BY nombre_columna;

USE world;

SELECT IndepYear, COUNT(IndepYear) Total
FROM country
GROUP BY IndepYear
ORDER BY IndepYear DESC; -- en este caso es cuantas veces se repitio cada año ordenando los años - 89 datos
