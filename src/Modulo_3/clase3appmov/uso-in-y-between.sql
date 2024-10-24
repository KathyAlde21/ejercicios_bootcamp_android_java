-- FILTRAR POR DATO DIRECTO
-- IN()
SELECT nombre_columna FROM nombre_tabla WHERE nombre_columna IN('dato1', 'dato2');

USE sakila;

SELECT *
FROM actor;

SELECT *
FROM actor
WHERE last_name
IN('CAGE'); -- 2 datos

SELECT *
FROM actor
-- WHERE last_name = 'CAGE';
WHERE last_name = 'cage';  -- 2 datos // no afecta si es mínuscula o mayúscula

SELECT *
FROM actor
WHERE last_name
IN('CAGE'); -- 2 datos

SELECT *
FROM actor
WHERE last_name
IN('cage', 'wood', 'tracy'); -- 6 datos

-- // -----------------------------
-- FILTRAR DATOS ENTRE UN VALOR Y OTRO
-- BETWEEN crea un rando entre dos datos números y muestra todos los que están en medio

SELECT nombre_columna FROM nombre_tabla BETWEEN num_min AND num_max;

SELECT *
FROM film
WHERE length
BETWEEN 70 AND 120; -- muestra 377 datos

SELECT *
FROM film
WHERE length
BETWEEN 70 AND 120
ORDER BY length DESC;


